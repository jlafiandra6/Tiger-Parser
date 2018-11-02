// Generated from TigerLLK.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

/**
 * This class provides an empty implementation of {@link TigerLLKVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class IRGENERATIONVISITOR<T> extends AbstractParseTreeVisitor<T> implements TigerLLKVisitor<T> {
	private String loop= "loop_label";
	private int loopNum  = 0;
	private int currentScope = 0;
	private int justStarted = 1;
	private int currentTemp = 0;
	private int assigning = 0;
	private int intList = ;
	private LinkedList<String> lastif = new LinkedList<>();
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitHello(TigerLLKParser.HelloContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTigerprogram(TigerLLKParser.TigerprogramContext ctx) {
		this.visit(ctx.getChild(2));
		this.visit(ctx.getChild(5));
		System.out.println("return, , , ");
		System.out.println("#end_function main");
		return (T)"asdf";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDeclarationsegment(TigerLLKParser.DeclarationsegmentContext ctx) {
		T yuh = visitChildren(ctx);

		if(justStarted == 1){
			System.out.println("#start_function main");
			System.out.println("void main():");

			System.out.println("main:");
			justStarted = 0;
		}
		return yuh;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTypedeclarationlist(TigerLLKParser.TypedeclarationlistContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVardeclarationlist(TigerLLKParser.VardeclarationlistContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFunctdeclarationlist(TigerLLKParser.FunctdeclarationlistContext ctx) {
		return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTypedeclaration(TigerLLKParser.TypedeclarationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitIDtype(TigerLLKParser.IDtypeContext ctx) {

		return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitArrayType(TigerLLKParser.ArrayTypeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitRecordType(TigerLLKParser.RecordTypeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPointerType(TigerLLKParser.PointerTypeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFieldlist(TigerLLKParser.FieldlistContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTypeid(TigerLLKParser.TypeidContext ctx) {


		return (T) ctx.getChild(0); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVardeclaration(TigerLLKParser.VardeclarationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitIdlist(TigerLLKParser.IdlistContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitItail(TigerLLKParser.ItailContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitOptionalinit(TigerLLKParser.OptionalinitContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFunctdeclaration(TigerLLKParser.FunctdeclarationContext ctx) {
		System.out.println("#start_function " +ctx.ID());
		String type = "void";
		String typer = (String)this.visit(ctx.getChild(5));
		if(typer != ""){
			System.out.println(typer +" "+ ctx.ID() + "(" + this.visit(ctx.getChild(3))+ ") :");
		} else{
			System.out.println(type +" "+ ctx.ID() + "(" + this.visit(ctx.getChild(3))+ ") :");
		}

		this.visit(ctx.getChild(7));
		System.out.println("return, , , ");
		System.out.println("#end_function " +ctx.ID());
		return (T)""; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitParamlist(TigerLLKParser.ParamlistContext ctx) {
		if(ctx.getChildCount() != 0){
			String first = (String) this.visit(ctx.getChild(0));
			String others = (String) this.visit(ctx.getChild(1));
			first = first+others;
			return  (T) first;
		} else{
			return (T)"";
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitParamlisttail(TigerLLKParser.ParamlisttailContext ctx) {
		if(ctx.getChildCount() != 0){
			String first = (String)this.visit(ctx.getChild(1));
			String others = (String)this.visit(ctx.getChild(2));
			first = ", " + first +others;
			return (T) first;
		}
		return (T)"";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitRettype(TigerLLKParser.RettypeContext ctx) {
		if(ctx.getChildCount() != 0){
			String first = (String)this.visit(ctx.getChild(1));
			return (T) first;
		}
		return (T)"";

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitParam(TigerLLKParser.ParamContext ctx) {
		String name = ctx.ID().toString();
		 name = this.visit(ctx.getChild(2)) + " "+ name;
		return (T) name;

		}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStatseq(TigerLLKParser.StatseqContext ctx) {
		return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStail(TigerLLKParser.StailContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLetBlock(TigerLLKParser.LetBlockContext ctx) {
		currentScope++;
		return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBreakCommand(TigerLLKParser.BreakCommandContext ctx) {
		System.out.println( "goto, "+ lastif.pop());

		return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitReturnStatement(TigerLLKParser.ReturnStatementContext ctx) {
		System.out.println("return, "+ (String)this.visit(ctx.getChild(1)) + ", , ");
		return (T)"";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//TODO
	@Override public T visitCallFunction(TigerLLKParser.CallFunctionContext ctx) {
		System.out.println("call, "+ctx.ID() + ", " + (String) this.visit(ctx
				.getChild(2)));
		return (T)"";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAssignElement(TigerLLKParser.AssignElementContext ctx) {

		if(ctx.getChildCount() == 5){
			String[] arr = (String[])this.visit(ctx.getChild(2));
			System.out.println("callr, "+arr[0] + ", " + (String) arr[1]);
			return (T)"";
		} else{
			assigning = 1;
			String squad = (String)this.visit(ctx.getChild(2));
			assigning = 1;
			String baller = (String)this.visit(ctx.getChild(0));
			if(baller.charAt(0) == '!'){
				baller = baller.replace("#", squad);
				baller = baller.replace("!", "");
				System.out.println(baller);
			} else{
				System.out.println("assign, " +baller+", " +
						squad );
			}
			assigning = 0;
			return (T) "";
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitIfBlock(TigerLLKParser.IfBlockContext ctx) {
		int temphere = currentTemp;
		currentTemp++;
		int loop1 = loopNum;
		loopNum++;
		int loop2 = loopNum;
		loopNum++;
		int loop3 = loopNum;
		loopNum++;
		System.out.println( "assign, "+ "$t"+Integer.toString
		(temphere) + ", 0");
		System.out.println((String)this.visit(ctx.getChild(1)) +", "+ loop + Integer.toString(loop1));
		System.out.println( "assign, "+ "$t"+Integer.toString
				(temphere) + ", 1");
		System.out.println(loop + Integer.toString(loop1) + ":");
		System.out.println("breq, $t"+temphere +", 0, "+loop + Integer.toString(loop2));
		loopNum++;
		this.visit(ctx.getChild(3));
		System.out.println( "goto, "+ loop + Integer.toString(loop3));
		System.out.println(loop + Integer.toString(loop2) + ":");
		this.visit(ctx.getChild(4));
		System.out.println(loop + Integer.toString(loop3) + ":");
		return (T)"";
		}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitWhileBlock(TigerLLKParser.WhileBlockContext ctx) {

		int loop1 = loopNum;
		loopNum++;
		int loop2 = loopNum;
		loopNum++;
		lastif.push(loop + Integer.toString(loop2));
		System.out.println(loop + Integer.toString(loop1) + ":");
		System.out.println((String)this.visit(ctx.getChild(1)) +", "+ loop + Integer.toString(loop2));
		T exit = this.visit(ctx.getChild(3));
		System.out.println("goto, " + loop + Integer.toString(loop1));
		System.out.println(loop + Integer.toString(loop2) + ":");
		lastif.remove((String)(loop + Integer.toString(loop2)));
		return (T)"";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitForBlock(TigerLLKParser.ForBlockContext ctx) {
		int loop1 = loopNum;
		loopNum++;
		int loop2 = loopNum;
		loopNum++;
		lastif.push(loop + Integer.toString(loop2));

		System.out.println( "assign, "+ Integer.toString(currentScope) +ctx.ID
				()+ ", "+ this.visit(ctx.getChild(3)));
		System.out.println(loop + Integer.toString(loop1) + ":");
		System.out.println("brgt, " + Integer.toString(currentScope)+ctx.ID()
				+ ", " + this.visit(ctx.getChild(5)) +", "+ loop +
				Integer.toString(loop2));
		T exit = this.visit(ctx.getChild(7));
		System.out.println("add, " + Integer.toString(currentScope)+ctx.ID()
				+ ", 1, " + Integer.toString(currentScope)+ctx.ID());
		System.out.println("goto, " + loop + Integer.toString(loop1));
		System.out.println(loop + Integer.toString(loop2) + ":");
		lastif.remove((String)(loop + Integer.toString(loop2)));
		return exit;

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitIfExitBlock(TigerLLKParser.IfExitBlockContext ctx) {


		return (T)"";

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitEndBlock(TigerLLKParser.EndBlockContext ctx) {
		return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFunction(TigerLLKParser.FunctionContext ctx) {
		assigning = 0;
		String[] bob = {ctx.ID().toString(),(String)this.visit(ctx.getChild(2))};
		return (T)bob; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMultipleAssigment(TigerLLKParser.MultipleAssigmentContext ctx) {
		// String geegee = (String)this.visit(ctx.getChild(1));

			String yuh[] = (String[]) this.visit(ctx.getChild(0));
			assigning = 0;
			String finalvalue = (String)this.visit(ctx.getChild(1));
			if(yuh[0] != "!"){
				if(yuh[1].charAt(0) == '!'){
					yuh[1] = yuh[1].replace("#", finalvalue);
					yuh[1] =  yuh[1].replace("!", "");
					System.out.println(yuh[1]);
					yuh[1] = finalvalue;
				} else{
					System.out.println("assign, " + yuh[1]  +", " + finalvalue);
				}

				if((String)yuh[0] == "#"){
					return (T) yuh[1];
				} else{
					return (T)yuh[0];
				}
			} else{
				return (T) finalvalue;
			}


		}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLtail(TigerLLKParser.LtailContext ctx) {
		if(ctx.getChildCount() > 0){
			String yuh[] = (String[]) this.visit(ctx.getChild(2));
			if(yuh[0] == "!"){
				String[] finalvalue = {"#",(String)this.visit(ctx.getChild(0))};
				return (T) finalvalue;
			} else{
				if(yuh[0] == "#"){
					yuh[0] = (String)this.visit(ctx.getChild(0));
					if(yuh[0].charAt(0) == '!'){
						yuh[0] =yuh[0].replace("#", yuh[1]);
						yuh[0] =yuh[0].replace("!", "");
						System.out.println(yuh[0]);
						yuh[0] = "#";
					} else{
						System.out.println("assign, " + yuh[0] +", " + yuh[1]);
					}
					return (T)yuh;
				} else{
					String lul = (String)this.visit(ctx.getChild(0));
					if(lul.charAt(0) == '!'){
						lul = lul.replace("#", yuh[0]);
						lul =lul.replace("!", "");
						System.out.println(lul);
					} else{
						System.out.println("assign, " + lul +", " + yuh[0]);
						yuh[0] = lul;
					}

					return (T)yuh;

				}

			}

		} else{
			String[] memes = {"!"};
			return (T)memes;
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExpr(TigerLLKParser.ExprContext ctx) {
		int sunshine = (ctx.getChildCount() / 2);

		if(sunshine > 0){

			System.out.println("or, "+ this.visit(ctx.getChild(0)) + ", " +
					this.visit(ctx.getChild(2))+", $t"+Integer.toString
					(currentTemp));
			int finaltemp = currentTemp;
			currentTemp++;
			for(int i = 4; i < ctx.getChildCount(); i++){
				System.out.println("or, $t"+ Integer.toString
						(currentTemp - 1) +
						", " +
						this.visit(ctx.getChild(i))+", $t"+Integer.toString
						(currentTemp));
				finaltemp = currentTemp;
				currentTemp++;
				i=i+2;
			}
			return (T)("$t" + Integer.toString(finaltemp));
		}else{
			return visitChildren(ctx);

		} }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAnd(TigerLLKParser.AndContext ctx) {
		int sunshine = (ctx.getChildCount() / 2);

		if(sunshine > 0){

			System.out.println("and, "+ this.visit(ctx.getChild(0)) + ", " +
					this.visit(ctx.getChild(2))+", $t"+Integer.toString
					(currentTemp));
			int finaltemp = currentTemp;
			currentTemp++;
			for(int i = 4; i < ctx.getChildCount(); i++){
				System.out.println("and, $t"+ Integer.toString
						(currentTemp - 1) +
						", " +
						this.visit(ctx.getChild(i))+", $t"+Integer.toString
						(currentTemp));
				finaltemp = currentTemp;
				currentTemp++;
				i=i+2;
			}
			return (T)("$t" + Integer.toString(finaltemp));
		}else{
			return visitChildren(ctx);

		} }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLe(TigerLLKParser.LeContext ctx) {

		int sunshine = (ctx.getChildCount() / 2);

		if(sunshine > 0){

			String baller = (String)("brgeq, "+ (String)this.visit(ctx.getChild(0)) + ", " +
					(String)this.visit(ctx.getChild(2)));
			return (T)baller;
		}else{
			return visitChildren(ctx);

		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMe(TigerLLKParser.MeContext ctx) {
		int sunshine = (ctx.getChildCount() / 2);

		if(sunshine > 0){

			String baller = (String)("brleq, "+ (String)this.visit(ctx.getChild(0)) + ", " +
					(String)this.visit(ctx.getChild(2)));
			return (T)baller;
		}else{
			return visitChildren(ctx);

		} }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLesser(TigerLLKParser.LesserContext ctx) {

		int sunshine = (ctx.getChildCount() / 2);

		if(sunshine > 0){

			String baller = (String)("brgt, "+ (String)this.visit(ctx.getChild(0)) + ", " +
					(String)this.visit(ctx.getChild(2)));
			return (T)baller;
		}else{
			return visitChildren(ctx);

		}}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitGreater(TigerLLKParser.GreaterContext ctx) {
		int sunshine = (ctx.getChildCount() / 2);

		if(sunshine > 0){

			String baller = (String)("brlt, "+ (String)this.visit(ctx.getChild(0)) + ", " +
					(String)this.visit(ctx.getChild(2)));
			return (T)baller;
		}else{
			return visitChildren(ctx);

		}}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitNoteq(TigerLLKParser.NoteqContext ctx) {
		int sunshine = (ctx.getChildCount() / 2);

		if(sunshine > 0){

			String baller = (String)("breq, "+ (String)this.visit(ctx.getChild(0)) + ", " +
					(String)this.visit(ctx.getChild(2)));
			return (T)baller;
		}else{
			return visitChildren(ctx);

		} }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitEqual(TigerLLKParser.EqualContext ctx) {
		int sunshine = (ctx.getChildCount() / 2);

		if(sunshine > 0){

			String baller = (String)("brneq, "+ (String)this.visit(ctx.getChild(0)) + ", " +
					(String)this.visit(ctx.getChild(2)));
			return (T)baller;
		}else{
			return visitChildren(ctx);

		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMinus(TigerLLKParser.MinusContext ctx) { int sunshine = (ctx.getChildCount() / 2);

		if(sunshine > 0){

			System.out.println("sub, "+ this.visit(ctx.getChild(0)) + ", " +
					this.visit(ctx.getChild(2))+", $t"+Integer.toString
					(currentTemp));
			int finaltemp = currentTemp;
			currentTemp++;
			for(int i = 4; i < ctx.getChildCount(); i++){
				System.out.println("sub, $t"+ Integer.toString
						(currentTemp - 1) +
						", " +
						this.visit(ctx.getChild(i))+", $t"+Integer.toString
						(currentTemp));
				finaltemp = currentTemp;
				currentTemp++;
				i=i+2;
			}
			return (T)("$t" + Integer.toString(finaltemp));
		}else{
			return visitChildren(ctx);

		}}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPlus(TigerLLKParser.PlusContext ctx) {
		int sunshine = (ctx.getChildCount() / 2);

		if(sunshine > 0){

			System.out.println("add, "+ this.visit(ctx.getChild(0)) + ", " +
					this.visit(ctx.getChild(2))+", $t"+Integer.toString
					(currentTemp));
			int finaltemp = currentTemp;
			currentTemp++;
			for(int i = 4; i < ctx.getChildCount(); i++){
				System.out.println("add, $t"+ Integer.toString
						(currentTemp - 1) +
						", " +
						this.visit(ctx.getChild(i))+", $t"+Integer.toString
						(currentTemp));
				finaltemp = currentTemp;
				currentTemp++;
				i=i+2;
			}
			return (T)("$t" + Integer.toString(finaltemp));
		}else{
			return visitChildren(ctx);

		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDiv(TigerLLKParser.DivContext ctx) {
		int sunshine = (ctx.getChildCount() / 2);

		if(sunshine > 0){

			System.out.println("div, "+ this.visit(ctx.getChild(0)) + ", " +
					this.visit(ctx.getChild(2))+", $t"+Integer.toString
					(currentTemp));
			int finaltemp = currentTemp;
			currentTemp++;
			for(int i = 4; i < ctx.getChildCount(); i++){
				System.out.println("div, $t"+ Integer.toString
						(currentTemp - 1) +
						", " +
						this.visit(ctx.getChild(i))+", $t"+Integer.toString
						(currentTemp));
				finaltemp = currentTemp;
				currentTemp++;
				i=i+2;
			}
			return (T)("$t" + Integer.toString(finaltemp));
		}else{
			return visitChildren(ctx);

		}}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMult(TigerLLKParser.MultContext ctx) {
		int sunshine = (ctx.getChildCount() / 2);

		if(sunshine > 0){

			System.out.println("mult, "+ this.visit(ctx.getChild(0)) + ", " +
					this.visit(ctx.getChild(2))+", $t"+Integer.toString
					(currentTemp));
			int finaltemp = currentTemp;
			currentTemp++;
			for(int i = 4; i < ctx.getChildCount(); i++){
				System.out.println("mult, $t"+ Integer.toString
						(currentTemp - 1) +
						", " +
						this.visit(ctx.getChild(i))+", $t"+Integer.toString
						(currentTemp));
				finaltemp = currentTemp;
				currentTemp++;
				i=i+2;
			}
			return (T)("$t" + Integer.toString(finaltemp));
		}else{
			return visitChildren(ctx);

		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExp(TigerLLKParser.ExpContext ctx) {
		int sunshine = (ctx.getChildCount() / 2);

		if(sunshine > 0){

			System.out.println("exp, "+ this.visit(ctx.getChild(0)) + ", " +
					this.visit(ctx.getChild(2))+", $t"+Integer.toString
					(currentTemp));
			int finaltemp = currentTemp;
			currentTemp++;
			for(int i = 4; i < ctx.getChildCount(); i++){
				System.out.println("exp, $t"+ Integer.toString
						(currentTemp - 1) +
						", " +
						this.visit(ctx.getChild(i))+", $t"+Integer.toString
						(currentTemp));
				finaltemp = currentTemp;
				currentTemp++;
				i=i+2;
			}
			return (T)("$t" + Integer.toString(finaltemp));
		}else{
			return visitChildren(ctx);

		}}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitConstant(TigerLLKParser.ConstantContext ctx) {

		return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVarValue(TigerLLKParser.VarValueContext ctx) {

		return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExpression(TigerLLKParser.ExpressionContext ctx) {

		return this.visit(ctx.getChild(1)); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitIntLiteral(TigerLLKParser.IntLiteralContext ctx) {
		return (T) ctx.INTLIT().toString(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFloatLiteral(TigerLLKParser.FloatLiteralContext ctx) {
		return (T) ctx.FLOATLIT().toString(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExprlist(TigerLLKParser.ExprlistContext ctx) {
		if(ctx.getChildCount() != 0){
			String first = (String) this.visit(ctx.getChild(0));
			String others = (String) this.visit(ctx.getChild(1));
			first = first+others;
			return  (T) first;
		} else{
			return (T)"";
		}

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExprlisttail(TigerLLKParser.ExprlisttailContext ctx) {
		if(ctx.getChildCount() != 0){
			String first = (String)this.visit(ctx.getChild(1));
			String others = (String)this.visit(ctx.getChild(2));
			first = first + others;
			return (T) first;
		}
		return (T)"";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLvalue(TigerLLKParser.LvalueContext ctx) {
		if(ctx.getChild(1).getChildCount() == 3){
			String[] hello = (String[])visitChildren(ctx);
			if(hello[0] == "!"){
				assigning = 1;
				return (T)("!array_store,"+Integer.toString(currentScope) + ctx.ID().toString()+","+(String)hello[1]+", # ");
			}
			String yuh = hello[0].replace("#",Integer
					.toString(currentScope) + ctx.ID
					());
			System.out.println(yuh);
			return (T)hello[1];
		} else{
			return (T)(Integer.toString(currentScope) + ctx.ID() + (String)visitChildren(ctx));
		}

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitArrayAccess(TigerLLKParser.ArrayAccessContext ctx) {
		if(assigning == 0){
			String pass = "array_load, $t" + Integer.toString(currentTemp)+ ", #, "
					+ this.visit(ctx.getChild(1));
			String[] ree = {pass,"$t" + Integer.toString(currentTemp)};
			currentTemp++;

			return (T)ree;
		} else{
			assigning = 0;
			String[] gee ={"!",(String)this.visit(ctx.getChild(1))};
			return (T)gee;
		}

		}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitIdAttribute(TigerLLKParser.IdAttributeContext ctx) {
		return (T)("." + ctx.ID().toString()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitNullTail(TigerLLKParser.NullTailContext ctx) {
		return (T)"" ; }
}