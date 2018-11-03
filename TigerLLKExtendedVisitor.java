import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import java.lang.*;
import java.util.*;

public class TigerLLKExtendedVisitor extends TigerLLKBaseVisitor<Object> {
	private TigerSymbolTable curTable;

	@Override public Object visitTigerprogram(TigerLLKParser.TigerprogramContext ctx) {
		curTable = new TigerSymbolTable();
		return visitChildren(ctx);
	}

	@Override public Object visitTypedeclaration(TigerLLKParser.TypedeclarationContext ctx) {
		String newID = ctx.ID().getText();
		Object value = (Value)(visit(ctx.type()));
		if (curTable.getValue(((Value)value).getName()) != null) {
			curTable.assign(newID, curTable.getValue(((Value)value).getName()));
			return null;
		}
		curTable.assign(newID, value);
		Object test = (Value)curTable.getValue(newID);
		return value;
	}
	@Override public Object visitIDtype(TigerLLKParser.IDtypeContext ctx) {
		Value idValue;
		if (ctx.typeid().FLOAT() == null) {
			idValue = new Value("_literal", "int", null);
		} else {
			idValue = new Value("_literal", "float", null);
		}
		return idValue;
	}

	@Override public Object visitArrayType(TigerLLKParser.ArrayTypeContext ctx) {
		int arraySize = Integer.valueOf(ctx.INTLIT().getText());
		Value idValue;
		if (ctx.typeid().FLOAT() == null) {
			idValue = new Value("_array", "int", new int[arraySize]);
		} else {
			idValue = new Value("_array", "float", new float[arraySize]);
		}
		return idValue;
	}


	@Override public Object visitRecordType(TigerLLKParser.RecordTypeContext ctx) {
		Object listOfFields = (ArrayList<Value>)(visit(ctx.fieldlist()));
		Value recordValue = new Value("_record", "_record", listOfFields);
		return recordValue;
	}

	@Override public Object visitPointerType(TigerLLKParser.PointerTypeContext ctx) {
		if (curTable.getValue(ctx.ID().getText()) == null) {
			System.out.println("Type ID is undefined or out of scope. Goodbye");
			System.exit(1);
		}
		return (Value) (curTable.getValue(ctx.ID().getText()));
	}
	@Override public Object visitFieldlist(TigerLLKParser.FieldlistContext ctx) {
		if (ctx.ID() == null) {
			return new ArrayList<Value>();
		}
		Object list = (ArrayList<Value>) visit(ctx.fieldlist());
		String type = ctx.typeid().FLOAT() == null ? "int" : "float";
		((ArrayList<Value>)list).add(new Value(ctx.ID().getText(), type, null));
		return list;
	}
	@Override public Object visitVardeclaration(TigerLLKParser.VardeclarationContext ctx) {

		Object valueType = visit(ctx.type());

		if (curTable.getValue(((Value)valueType).getName()) != null) {
			valueType = (Value)curTable.getValue(((Value)valueType).getName());
		}
		String type = ((Value)valueType).getName();
		String literaltype;
		Value number;
		ArrayList<String> idList = (ArrayList<String>)((Value)visit(ctx.idlist())).getContent();
		switch(type) {
			case "_literal":
				literaltype = ((Value)valueType).getType();
				for (String id : idList) {

					if (curTable.getValue(id) != null) {
						System.out.println("Var already declared error");
						System.exit(1);
					}
					curTable.assign(id, new Value(id, literaltype, null));
				}
				System.out.println(literaltype);
				number = (Value)(visit(ctx.optionalinit()));

				if (number != null) {
					if (!literaltype.equals(number.getType())) {
						System.out.println("Mismatched type error");
						System.exit(1);
					}
					if (literaltype.equals("int")) {
						int x = (Integer) number.getContent();
						for (String id : idList) {
							Value undef = (Value)curTable.getValue(id);
							undef.setContent(new Integer(x));
						}

					} else {
						float x = (Float) number.getContent();
						for (String id : idList) {
							Value undef = (Value)curTable.getValue(id);
							undef.setContent(new Float(x));
						}
					}

				}
				break;

			case "_array":
				literaltype = ((Value)valueType).getType();
				int size;
				if (literaltype.equals("int")) {
					int[] arr = (int[])(((Value)valueType).getContent());
					size = arr.length;
				} else {
					float[] arr = (float[])(((Value)valueType).getContent());
					size = arr.length;
				}

				for (String id : idList) {

					if (curTable.getValue(id) != null) {
						System.out.println("Var already declared error");
						System.exit(1);
					}
					if (literaltype.equals("int")) {
						curTable.assign(id, new Value(id, literaltype, new int[size]));
					} else {
						curTable.assign(id, new Value(id, literaltype, new float[size]));
					}
				}
				number = (Value)visit(ctx.optionalinit());

			if (number != null) {
				if (!literaltype.equals(((Value)number).getType())) {
					System.out.println("Mismatched type error");
					System.exit(1);
				}
				if (literaltype.equals("int")) {
					int x = (Integer) number.getContent();
					for (String id : idList) {
						Value undef = (Value)curTable.getValue(id);
						int[] temp = (int[])undef.getContent();
						for (int i = 0; i < temp.length; i++) {
							temp[i] = x;
						}
					}
				} else {
					float x = (Float) number.getContent();
					for (String id : idList) {
						Value undef = (Value)curTable.getValue(id);
						float[] temp = (float[])undef.getContent();
						for (int i = 0; i < temp.length; i++) {
							temp[i] = x;
						}
					}
				}

			}
			break;
			case "_record":
				if (ctx.optionalinit() != null) {
					System.out.println("Can't assign records error");
					System.exit(1);
				}

				ArrayList<Value> temp = (ArrayList<Value>)((Value)valueType).getContent();
				ArrayList<Value> records = new ArrayList<Value>();
				for (Value record : temp) {
					records.add(new Value(record.getName(), record.getType(), null));
				}
				for (String id : idList) {
					if (curTable.getValue(id) != null) {
						System.out.println("Var already declared error");
						System.exit(1);
					}
					curTable.assign(id, new Value(id, "_record", records));
				}

				break;

			default:
				System.out.println("Invalid type");
		}

		for (String key : curTable.getTable().keySet()) {
			Value test = (Value)(curTable.getValue(key));
			float[] temp = (float[]) test.getContent();
			for(float i : temp) {
				System.out.println(i);
			}

		}



		return null;
	}
	@Override public Object visitIdlist(TigerLLKParser.IdlistContext ctx) {
		if (ctx.itail().COMMA() == null) {
			Value list = new Value(new ArrayList<String>());
			ArrayList<String> temp = (ArrayList<String>)list.getContent();
			temp.add(ctx.ID().getText());
			return list;
		}
		Value idList = (Value)visit(ctx.itail().idlist());
		ArrayList<String> temp = (ArrayList<String>)((Value)idList).getContent();
		String id = ctx.ID().getText();
		temp.add(ctx.ID().getText());
		return idList;
	}
	@Override public Object visitOptionalinit(TigerLLKParser.OptionalinitContext ctx) {
		 if (ctx.ASSIGN() != null) {
			 return visit(ctx.consta());
		 }
		 return null;
	 }
	@Override public Object visitFunctdeclaration(TigerLLKParser.FunctdeclarationContext ctx) {
		String funcname = ctx.ID().getText();
		curTable = curTable.newScope();
		ArrayList<Value> params = (ArrayList<Value>)visit(ctx.paramlist());
		String retType = (String) visit(ctx.rettype());
		TigerSymbolTable par = curTable.getParent();
		Value func = new Value(funcname);
		func.setParams(params);
		func.setType(retType);
		par.assign(funcname, func);
		Object val = visit(ctx.statseq());
		curTable = curTable.getParent();
		return val;
	}
	@Override public Object visitParamlist(TigerLLKParser.ParamlistContext ctx) {
		Value first;
		if (ctx.param() != null) {
			first = (Value)visit(ctx.param());
		} else {
			return null;
		}
		ArrayList<Value> listOfParams = (ArrayList<Value>)visit(ctx.paramlisttail());
		if (listOfParams != null) {
			listOfParams.add(first);
		} else {
			listOfParams = new ArrayList<Value>();
			listOfParams.add(first);
		}
		return listOfParams;
	}
	@Override public Object visitParamlisttail(TigerLLKParser.ParamlisttailContext ctx) {
		if (ctx.COMMA() == null) {
			return new ArrayList<Value>();
		}
		ArrayList<Value> list = (ArrayList<Value>) visit(ctx.paramlisttail());
		Value first = (Value)visit(ctx.param());
		((ArrayList<Value>)list).add(first);
		return list;
	}
	@Override public Object visitParam(TigerLLKParser.ParamContext ctx) {
		Value value = (Value)(visit(ctx.type()));
		if (curTable.getValue(((Value)value).getName()) != null) {
			return curTable.getValue(((Value)value).getName());
		}
		Value param = new Value(ctx.ID().getText(), value.getType());
		return param;
	}

	@Override public Object visitRettype(TigerLLKParser.RettypeContext ctx) {
		if (ctx.COLON() != null) {
			Value value = (Value)(visit(ctx.type()));
			if (curTable.getValue(((Value)value).getName()) != null) {
				return ((Value)curTable.getValue(((Value)value).getName())).getType();
			}
			return value.getType();
		}
		return null;
	}




	@Override public Object visitLetBlock(TigerLLKParser.LetBlockContext ctx) {
		curTable = curTable.newScope();
		visit(ctx.declarationsegment());
		Object retVal = visit(ctx.statseq());
		curTable = curTable.getParent();
		return retVal;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitBreakCommand(TigerLLKParser.BreakCommandContext ctx) {
		curTable = curTable.getParent();
		return null;
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitReturnStatement(TigerLLKParser.ReturnStatementContext ctx) {
		return visit(ctx.expr());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitCallFunction(TigerLLKParser.CallFunctionContext ctx) {
		if (curTable.getValue(ctx.ID().getText()) == null) {
			System.out.println("Function not defined");
			System.exit(1);
		}
		ArrayList<Value> params = (ArrayList<Value>)visit(ctx.exprlist());
		ArrayList<Value> func = (ArrayList<Value>)((Value)curTable.getValue(ctx.ID().getText())).getParams();
		if (params == func) {
			System.out.println("what");
			return null;
		}
		if (params == null && func != null || func == null && params != null) {
			System.out.println("Wrong params");
			System.exit(1);
		}
		if (params != null && func != null) {
			if (params.size() != func.size()) {
				System.out.println("Wrong params");
				System.exit(1);
			}
			for (int i = 0; i < params.size(); i++) {
				if (!params.get(i).getType().equals(func.get(i).getType())) {
					System.out.println("Wrong params");
					System.exit(1);
				}
			}
		}
		return ((Value)curTable.getValue(ctx.ID().getText()));
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitAssignElement(TigerLLKParser.AssignElementContext ctx) {
		Value rightvalue = (Value)visit(ctx.more());
		Value leftvalue = (Value)visit(ctx.lvalue());
		if (leftvalue != null && rightvalue != null) {
			if (!leftvalue.getType().equals(rightvalue.getType())) {
				System.out.println("Wrong types");
				System.exit(1);
			}
			leftvalue.setContent(rightvalue.getContent());
		}
		return leftvalue;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitIfBlock(TigerLLKParser.IfBlockContext ctx) {
		Value bol = (Value)visit(ctx.expr());
		if (!bol.getType().equals("int")) {
			System.out.println("Boolean has to be an int");
			System.exit(1);
		}
		if (bol.getContent().equals(new Integer(0))) {
			visit(ctx.statail());
		} else {
			curTable = curTable.newScope();
			visit(ctx.statseq());
			visit(ctx.statail());
		}
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitWhileBlock(TigerLLKParser.WhileBlockContext ctx) {
		Value bol = (Value)visit(ctx.expr());
		if (!bol.getType().equals("int")) {
			System.out.println("Boolean has to be an int");
			System.exit(1);
		}
		if (bol.getContent().equals(new Integer(0))) {
			visit(ctx.statseq());
		} else {
			curTable = curTable.newScope();
			visit(ctx.statseq());
			curTable = curTable.getParent();
		}
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitForBlock(TigerLLKParser.ForBlockContext ctx) {
 		if (!((Value)visit(ctx.expr(0))).getType().equals("int") && !((Value)visit(ctx.expr(1))).getType().equals("int")) {
			System.out.println("Invalid for loop setup");
			System.exit(1);
		}
		int x = ((Integer)((Value)visit(ctx.expr(0))).getContent());
		int y = ((Integer)((Value)visit(ctx.expr(1))).getContent());

		while (x < y) {
			curTable = curTable.newScope();
			visit(ctx.statseq());
			curTable = curTable.getParent();
		}
		return null;

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitIfExitBlock(TigerLLKParser.IfExitBlockContext ctx) {
		curTable = curTable.getParent();
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitEndBlock(TigerLLKParser.EndBlockContext ctx) {
		curTable = curTable.getParent();
		curTable = curTable.newScope();
		visit(ctx.statseq());
		curTable = curTable.getParent();
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitFunction(TigerLLKParser.FunctionContext ctx) {
		if (curTable.getValue(ctx.ID().getText()) == null) {
			System.out.println("Function not defined");
			System.exit(1);
		}
		ArrayList<Value> params = (ArrayList<Value>)visit(ctx.exprlist());
		ArrayList<Value> func = (ArrayList<Value>)((Value)curTable.getValue(ctx.ID().getText())).getParams();
		if (params == func) {
			System.out.println("what");
			return null;
		}
		if (params == null && func != null || func == null && params != null) {
			System.out.println("Wrong params");
			System.exit(1);
		}
		if (params != null && func != null) {
			if (params.size() != func.size()) {
				System.out.println("Wrong params");
				System.exit(1);
			}
			for (int i = 0; i < params.size(); i++) {
				if (!params.get(i).getType().equals(func.get(i).getType())) {
					System.out.println("Wrong params");
					System.exit(1);
				}
			}
		}
		return ((Value)curTable.getValue(ctx.ID().getText()));
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitMultipleAssigment(TigerLLKParser.MultipleAssigmentContext ctx) {

		return visitChildren(ctx);
	}
	@Override public Object visitLtail(TigerLLKParser.LtailContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExpr(TigerLLKParser.ExprContext ctx) {
		
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitAnd(TigerLLKParser.AndContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitLe(TigerLLKParser.LeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitMe(TigerLLKParser.MeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitLesser(TigerLLKParser.LesserContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitGreater(TigerLLKParser.GreaterContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitNoteq(TigerLLKParser.NoteqContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitEqual(TigerLLKParser.EqualContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitMinus(TigerLLKParser.MinusContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitPlus(TigerLLKParser.PlusContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitDiv(TigerLLKParser.DivContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitMult(TigerLLKParser.MultContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExp(TigerLLKParser.ExpContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitConstant(TigerLLKParser.ConstantContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitVarValue(TigerLLKParser.VarValueContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExpression(TigerLLKParser.ExpressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitIntLiteral(TigerLLKParser.IntLiteralContext ctx) {
		Value intval = new Value(new Integer(ctx.INTLIT().getText()));
		intval.setType("int");
		return intval;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitFloatLiteral(TigerLLKParser.FloatLiteralContext ctx) {
		Value floatval = new Value(new Float(ctx.FLOATLIT().getText()));
		floatval.setType("float");
		return floatval;
	}
	@Override public Object visitExprlist(TigerLLKParser.ExprlistContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExprlisttail(TigerLLKParser.ExprlisttailContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitLvalue(TigerLLKParser.LvalueContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitArrayAccess(TigerLLKParser.ArrayAccessContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitIdAttribute(TigerLLKParser.IdAttributeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitNullTail(TigerLLKParser.NullTailContext ctx) { return visitChildren(ctx); }

}
