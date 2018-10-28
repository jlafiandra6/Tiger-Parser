// Generated from Tiger.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TigerParser}.
 */
public interface TigerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TigerParser#tigerprogram}.
	 * @param ctx the parse tree
	 */
	void enterTigerprogram(TigerParser.TigerprogramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#tigerprogram}.
	 * @param ctx the parse tree
	 */
	void exitTigerprogram(TigerParser.TigerprogramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#declarationsegment}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationsegment(TigerParser.DeclarationsegmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#declarationsegment}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationsegment(TigerParser.DeclarationsegmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#typedeclarationlist}.
	 * @param ctx the parse tree
	 */
	void enterTypedeclarationlist(TigerParser.TypedeclarationlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#typedeclarationlist}.
	 * @param ctx the parse tree
	 */
	void exitTypedeclarationlist(TigerParser.TypedeclarationlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#vardeclarationlist}.
	 * @param ctx the parse tree
	 */
	void enterVardeclarationlist(TigerParser.VardeclarationlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#vardeclarationlist}.
	 * @param ctx the parse tree
	 */
	void exitVardeclarationlist(TigerParser.VardeclarationlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#functdeclarationlist}.
	 * @param ctx the parse tree
	 */
	void enterFunctdeclarationlist(TigerParser.FunctdeclarationlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#functdeclarationlist}.
	 * @param ctx the parse tree
	 */
	void exitFunctdeclarationlist(TigerParser.FunctdeclarationlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#typedeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypedeclaration(TigerParser.TypedeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#typedeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypedeclaration(TigerParser.TypedeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(TigerParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(TigerParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#fieldlist}.
	 * @param ctx the parse tree
	 */
	void enterFieldlist(TigerParser.FieldlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#fieldlist}.
	 * @param ctx the parse tree
	 */
	void exitFieldlist(TigerParser.FieldlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#typeid}.
	 * @param ctx the parse tree
	 */
	void enterTypeid(TigerParser.TypeidContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#typeid}.
	 * @param ctx the parse tree
	 */
	void exitTypeid(TigerParser.TypeidContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#vardeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVardeclaration(TigerParser.VardeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#vardeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVardeclaration(TigerParser.VardeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#idlist}.
	 * @param ctx the parse tree
	 */
	void enterIdlist(TigerParser.IdlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#idlist}.
	 * @param ctx the parse tree
	 */
	void exitIdlist(TigerParser.IdlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#itail}.
	 * @param ctx the parse tree
	 */
	void enterItail(TigerParser.ItailContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#itail}.
	 * @param ctx the parse tree
	 */
	void exitItail(TigerParser.ItailContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#optionalinit}.
	 * @param ctx the parse tree
	 */
	void enterOptionalinit(TigerParser.OptionalinitContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#optionalinit}.
	 * @param ctx the parse tree
	 */
	void exitOptionalinit(TigerParser.OptionalinitContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#functdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctdeclaration(TigerParser.FunctdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#functdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctdeclaration(TigerParser.FunctdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void enterParamlist(TigerParser.ParamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void exitParamlist(TigerParser.ParamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#paramlisttail}.
	 * @param ctx the parse tree
	 */
	void enterParamlisttail(TigerParser.ParamlisttailContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#paramlisttail}.
	 * @param ctx the parse tree
	 */
	void exitParamlisttail(TigerParser.ParamlisttailContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#rettype}.
	 * @param ctx the parse tree
	 */
	void enterRettype(TigerParser.RettypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#rettype}.
	 * @param ctx the parse tree
	 */
	void exitRettype(TigerParser.RettypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(TigerParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(TigerParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#statseq}.
	 * @param ctx the parse tree
	 */
	void enterStatseq(TigerParser.StatseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#statseq}.
	 * @param ctx the parse tree
	 */
	void exitStatseq(TigerParser.StatseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#stail}.
	 * @param ctx the parse tree
	 */
	void enterStail(TigerParser.StailContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#stail}.
	 * @param ctx the parse tree
	 */
	void exitStail(TigerParser.StailContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#ltail}.
	 * @param ctx the parse tree
	 */
	void enterLtail(TigerParser.LtailContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#ltail}.
	 * @param ctx the parse tree
	 */
	void exitLtail(TigerParser.LtailContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#btail}.
	 * @param ctx the parse tree
	 */
	void enterBtail(TigerParser.BtailContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#btail}.
	 * @param ctx the parse tree
	 */
	void exitBtail(TigerParser.BtailContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#statail}.
	 * @param ctx the parse tree
	 */
	void enterStatail(TigerParser.StatailContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#statail}.
	 * @param ctx the parse tree
	 */
	void exitStatail(TigerParser.StatailContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(TigerParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(TigerParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#statendy}.
	 * @param ctx the parse tree
	 */
	void enterStatendy(TigerParser.StatendyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#statendy}.
	 * @param ctx the parse tree
	 */
	void exitStatendy(TigerParser.StatendyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#tail2}.
	 * @param ctx the parse tree
	 */
	void enterTail2(TigerParser.Tail2Context ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#tail2}.
	 * @param ctx the parse tree
	 */
	void exitTail2(TigerParser.Tail2Context ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#tail3}.
	 * @param ctx the parse tree
	 */
	void enterTail3(TigerParser.Tail3Context ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#tail3}.
	 * @param ctx the parse tree
	 */
	void exitTail3(TigerParser.Tail3Context ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TigerParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TigerParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#exprtail}.
	 * @param ctx the parse tree
	 */
	void enterExprtail(TigerParser.ExprtailContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#exprtail}.
	 * @param ctx the parse tree
	 */
	void exitExprtail(TigerParser.ExprtailContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#consta}.
	 * @param ctx the parse tree
	 */
	void enterConsta(TigerParser.ConstaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#consta}.
	 * @param ctx the parse tree
	 */
	void exitConsta(TigerParser.ConstaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#binaryoperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryoperator(TigerParser.BinaryoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#binaryoperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryoperator(TigerParser.BinaryoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(TigerParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(TigerParser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#exprlisttail}.
	 * @param ctx the parse tree
	 */
	void enterExprlisttail(TigerParser.ExprlisttailContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#exprlisttail}.
	 * @param ctx the parse tree
	 */
	void exitExprlisttail(TigerParser.ExprlisttailContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(TigerParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(TigerParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#lvaluetail}.
	 * @param ctx the parse tree
	 */
	void enterLvaluetail(TigerParser.LvaluetailContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#lvaluetail}.
	 * @param ctx the parse tree
	 */
	void exitLvaluetail(TigerParser.LvaluetailContext ctx);
}