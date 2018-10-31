// Generated from TigerLLK.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TigerLLKParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TigerLLKVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#hello}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHello(TigerLLKParser.HelloContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#tigerprogram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTigerprogram(TigerLLKParser.TigerprogramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#declarationsegment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationsegment(TigerLLKParser.DeclarationsegmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#typedeclarationlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedeclarationlist(TigerLLKParser.TypedeclarationlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#vardeclarationlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardeclarationlist(TigerLLKParser.VardeclarationlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#functdeclarationlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctdeclarationlist(TigerLLKParser.FunctdeclarationlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#typedeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedeclaration(TigerLLKParser.TypedeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDtype}
	 * labeled alternative in {@link TigerLLKParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDtype(TigerLLKParser.IDtypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link TigerLLKParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(TigerLLKParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code recordType}
	 * labeled alternative in {@link TigerLLKParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordType(TigerLLKParser.RecordTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pointerType}
	 * labeled alternative in {@link TigerLLKParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerType(TigerLLKParser.PointerTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#fieldlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldlist(TigerLLKParser.FieldlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#typeid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeid(TigerLLKParser.TypeidContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#vardeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardeclaration(TigerLLKParser.VardeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#idlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdlist(TigerLLKParser.IdlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#itail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItail(TigerLLKParser.ItailContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#optionalinit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalinit(TigerLLKParser.OptionalinitContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#functdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctdeclaration(TigerLLKParser.FunctdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamlist(TigerLLKParser.ParamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#paramlisttail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamlisttail(TigerLLKParser.ParamlisttailContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#rettype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRettype(TigerLLKParser.RettypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(TigerLLKParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#statseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatseq(TigerLLKParser.StatseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#stail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStail(TigerLLKParser.StailContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letBlock}
	 * labeled alternative in {@link TigerLLKParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetBlock(TigerLLKParser.LetBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakCommand}
	 * labeled alternative in {@link TigerLLKParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakCommand(TigerLLKParser.BreakCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link TigerLLKParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(TigerLLKParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callFunction}
	 * labeled alternative in {@link TigerLLKParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunction(TigerLLKParser.CallFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignElement}
	 * labeled alternative in {@link TigerLLKParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignElement(TigerLLKParser.AssignElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifBlock}
	 * labeled alternative in {@link TigerLLKParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(TigerLLKParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileBlock}
	 * labeled alternative in {@link TigerLLKParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(TigerLLKParser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forBlock}
	 * labeled alternative in {@link TigerLLKParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(TigerLLKParser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifExitBlock}
	 * labeled alternative in {@link TigerLLKParser#statail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExitBlock(TigerLLKParser.IfExitBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code endBlock}
	 * labeled alternative in {@link TigerLLKParser#statail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndBlock(TigerLLKParser.EndBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function}
	 * labeled alternative in {@link TigerLLKParser#more}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(TigerLLKParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleAssigment}
	 * labeled alternative in {@link TigerLLKParser#more}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleAssigment(TigerLLKParser.MultipleAssigmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#ltail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtail(TigerLLKParser.LtailContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(TigerLLKParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(TigerLLKParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#le}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLe(TigerLLKParser.LeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#me}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMe(TigerLLKParser.MeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#lesser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLesser(TigerLLKParser.LesserContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#greater}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater(TigerLLKParser.GreaterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#noteq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoteq(TigerLLKParser.NoteqContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(TigerLLKParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(TigerLLKParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(TigerLLKParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(TigerLLKParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(TigerLLKParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(TigerLLKParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constant}
	 * labeled alternative in {@link TigerLLKParser#yeet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(TigerLLKParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varValue}
	 * labeled alternative in {@link TigerLLKParser#yeet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarValue(TigerLLKParser.VarValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression}
	 * labeled alternative in {@link TigerLLKParser#yeet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TigerLLKParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link TigerLLKParser#consta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(TigerLLKParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link TigerLLKParser#consta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(TigerLLKParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlist(TigerLLKParser.ExprlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#exprlisttail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlisttail(TigerLLKParser.ExprlisttailContext ctx);
	/**
	 * Visit a parse tree produced by {@link TigerLLKParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(TigerLLKParser.LvalueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link TigerLLKParser#lvaluetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(TigerLLKParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAttribute}
	 * labeled alternative in {@link TigerLLKParser#lvaluetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAttribute(TigerLLKParser.IdAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullTail}
	 * labeled alternative in {@link TigerLLKParser#lvaluetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullTail(TigerLLKParser.NullTailContext ctx);
}