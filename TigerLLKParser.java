// Generated from TigerLLK.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TigerLLKParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, MAIN=3, COMMA=4, COLON=5, SEMI=6, LPAREN=7, RPAREN=8, 
		LBRACK=9, RBRACK=10, LBRACE=11, RBRACE=12, PERIOD=13, PLUS=14, MINUS=15, 
		MULT=16, DIV=17, EXP=18, EQ=19, NEQ=20, LESSER=21, GREATER=22, LESSEREQ=23, 
		GREATEREQ=24, AND=25, OR=26, ASSIGN=27, ARRAY=28, RECORD=29, BREAK=30, 
		DO=31, ELSE=32, FOR=33, FUNC=34, IF=35, IN=36, LET=37, OF=38, THEN=39, 
		TO=40, TYPE=41, VAR=42, WHILE=43, ENDIF=44, BEGIN=45, ENDDO=46, END=47, 
		RETURN=48, COMMENT=49, LINE_COMMENT=50, INTLIT=51, FLOATLIT=52, ID=53, 
		WS=54;
	public static final int
		RULE_hello = 0, RULE_tigerprogram = 1, RULE_declarationsegment = 2, RULE_typedeclarationlist = 3, 
		RULE_vardeclarationlist = 4, RULE_functdeclarationlist = 5, RULE_typedeclaration = 6, 
		RULE_type = 7, RULE_fieldlist = 8, RULE_typeid = 9, RULE_vardeclaration = 10, 
		RULE_idlist = 11, RULE_itail = 12, RULE_optionalinit = 13, RULE_functdeclaration = 14, 
		RULE_paramlist = 15, RULE_paramlisttail = 16, RULE_rettype = 17, RULE_param = 18, 
		RULE_statseq = 19, RULE_stail = 20, RULE_stat = 21, RULE_statail = 22, 
		RULE_more = 23, RULE_ltail = 24, RULE_expr = 25, RULE_and = 26, RULE_le = 27, 
		RULE_me = 28, RULE_lesser = 29, RULE_greater = 30, RULE_noteq = 31, RULE_equal = 32, 
		RULE_minus = 33, RULE_plus = 34, RULE_div = 35, RULE_mult = 36, RULE_exp = 37, 
		RULE_yeet = 38, RULE_consta = 39, RULE_exprlist = 40, RULE_exprlisttail = 41, 
		RULE_lvalue = 42, RULE_lvaluetail = 43;
	public static final String[] ruleNames = {
		"hello", "tigerprogram", "declarationsegment", "typedeclarationlist", 
		"vardeclarationlist", "functdeclarationlist", "typedeclaration", "type", 
		"fieldlist", "typeid", "vardeclaration", "idlist", "itail", "optionalinit", 
		"functdeclaration", "paramlist", "paramlisttail", "rettype", "param", 
		"statseq", "stail", "stat", "statail", "more", "ltail", "expr", "and", 
		"le", "me", "lesser", "greater", "noteq", "equal", "minus", "plus", "div", 
		"mult", "exp", "yeet", "consta", "exprlist", "exprlisttail", "lvalue", 
		"lvaluetail"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'float'", "'main'", "','", "':'", "';'", "'('", "')'", 
		"'['", "']'", "'{'", "'}'", "'.'", "'+'", "'-'", "'*'", "'/'", "'**'", 
		"'='", "'<>'", "'<'", "'>'", "'<='", "'>='", "'&'", "'|'", "':='", "'array'", 
		"'record'", "'break'", "'do'", "'else'", "'for'", "'function'", "'if'", 
		"'in'", "'let'", "'of'", "'then'", "'to'", "'type'", "'var'", "'while'", 
		"'endif'", "'begin'", "'enddo'", "'end'", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "FLOAT", "MAIN", "COMMA", "COLON", "SEMI", "LPAREN", "RPAREN", 
		"LBRACK", "RBRACK", "LBRACE", "RBRACE", "PERIOD", "PLUS", "MINUS", "MULT", 
		"DIV", "EXP", "EQ", "NEQ", "LESSER", "GREATER", "LESSEREQ", "GREATEREQ", 
		"AND", "OR", "ASSIGN", "ARRAY", "RECORD", "BREAK", "DO", "ELSE", "FOR", 
		"FUNC", "IF", "IN", "LET", "OF", "THEN", "TO", "TYPE", "VAR", "WHILE", 
		"ENDIF", "BEGIN", "ENDDO", "END", "RETURN", "COMMENT", "LINE_COMMENT", 
		"INTLIT", "FLOATLIT", "ID", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TigerLLK.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TigerLLKParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class HelloContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(TigerLLKParser.PLUS, 0); }
		public TerminalNode TYPE() { return getToken(TigerLLKParser.TYPE, 0); }
		public TerminalNode VAR() { return getToken(TigerLLKParser.VAR, 0); }
		public TerminalNode WHILE() { return getToken(TigerLLKParser.WHILE, 0); }
		public TerminalNode END() { return getToken(TigerLLKParser.END, 0); }
		public HelloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hello; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitHello(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HelloContext hello() throws RecognitionException {
		HelloContext _localctx = new HelloContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_hello);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(PLUS);
				setState(89);
				match(TYPE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(PLUS);
				setState(91);
				match(VAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(PLUS);
				setState(93);
				match(WHILE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				match(PLUS);
				setState(95);
				match(END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TigerprogramContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(TigerLLKParser.MAIN, 0); }
		public TerminalNode LET() { return getToken(TigerLLKParser.LET, 0); }
		public DeclarationsegmentContext declarationsegment() {
			return getRuleContext(DeclarationsegmentContext.class,0);
		}
		public TerminalNode IN() { return getToken(TigerLLKParser.IN, 0); }
		public TerminalNode BEGIN() { return getToken(TigerLLKParser.BEGIN, 0); }
		public StatseqContext statseq() {
			return getRuleContext(StatseqContext.class,0);
		}
		public TerminalNode END() { return getToken(TigerLLKParser.END, 0); }
		public TigerprogramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tigerprogram; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitTigerprogram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TigerprogramContext tigerprogram() throws RecognitionException {
		TigerprogramContext _localctx = new TigerprogramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tigerprogram);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(MAIN);
			setState(99);
			match(LET);
			setState(100);
			declarationsegment();
			setState(101);
			match(IN);
			setState(102);
			match(BEGIN);
			setState(103);
			statseq();
			setState(104);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsegmentContext extends ParserRuleContext {
		public TypedeclarationlistContext typedeclarationlist() {
			return getRuleContext(TypedeclarationlistContext.class,0);
		}
		public VardeclarationlistContext vardeclarationlist() {
			return getRuleContext(VardeclarationlistContext.class,0);
		}
		public FunctdeclarationlistContext functdeclarationlist() {
			return getRuleContext(FunctdeclarationlistContext.class,0);
		}
		public DeclarationsegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationsegment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitDeclarationsegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsegmentContext declarationsegment() throws RecognitionException {
		DeclarationsegmentContext _localctx = new DeclarationsegmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declarationsegment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			typedeclarationlist();
			setState(107);
			vardeclarationlist();
			setState(108);
			functdeclarationlist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedeclarationlistContext extends ParserRuleContext {
		public TypedeclarationContext typedeclaration() {
			return getRuleContext(TypedeclarationContext.class,0);
		}
		public TypedeclarationlistContext typedeclarationlist() {
			return getRuleContext(TypedeclarationlistContext.class,0);
		}
		public TypedeclarationlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedeclarationlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitTypedeclarationlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedeclarationlistContext typedeclarationlist() throws RecognitionException {
		TypedeclarationlistContext _localctx = new TypedeclarationlistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typedeclarationlist);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				typedeclaration();
				setState(111);
				typedeclarationlist();
				}
				break;
			case FUNC:
			case IN:
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VardeclarationlistContext extends ParserRuleContext {
		public VardeclarationContext vardeclaration() {
			return getRuleContext(VardeclarationContext.class,0);
		}
		public VardeclarationlistContext vardeclarationlist() {
			return getRuleContext(VardeclarationlistContext.class,0);
		}
		public VardeclarationlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardeclarationlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitVardeclarationlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclarationlistContext vardeclarationlist() throws RecognitionException {
		VardeclarationlistContext _localctx = new VardeclarationlistContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vardeclarationlist);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				vardeclaration();
				setState(117);
				vardeclarationlist();
				}
				break;
			case FUNC:
			case IN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctdeclarationlistContext extends ParserRuleContext {
		public FunctdeclarationContext functdeclaration() {
			return getRuleContext(FunctdeclarationContext.class,0);
		}
		public FunctdeclarationlistContext functdeclarationlist() {
			return getRuleContext(FunctdeclarationlistContext.class,0);
		}
		public FunctdeclarationlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functdeclarationlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitFunctdeclarationlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctdeclarationlistContext functdeclarationlist() throws RecognitionException {
		FunctdeclarationlistContext _localctx = new FunctdeclarationlistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functdeclarationlist);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				functdeclaration();
				setState(123);
				functdeclarationlist();
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedeclarationContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(TigerLLKParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(TigerLLKParser.ID, 0); }
		public TerminalNode EQ() { return getToken(TigerLLKParser.EQ, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(TigerLLKParser.SEMI, 0); }
		public TypedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitTypedeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedeclarationContext typedeclaration() throws RecognitionException {
		TypedeclarationContext _localctx = new TypedeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(TYPE);
			setState(129);
			match(ID);
			setState(130);
			match(EQ);
			setState(131);
			type();
			setState(132);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayTypeContext extends TypeContext {
		public TerminalNode ARRAY() { return getToken(TigerLLKParser.ARRAY, 0); }
		public TerminalNode LBRACK() { return getToken(TigerLLKParser.LBRACK, 0); }
		public TerminalNode INTLIT() { return getToken(TigerLLKParser.INTLIT, 0); }
		public TerminalNode RBRACK() { return getToken(TigerLLKParser.RBRACK, 0); }
		public TerminalNode OF() { return getToken(TigerLLKParser.OF, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public ArrayTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IDtypeContext extends TypeContext {
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public IDtypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitIDtype(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PointerTypeContext extends TypeContext {
		public TerminalNode ID() { return getToken(TigerLLKParser.ID, 0); }
		public PointerTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitPointerType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RecordTypeContext extends TypeContext {
		public TerminalNode RECORD() { return getToken(TigerLLKParser.RECORD, 0); }
		public FieldlistContext fieldlist() {
			return getRuleContext(FieldlistContext.class,0);
		}
		public TerminalNode END() { return getToken(TigerLLKParser.END, 0); }
		public RecordTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitRecordType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
				_localctx = new IDtypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				typeid();
				}
				break;
			case ARRAY:
				_localctx = new ArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(ARRAY);
				setState(136);
				match(LBRACK);
				setState(137);
				match(INTLIT);
				setState(138);
				match(RBRACK);
				setState(139);
				match(OF);
				setState(140);
				typeid();
				}
				break;
			case RECORD:
				_localctx = new RecordTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				match(RECORD);
				setState(142);
				fieldlist();
				setState(143);
				match(END);
				}
				break;
			case ID:
				_localctx = new PointerTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldlistContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TigerLLKParser.ID, 0); }
		public TerminalNode COLON() { return getToken(TigerLLKParser.COLON, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(TigerLLKParser.SEMI, 0); }
		public FieldlistContext fieldlist() {
			return getRuleContext(FieldlistContext.class,0);
		}
		public FieldlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitFieldlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldlistContext fieldlist() throws RecognitionException {
		FieldlistContext _localctx = new FieldlistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fieldlist);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(ID);
				setState(149);
				match(COLON);
				setState(150);
				typeid();
				setState(151);
				match(SEMI);
				setState(152);
				fieldlist();
				}
				break;
			case END:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeidContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(TigerLLKParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(TigerLLKParser.FLOAT, 0); }
		public TypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeid; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitTypeid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeidContext typeid() throws RecognitionException {
		TypeidContext _localctx = new TypeidContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VardeclarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(TigerLLKParser.VAR, 0); }
		public IdlistContext idlist() {
			return getRuleContext(IdlistContext.class,0);
		}
		public TerminalNode COLON() { return getToken(TigerLLKParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public OptionalinitContext optionalinit() {
			return getRuleContext(OptionalinitContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(TigerLLKParser.SEMI, 0); }
		public VardeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitVardeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclarationContext vardeclaration() throws RecognitionException {
		VardeclarationContext _localctx = new VardeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_vardeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(VAR);
			setState(160);
			idlist();
			setState(161);
			match(COLON);
			setState(162);
			type();
			setState(163);
			optionalinit();
			setState(164);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdlistContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TigerLLKParser.ID, 0); }
		public ItailContext itail() {
			return getRuleContext(ItailContext.class,0);
		}
		public IdlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitIdlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdlistContext idlist() throws RecognitionException {
		IdlistContext _localctx = new IdlistContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_idlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(ID);
			setState(167);
			itail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItailContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(TigerLLKParser.COMMA, 0); }
		public IdlistContext idlist() {
			return getRuleContext(IdlistContext.class,0);
		}
		public ItailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itail; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitItail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItailContext itail() throws RecognitionException {
		ItailContext _localctx = new ItailContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_itail);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(COMMA);
				setState(170);
				idlist();
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalinitContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(TigerLLKParser.ASSIGN, 0); }
		public ConstaContext consta() {
			return getRuleContext(ConstaContext.class,0);
		}
		public OptionalinitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalinit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitOptionalinit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalinitContext optionalinit() throws RecognitionException {
		OptionalinitContext _localctx = new OptionalinitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_optionalinit);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(ASSIGN);
				setState(175);
				consta();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctdeclarationContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(TigerLLKParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(TigerLLKParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(TigerLLKParser.LPAREN, 0); }
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TigerLLKParser.RPAREN, 0); }
		public RettypeContext rettype() {
			return getRuleContext(RettypeContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(TigerLLKParser.BEGIN, 0); }
		public StatseqContext statseq() {
			return getRuleContext(StatseqContext.class,0);
		}
		public TerminalNode END() { return getToken(TigerLLKParser.END, 0); }
		public TerminalNode SEMI() { return getToken(TigerLLKParser.SEMI, 0); }
		public FunctdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functdeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitFunctdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctdeclarationContext functdeclaration() throws RecognitionException {
		FunctdeclarationContext _localctx = new FunctdeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functdeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(FUNC);
			setState(180);
			match(ID);
			setState(181);
			match(LPAREN);
			setState(182);
			paramlist();
			setState(183);
			match(RPAREN);
			setState(184);
			rettype();
			setState(185);
			match(BEGIN);
			setState(186);
			statseq();
			setState(187);
			match(END);
			setState(188);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamlistContext extends ParserRuleContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public ParamlisttailContext paramlisttail() {
			return getRuleContext(ParamlisttailContext.class,0);
		}
		public ParamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitParamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamlistContext paramlist() throws RecognitionException {
		ParamlistContext _localctx = new ParamlistContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_paramlist);
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				param();
				setState(191);
				paramlisttail();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamlisttailContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(TigerLLKParser.COMMA, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public ParamlisttailContext paramlisttail() {
			return getRuleContext(ParamlisttailContext.class,0);
		}
		public ParamlisttailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramlisttail; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitParamlisttail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamlisttailContext paramlisttail() throws RecognitionException {
		ParamlisttailContext _localctx = new ParamlisttailContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_paramlisttail);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(COMMA);
				setState(197);
				param();
				setState(198);
				paramlisttail();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RettypeContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(TigerLLKParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public RettypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rettype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitRettype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RettypeContext rettype() throws RecognitionException {
		RettypeContext _localctx = new RettypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_rettype);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(COLON);
				setState(204);
				type();
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TigerLLKParser.ID, 0); }
		public TerminalNode COLON() { return getToken(TigerLLKParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(ID);
			setState(209);
			match(COLON);
			setState(210);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatseqContext extends ParserRuleContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public StailContext stail() {
			return getRuleContext(StailContext.class,0);
		}
		public StatseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statseq; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitStatseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatseqContext statseq() throws RecognitionException {
		StatseqContext _localctx = new StatseqContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			stat();
			setState(213);
			stail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StailContext extends ParserRuleContext {
		public StatseqContext statseq() {
			return getRuleContext(StatseqContext.class,0);
		}
		public StailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stail; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitStail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StailContext stail() throws RecognitionException {
		StailContext _localctx = new StailContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_stail);
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
			case FOR:
			case IF:
			case LET:
			case WHILE:
			case RETURN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				statseq();
				}
				break;
			case ELSE:
			case ENDIF:
			case ENDDO:
			case END:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BreakCommandContext extends StatContext {
		public TerminalNode BREAK() { return getToken(TigerLLKParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(TigerLLKParser.SEMI, 0); }
		public BreakCommandContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitBreakCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfBlockContext extends StatContext {
		public TerminalNode IF() { return getToken(TigerLLKParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(TigerLLKParser.THEN, 0); }
		public StatseqContext statseq() {
			return getRuleContext(StatseqContext.class,0);
		}
		public StatailContext statail() {
			return getRuleContext(StatailContext.class,0);
		}
		public IfBlockContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileBlockContext extends StatContext {
		public TerminalNode WHILE() { return getToken(TigerLLKParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(TigerLLKParser.DO, 0); }
		public StatseqContext statseq() {
			return getRuleContext(StatseqContext.class,0);
		}
		public TerminalNode ENDDO() { return getToken(TigerLLKParser.ENDDO, 0); }
		public TerminalNode SEMI() { return getToken(TigerLLKParser.SEMI, 0); }
		public WhileBlockContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetBlockContext extends StatContext {
		public TerminalNode LET() { return getToken(TigerLLKParser.LET, 0); }
		public DeclarationsegmentContext declarationsegment() {
			return getRuleContext(DeclarationsegmentContext.class,0);
		}
		public TerminalNode IN() { return getToken(TigerLLKParser.IN, 0); }
		public StatseqContext statseq() {
			return getRuleContext(StatseqContext.class,0);
		}
		public TerminalNode END() { return getToken(TigerLLKParser.END, 0); }
		public LetBlockContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitLetBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallFunctionContext extends StatContext {
		public TerminalNode ID() { return getToken(TigerLLKParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(TigerLLKParser.LPAREN, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TigerLLKParser.RPAREN, 0); }
		public CallFunctionContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitCallFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignElementContext extends StatContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(TigerLLKParser.ASSIGN, 0); }
		public MoreContext more() {
			return getRuleContext(MoreContext.class,0);
		}
		public AssignElementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitAssignElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatementContext extends StatContext {
		public TerminalNode RETURN() { return getToken(TigerLLKParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(TigerLLKParser.SEMI, 0); }
		public ReturnStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForBlockContext extends StatContext {
		public TerminalNode FOR() { return getToken(TigerLLKParser.FOR, 0); }
		public TerminalNode ID() { return getToken(TigerLLKParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(TigerLLKParser.ASSIGN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TO() { return getToken(TigerLLKParser.TO, 0); }
		public TerminalNode DO() { return getToken(TigerLLKParser.DO, 0); }
		public StatseqContext statseq() {
			return getRuleContext(StatseqContext.class,0);
		}
		public TerminalNode ENDDO() { return getToken(TigerLLKParser.ENDDO, 0); }
		public TerminalNode SEMI() { return getToken(TigerLLKParser.SEMI, 0); }
		public ForBlockContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitForBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_stat);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new LetBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(LET);
				setState(220);
				declarationsegment();
				setState(221);
				match(IN);
				setState(222);
				statseq();
				setState(223);
				match(END);
				}
				break;
			case 2:
				_localctx = new BreakCommandContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(BREAK);
				setState(226);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				match(RETURN);
				setState(228);
				expr();
				setState(229);
				match(SEMI);
				}
				break;
			case 4:
				_localctx = new CallFunctionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				match(ID);
				setState(232);
				match(LPAREN);
				setState(233);
				exprlist();
				setState(234);
				match(RPAREN);
				}
				break;
			case 5:
				_localctx = new AssignElementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				lvalue();
				setState(237);
				match(ASSIGN);
				setState(238);
				more();
				}
				break;
			case 6:
				_localctx = new IfBlockContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(240);
				match(IF);
				setState(241);
				expr();
				setState(242);
				match(THEN);
				setState(243);
				statseq();
				setState(244);
				statail();
				}
				break;
			case 7:
				_localctx = new WhileBlockContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(246);
				match(WHILE);
				setState(247);
				expr();
				setState(248);
				match(DO);
				setState(249);
				statseq();
				setState(250);
				match(ENDDO);
				setState(251);
				match(SEMI);
				}
				break;
			case 8:
				_localctx = new ForBlockContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(253);
				match(FOR);
				setState(254);
				match(ID);
				setState(255);
				match(ASSIGN);
				setState(256);
				expr();
				setState(257);
				match(TO);
				setState(258);
				expr();
				setState(259);
				match(DO);
				setState(260);
				statseq();
				setState(261);
				match(ENDDO);
				setState(262);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatailContext extends ParserRuleContext {
		public StatailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statail; }
	 
		public StatailContext() { }
		public void copyFrom(StatailContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfExitBlockContext extends StatailContext {
		public TerminalNode ENDIF() { return getToken(TigerLLKParser.ENDIF, 0); }
		public TerminalNode SEMI() { return getToken(TigerLLKParser.SEMI, 0); }
		public IfExitBlockContext(StatailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitIfExitBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EndBlockContext extends StatailContext {
		public TerminalNode ELSE() { return getToken(TigerLLKParser.ELSE, 0); }
		public StatseqContext statseq() {
			return getRuleContext(StatseqContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(TigerLLKParser.ENDIF, 0); }
		public TerminalNode SEMI() { return getToken(TigerLLKParser.SEMI, 0); }
		public EndBlockContext(StatailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitEndBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatailContext statail() throws RecognitionException {
		StatailContext _localctx = new StatailContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statail);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENDIF:
				_localctx = new IfExitBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(ENDIF);
				setState(267);
				match(SEMI);
				}
				break;
			case ELSE:
				_localctx = new EndBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(ELSE);
				setState(269);
				statseq();
				setState(270);
				match(ENDIF);
				setState(271);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MoreContext extends ParserRuleContext {
		public MoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_more; }
	 
		public MoreContext() { }
		public void copyFrom(MoreContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleAssigmentContext extends MoreContext {
		public LtailContext ltail() {
			return getRuleContext(LtailContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(TigerLLKParser.SEMI, 0); }
		public MultipleAssigmentContext(MoreContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitMultipleAssigment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionContext extends MoreContext {
		public TerminalNode ID() { return getToken(TigerLLKParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(TigerLLKParser.LPAREN, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TigerLLKParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(TigerLLKParser.SEMI, 0); }
		public FunctionContext(MoreContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoreContext more() throws RecognitionException {
		MoreContext _localctx = new MoreContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_more);
		try {
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new FunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(ID);
				setState(276);
				match(LPAREN);
				setState(277);
				exprlist();
				setState(278);
				match(RPAREN);
				setState(279);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new MultipleAssigmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				ltail();
				setState(282);
				expr();
				setState(283);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LtailContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(TigerLLKParser.ASSIGN, 0); }
		public LtailContext ltail() {
			return getRuleContext(LtailContext.class,0);
		}
		public LtailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ltail; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitLtail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LtailContext ltail() throws RecognitionException {
		LtailContext _localctx = new LtailContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ltail);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				lvalue();
				setState(288);
				match(ASSIGN);
				setState(289);
				ltail();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<AndContext> and() {
			return getRuleContexts(AndContext.class);
		}
		public AndContext and(int i) {
			return getRuleContext(AndContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(TigerLLKParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(TigerLLKParser.OR, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			and();
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(295);
				match(OR);
				setState(296);
				and();
				}
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndContext extends ParserRuleContext {
		public List<LeContext> le() {
			return getRuleContexts(LeContext.class);
		}
		public LeContext le(int i) {
			return getRuleContext(LeContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(TigerLLKParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(TigerLLKParser.AND, i);
		}
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			le();
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(303);
				match(AND);
				setState(304);
				le();
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeContext extends ParserRuleContext {
		public List<MeContext> me() {
			return getRuleContexts(MeContext.class);
		}
		public MeContext me(int i) {
			return getRuleContext(MeContext.class,i);
		}
		public List<TerminalNode> LESSEREQ() { return getTokens(TigerLLKParser.LESSEREQ); }
		public TerminalNode LESSEREQ(int i) {
			return getToken(TigerLLKParser.LESSEREQ, i);
		}
		public LeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_le; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitLe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeContext le() throws RecognitionException {
		LeContext _localctx = new LeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_le);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			me();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LESSEREQ) {
				{
				{
				setState(311);
				match(LESSEREQ);
				setState(312);
				me();
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeContext extends ParserRuleContext {
		public List<LesserContext> lesser() {
			return getRuleContexts(LesserContext.class);
		}
		public LesserContext lesser(int i) {
			return getRuleContext(LesserContext.class,i);
		}
		public List<TerminalNode> GREATEREQ() { return getTokens(TigerLLKParser.GREATEREQ); }
		public TerminalNode GREATEREQ(int i) {
			return getToken(TigerLLKParser.GREATEREQ, i);
		}
		public MeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_me; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitMe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeContext me() throws RecognitionException {
		MeContext _localctx = new MeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_me);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			lesser();
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GREATEREQ) {
				{
				{
				setState(319);
				match(GREATEREQ);
				setState(320);
				lesser();
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LesserContext extends ParserRuleContext {
		public List<GreaterContext> greater() {
			return getRuleContexts(GreaterContext.class);
		}
		public GreaterContext greater(int i) {
			return getRuleContext(GreaterContext.class,i);
		}
		public List<TerminalNode> LESSER() { return getTokens(TigerLLKParser.LESSER); }
		public TerminalNode LESSER(int i) {
			return getToken(TigerLLKParser.LESSER, i);
		}
		public LesserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lesser; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitLesser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LesserContext lesser() throws RecognitionException {
		LesserContext _localctx = new LesserContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_lesser);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			greater();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LESSER) {
				{
				{
				setState(327);
				match(LESSER);
				setState(328);
				greater();
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GreaterContext extends ParserRuleContext {
		public List<NoteqContext> noteq() {
			return getRuleContexts(NoteqContext.class);
		}
		public NoteqContext noteq(int i) {
			return getRuleContext(NoteqContext.class,i);
		}
		public List<TerminalNode> GREATER() { return getTokens(TigerLLKParser.GREATER); }
		public TerminalNode GREATER(int i) {
			return getToken(TigerLLKParser.GREATER, i);
		}
		public GreaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitGreater(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreaterContext greater() throws RecognitionException {
		GreaterContext _localctx = new GreaterContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_greater);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			noteq();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GREATER) {
				{
				{
				setState(335);
				match(GREATER);
				setState(336);
				noteq();
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoteqContext extends ParserRuleContext {
		public List<EqualContext> equal() {
			return getRuleContexts(EqualContext.class);
		}
		public EqualContext equal(int i) {
			return getRuleContext(EqualContext.class,i);
		}
		public List<TerminalNode> NEQ() { return getTokens(TigerLLKParser.NEQ); }
		public TerminalNode NEQ(int i) {
			return getToken(TigerLLKParser.NEQ, i);
		}
		public NoteqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noteq; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitNoteq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoteqContext noteq() throws RecognitionException {
		NoteqContext _localctx = new NoteqContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_noteq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			equal();
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEQ) {
				{
				{
				setState(343);
				match(NEQ);
				setState(344);
				equal();
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualContext extends ParserRuleContext {
		public List<MinusContext> minus() {
			return getRuleContexts(MinusContext.class);
		}
		public MinusContext minus(int i) {
			return getRuleContext(MinusContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(TigerLLKParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(TigerLLKParser.EQ, i);
		}
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_equal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			minus();
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQ) {
				{
				{
				setState(351);
				match(EQ);
				setState(352);
				minus();
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MinusContext extends ParserRuleContext {
		public List<PlusContext> plus() {
			return getRuleContexts(PlusContext.class);
		}
		public PlusContext plus(int i) {
			return getRuleContext(PlusContext.class,i);
		}
		public List<TerminalNode> MINUS() { return getTokens(TigerLLKParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(TigerLLKParser.MINUS, i);
		}
		public MinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinusContext minus() throws RecognitionException {
		MinusContext _localctx = new MinusContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_minus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			plus();
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS) {
				{
				{
				setState(359);
				match(MINUS);
				setState(360);
				plus();
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlusContext extends ParserRuleContext {
		public List<DivContext> div() {
			return getRuleContexts(DivContext.class);
		}
		public DivContext div(int i) {
			return getRuleContext(DivContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(TigerLLKParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(TigerLLKParser.PLUS, i);
		}
		public PlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusContext plus() throws RecognitionException {
		PlusContext _localctx = new PlusContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_plus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			div();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(367);
				match(PLUS);
				setState(368);
				div();
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DivContext extends ParserRuleContext {
		public List<MultContext> mult() {
			return getRuleContexts(MultContext.class);
		}
		public MultContext mult(int i) {
			return getRuleContext(MultContext.class,i);
		}
		public List<TerminalNode> DIV() { return getTokens(TigerLLKParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(TigerLLKParser.DIV, i);
		}
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			mult();
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIV) {
				{
				{
				setState(375);
				match(DIV);
				setState(376);
				mult();
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(TigerLLKParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(TigerLLKParser.MULT, i);
		}
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			exp();
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT) {
				{
				{
				setState(383);
				match(MULT);
				setState(384);
				exp();
				}
				}
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public List<YeetContext> yeet() {
			return getRuleContexts(YeetContext.class);
		}
		public YeetContext yeet(int i) {
			return getRuleContext(YeetContext.class,i);
		}
		public List<TerminalNode> EXP() { return getTokens(TigerLLKParser.EXP); }
		public TerminalNode EXP(int i) {
			return getToken(TigerLLKParser.EXP, i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			yeet();
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXP) {
				{
				{
				setState(391);
				match(EXP);
				setState(392);
				yeet();
				}
				}
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YeetContext extends ParserRuleContext {
		public YeetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yeet; }
	 
		public YeetContext() { }
		public void copyFrom(YeetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstantContext extends YeetContext {
		public ConstaContext consta() {
			return getRuleContext(ConstaContext.class,0);
		}
		public ConstantContext(YeetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarValueContext extends YeetContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public VarValueContext(YeetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitVarValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionContext extends YeetContext {
		public TerminalNode LPAREN() { return getToken(TigerLLKParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TigerLLKParser.RPAREN, 0); }
		public ExpressionContext(YeetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YeetContext yeet() throws RecognitionException {
		YeetContext _localctx = new YeetContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_yeet);
		try {
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTLIT:
			case FLOATLIT:
				_localctx = new ConstantContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				consta();
				}
				break;
			case ID:
				_localctx = new VarValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				lvalue();
				}
				break;
			case LPAREN:
				_localctx = new ExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(400);
				match(LPAREN);
				setState(401);
				expr();
				setState(402);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstaContext extends ParserRuleContext {
		public ConstaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consta; }
	 
		public ConstaContext() { }
		public void copyFrom(ConstaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntLiteralContext extends ConstaContext {
		public TerminalNode INTLIT() { return getToken(TigerLLKParser.INTLIT, 0); }
		public IntLiteralContext(ConstaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatLiteralContext extends ConstaContext {
		public TerminalNode FLOATLIT() { return getToken(TigerLLKParser.FLOATLIT, 0); }
		public FloatLiteralContext(ConstaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstaContext consta() throws RecognitionException {
		ConstaContext _localctx = new ConstaContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_consta);
		try {
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTLIT:
				_localctx = new IntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				match(INTLIT);
				}
				break;
			case FLOATLIT:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				match(FLOATLIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprlistContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprlisttailContext exprlisttail() {
			return getRuleContext(ExprlisttailContext.class,0);
		}
		public ExprlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitExprlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_exprlist);
		try {
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case INTLIT:
			case FLOATLIT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				expr();
				setState(411);
				exprlisttail();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprlisttailContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(TigerLLKParser.COMMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprlisttailContext exprlisttail() {
			return getRuleContext(ExprlisttailContext.class,0);
		}
		public ExprlisttailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlisttail; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitExprlisttail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprlisttailContext exprlisttail() throws RecognitionException {
		ExprlisttailContext _localctx = new ExprlisttailContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_exprlisttail);
		try {
			setState(421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				match(COMMA);
				setState(417);
				expr();
				setState(418);
				exprlisttail();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TigerLLKParser.ID, 0); }
		public LvaluetailContext lvaluetail() {
			return getRuleContext(LvaluetailContext.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitLvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_lvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(ID);
			setState(424);
			lvaluetail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LvaluetailContext extends ParserRuleContext {
		public LvaluetailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvaluetail; }
	 
		public LvaluetailContext() { }
		public void copyFrom(LvaluetailContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdAttributeContext extends LvaluetailContext {
		public TerminalNode PERIOD() { return getToken(TigerLLKParser.PERIOD, 0); }
		public TerminalNode ID() { return getToken(TigerLLKParser.ID, 0); }
		public IdAttributeContext(LvaluetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitIdAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullTailContext extends LvaluetailContext {
		public NullTailContext(LvaluetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitNullTail(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAccessContext extends LvaluetailContext {
		public TerminalNode LBRACK() { return getToken(TigerLLKParser.LBRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(TigerLLKParser.RBRACK, 0); }
		public ArrayAccessContext(LvaluetailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TigerLLKVisitor ) return ((TigerLLKVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvaluetailContext lvaluetail() throws RecognitionException {
		LvaluetailContext _localctx = new LvaluetailContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_lvaluetail);
		try {
			setState(433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				_localctx = new ArrayAccessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				match(LBRACK);
				setState(427);
				expr();
				setState(428);
				match(RBRACK);
				}
				break;
			case PERIOD:
				_localctx = new IdAttributeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				match(PERIOD);
				setState(431);
				match(ID);
				}
				break;
			case COMMA:
			case SEMI:
			case RPAREN:
			case RBRACK:
			case PLUS:
			case MINUS:
			case MULT:
			case DIV:
			case EXP:
			case EQ:
			case NEQ:
			case LESSER:
			case GREATER:
			case LESSEREQ:
			case GREATEREQ:
			case AND:
			case OR:
			case ASSIGN:
			case DO:
			case THEN:
			case TO:
				_localctx = new NullTailContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u01b6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2c\n\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5u\n\5\3\6\3\6\3\6\3"+
		"\6\5\6{\n\6\3\7\3\7\3\7\3\7\5\7\u0081\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0095\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u009e\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\5\16\u00af\n\16\3\17\3\17\3\17\5\17\u00b4\n"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\5\21\u00c5\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u00cc\n\22\3\23"+
		"\3\23\3\23\5\23\u00d1\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\5\26\u00dc\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u010b\n\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u0114\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0120\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u0127\n\32\3\33\3"+
		"\33\3\33\7\33\u012c\n\33\f\33\16\33\u012f\13\33\3\34\3\34\3\34\7\34\u0134"+
		"\n\34\f\34\16\34\u0137\13\34\3\35\3\35\3\35\7\35\u013c\n\35\f\35\16\35"+
		"\u013f\13\35\3\36\3\36\3\36\7\36\u0144\n\36\f\36\16\36\u0147\13\36\3\37"+
		"\3\37\3\37\7\37\u014c\n\37\f\37\16\37\u014f\13\37\3 \3 \3 \7 \u0154\n"+
		" \f \16 \u0157\13 \3!\3!\3!\7!\u015c\n!\f!\16!\u015f\13!\3\"\3\"\3\"\7"+
		"\"\u0164\n\"\f\"\16\"\u0167\13\"\3#\3#\3#\7#\u016c\n#\f#\16#\u016f\13"+
		"#\3$\3$\3$\7$\u0174\n$\f$\16$\u0177\13$\3%\3%\3%\7%\u017c\n%\f%\16%\u017f"+
		"\13%\3&\3&\3&\7&\u0184\n&\f&\16&\u0187\13&\3\'\3\'\3\'\7\'\u018c\n\'\f"+
		"\'\16\'\u018f\13\'\3(\3(\3(\3(\3(\3(\5(\u0197\n(\3)\3)\5)\u019b\n)\3*"+
		"\3*\3*\3*\5*\u01a1\n*\3+\3+\3+\3+\3+\5+\u01a8\n+\3,\3,\3,\3-\3-\3-\3-"+
		"\3-\3-\3-\5-\u01b4\n-\3-\2\2.\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX\2\3\3\2\3\4\2\u01b7\2b\3\2\2\2\4"+
		"d\3\2\2\2\6l\3\2\2\2\bt\3\2\2\2\nz\3\2\2\2\f\u0080\3\2\2\2\16\u0082\3"+
		"\2\2\2\20\u0094\3\2\2\2\22\u009d\3\2\2\2\24\u009f\3\2\2\2\26\u00a1\3\2"+
		"\2\2\30\u00a8\3\2\2\2\32\u00ae\3\2\2\2\34\u00b3\3\2\2\2\36\u00b5\3\2\2"+
		"\2 \u00c4\3\2\2\2\"\u00cb\3\2\2\2$\u00d0\3\2\2\2&\u00d2\3\2\2\2(\u00d6"+
		"\3\2\2\2*\u00db\3\2\2\2,\u010a\3\2\2\2.\u0113\3\2\2\2\60\u011f\3\2\2\2"+
		"\62\u0126\3\2\2\2\64\u0128\3\2\2\2\66\u0130\3\2\2\28\u0138\3\2\2\2:\u0140"+
		"\3\2\2\2<\u0148\3\2\2\2>\u0150\3\2\2\2@\u0158\3\2\2\2B\u0160\3\2\2\2D"+
		"\u0168\3\2\2\2F\u0170\3\2\2\2H\u0178\3\2\2\2J\u0180\3\2\2\2L\u0188\3\2"+
		"\2\2N\u0196\3\2\2\2P\u019a\3\2\2\2R\u01a0\3\2\2\2T\u01a7\3\2\2\2V\u01a9"+
		"\3\2\2\2X\u01b3\3\2\2\2Z[\7\20\2\2[c\7+\2\2\\]\7\20\2\2]c\7,\2\2^_\7\20"+
		"\2\2_c\7-\2\2`a\7\20\2\2ac\7\61\2\2bZ\3\2\2\2b\\\3\2\2\2b^\3\2\2\2b`\3"+
		"\2\2\2c\3\3\2\2\2de\7\5\2\2ef\7\'\2\2fg\5\6\4\2gh\7&\2\2hi\7/\2\2ij\5"+
		"(\25\2jk\7\61\2\2k\5\3\2\2\2lm\5\b\5\2mn\5\n\6\2no\5\f\7\2o\7\3\2\2\2"+
		"pq\5\16\b\2qr\5\b\5\2ru\3\2\2\2su\3\2\2\2tp\3\2\2\2ts\3\2\2\2u\t\3\2\2"+
		"\2vw\5\26\f\2wx\5\n\6\2x{\3\2\2\2y{\3\2\2\2zv\3\2\2\2zy\3\2\2\2{\13\3"+
		"\2\2\2|}\5\36\20\2}~\5\f\7\2~\u0081\3\2\2\2\177\u0081\3\2\2\2\u0080|\3"+
		"\2\2\2\u0080\177\3\2\2\2\u0081\r\3\2\2\2\u0082\u0083\7+\2\2\u0083\u0084"+
		"\7\67\2\2\u0084\u0085\7\25\2\2\u0085\u0086\5\20\t\2\u0086\u0087\7\b\2"+
		"\2\u0087\17\3\2\2\2\u0088\u0095\5\24\13\2\u0089\u008a\7\36\2\2\u008a\u008b"+
		"\7\13\2\2\u008b\u008c\7\65\2\2\u008c\u008d\7\f\2\2\u008d\u008e\7(\2\2"+
		"\u008e\u0095\5\24\13\2\u008f\u0090\7\37\2\2\u0090\u0091\5\22\n\2\u0091"+
		"\u0092\7\61\2\2\u0092\u0095\3\2\2\2\u0093\u0095\7\67\2\2\u0094\u0088\3"+
		"\2\2\2\u0094\u0089\3\2\2\2\u0094\u008f\3\2\2\2\u0094\u0093\3\2\2\2\u0095"+
		"\21\3\2\2\2\u0096\u0097\7\67\2\2\u0097\u0098\7\7\2\2\u0098\u0099\5\24"+
		"\13\2\u0099\u009a\7\b\2\2\u009a\u009b\5\22\n\2\u009b\u009e\3\2\2\2\u009c"+
		"\u009e\3\2\2\2\u009d\u0096\3\2\2\2\u009d\u009c\3\2\2\2\u009e\23\3\2\2"+
		"\2\u009f\u00a0\t\2\2\2\u00a0\25\3\2\2\2\u00a1\u00a2\7,\2\2\u00a2\u00a3"+
		"\5\30\r\2\u00a3\u00a4\7\7\2\2\u00a4\u00a5\5\20\t\2\u00a5\u00a6\5\34\17"+
		"\2\u00a6\u00a7\7\b\2\2\u00a7\27\3\2\2\2\u00a8\u00a9\7\67\2\2\u00a9\u00aa"+
		"\5\32\16\2\u00aa\31\3\2\2\2\u00ab\u00ac\7\6\2\2\u00ac\u00af\5\30\r\2\u00ad"+
		"\u00af\3\2\2\2\u00ae\u00ab\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\33\3\2\2"+
		"\2\u00b0\u00b1\7\35\2\2\u00b1\u00b4\5P)\2\u00b2\u00b4\3\2\2\2\u00b3\u00b0"+
		"\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\35\3\2\2\2\u00b5\u00b6\7$\2\2\u00b6"+
		"\u00b7\7\67\2\2\u00b7\u00b8\7\t\2\2\u00b8\u00b9\5 \21\2\u00b9\u00ba\7"+
		"\n\2\2\u00ba\u00bb\5$\23\2\u00bb\u00bc\7/\2\2\u00bc\u00bd\5(\25\2\u00bd"+
		"\u00be\7\61\2\2\u00be\u00bf\7\b\2\2\u00bf\37\3\2\2\2\u00c0\u00c1\5&\24"+
		"\2\u00c1\u00c2\5\"\22\2\u00c2\u00c5\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4"+
		"\u00c0\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5!\3\2\2\2\u00c6\u00c7\7\6\2\2"+
		"\u00c7\u00c8\5&\24\2\u00c8\u00c9\5\"\22\2\u00c9\u00cc\3\2\2\2\u00ca\u00cc"+
		"\3\2\2\2\u00cb\u00c6\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc#\3\2\2\2\u00cd"+
		"\u00ce\7\7\2\2\u00ce\u00d1\5\20\t\2\u00cf\u00d1\3\2\2\2\u00d0\u00cd\3"+
		"\2\2\2\u00d0\u00cf\3\2\2\2\u00d1%\3\2\2\2\u00d2\u00d3\7\67\2\2\u00d3\u00d4"+
		"\7\7\2\2\u00d4\u00d5\5\20\t\2\u00d5\'\3\2\2\2\u00d6\u00d7\5,\27\2\u00d7"+
		"\u00d8\5*\26\2\u00d8)\3\2\2\2\u00d9\u00dc\5(\25\2\u00da\u00dc\3\2\2\2"+
		"\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc+\3\2\2\2\u00dd\u00de\7"+
		"\'\2\2\u00de\u00df\5\6\4\2\u00df\u00e0\7&\2\2\u00e0\u00e1\5(\25\2\u00e1"+
		"\u00e2\7\61\2\2\u00e2\u010b\3\2\2\2\u00e3\u00e4\7 \2\2\u00e4\u010b\7\b"+
		"\2\2\u00e5\u00e6\7\62\2\2\u00e6\u00e7\5\64\33\2\u00e7\u00e8\7\b\2\2\u00e8"+
		"\u010b\3\2\2\2\u00e9\u00ea\7\67\2\2\u00ea\u00eb\7\t\2\2\u00eb\u00ec\5"+
		"R*\2\u00ec\u00ed\7\n\2\2\u00ed\u010b\3\2\2\2\u00ee\u00ef\5V,\2\u00ef\u00f0"+
		"\7\35\2\2\u00f0\u00f1\5\60\31\2\u00f1\u010b\3\2\2\2\u00f2\u00f3\7%\2\2"+
		"\u00f3\u00f4\5\64\33\2\u00f4\u00f5\7)\2\2\u00f5\u00f6\5(\25\2\u00f6\u00f7"+
		"\5.\30\2\u00f7\u010b\3\2\2\2\u00f8\u00f9\7-\2\2\u00f9\u00fa\5\64\33\2"+
		"\u00fa\u00fb\7!\2\2\u00fb\u00fc\5(\25\2\u00fc\u00fd\7\60\2\2\u00fd\u00fe"+
		"\7\b\2\2\u00fe\u010b\3\2\2\2\u00ff\u0100\7#\2\2\u0100\u0101\7\67\2\2\u0101"+
		"\u0102\7\35\2\2\u0102\u0103\5\64\33\2\u0103\u0104\7*\2\2\u0104\u0105\5"+
		"\64\33\2\u0105\u0106\7!\2\2\u0106\u0107\5(\25\2\u0107\u0108\7\60\2\2\u0108"+
		"\u0109\7\b\2\2\u0109\u010b\3\2\2\2\u010a\u00dd\3\2\2\2\u010a\u00e3\3\2"+
		"\2\2\u010a\u00e5\3\2\2\2\u010a\u00e9\3\2\2\2\u010a\u00ee\3\2\2\2\u010a"+
		"\u00f2\3\2\2\2\u010a\u00f8\3\2\2\2\u010a\u00ff\3\2\2\2\u010b-\3\2\2\2"+
		"\u010c\u010d\7.\2\2\u010d\u0114\7\b\2\2\u010e\u010f\7\"\2\2\u010f\u0110"+
		"\5(\25\2\u0110\u0111\7.\2\2\u0111\u0112\7\b\2\2\u0112\u0114\3\2\2\2\u0113"+
		"\u010c\3\2\2\2\u0113\u010e\3\2\2\2\u0114/\3\2\2\2\u0115\u0116\7\67\2\2"+
		"\u0116\u0117\7\t\2\2\u0117\u0118\5R*\2\u0118\u0119\7\n\2\2\u0119\u011a"+
		"\7\b\2\2\u011a\u0120\3\2\2\2\u011b\u011c\5\62\32\2\u011c\u011d\5\64\33"+
		"\2\u011d\u011e\7\b\2\2\u011e\u0120\3\2\2\2\u011f\u0115\3\2\2\2\u011f\u011b"+
		"\3\2\2\2\u0120\61\3\2\2\2\u0121\u0122\5V,\2\u0122\u0123\7\35\2\2\u0123"+
		"\u0124\5\62\32\2\u0124\u0127\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0121\3"+
		"\2\2\2\u0126\u0125\3\2\2\2\u0127\63\3\2\2\2\u0128\u012d\5\66\34\2\u0129"+
		"\u012a\7\34\2\2\u012a\u012c\5\66\34\2\u012b\u0129\3\2\2\2\u012c\u012f"+
		"\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\65\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u0130\u0135\58\35\2\u0131\u0132\7\33\2\2\u0132\u0134\5"+
		"8\35\2\u0133\u0131\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\67\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013d\5:\36"+
		"\2\u0139\u013a\7\31\2\2\u013a\u013c\5:\36\2\u013b\u0139\3\2\2\2\u013c"+
		"\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e9\3\2\2\2"+
		"\u013f\u013d\3\2\2\2\u0140\u0145\5<\37\2\u0141\u0142\7\32\2\2\u0142\u0144"+
		"\5<\37\2\u0143\u0141\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146;\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u014d\5> \2\u0149"+
		"\u014a\7\27\2\2\u014a\u014c\5> \2\u014b\u0149\3\2\2\2\u014c\u014f\3\2"+
		"\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e=\3\2\2\2\u014f\u014d"+
		"\3\2\2\2\u0150\u0155\5@!\2\u0151\u0152\7\30\2\2\u0152\u0154\5@!\2\u0153"+
		"\u0151\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2"+
		"\2\2\u0156?\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u015d\5B\"\2\u0159\u015a"+
		"\7\26\2\2\u015a\u015c\5B\"\2\u015b\u0159\3\2\2\2\u015c\u015f\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015eA\3\2\2\2\u015f\u015d\3\2\2\2"+
		"\u0160\u0165\5D#\2\u0161\u0162\7\25\2\2\u0162\u0164\5D#\2\u0163\u0161"+
		"\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"C\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u016d\5F$\2\u0169\u016a\7\21\2\2\u016a"+
		"\u016c\5F$\2\u016b\u0169\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2"+
		"\2\u016d\u016e\3\2\2\2\u016eE\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0175"+
		"\5H%\2\u0171\u0172\7\20\2\2\u0172\u0174\5H%\2\u0173\u0171\3\2\2\2\u0174"+
		"\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176G\3\2\2\2"+
		"\u0177\u0175\3\2\2\2\u0178\u017d\5J&\2\u0179\u017a\7\23\2\2\u017a\u017c"+
		"\5J&\2\u017b\u0179\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017eI\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0185\5L\'\2\u0181"+
		"\u0182\7\22\2\2\u0182\u0184\5L\'\2\u0183\u0181\3\2\2\2\u0184\u0187\3\2"+
		"\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186K\3\2\2\2\u0187\u0185"+
		"\3\2\2\2\u0188\u018d\5N(\2\u0189\u018a\7\24\2\2\u018a\u018c\5N(\2\u018b"+
		"\u0189\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2"+
		"\2\2\u018eM\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0197\5P)\2\u0191\u0197"+
		"\5V,\2\u0192\u0193\7\t\2\2\u0193\u0194\5\64\33\2\u0194\u0195\7\n\2\2\u0195"+
		"\u0197\3\2\2\2\u0196\u0190\3\2\2\2\u0196\u0191\3\2\2\2\u0196\u0192\3\2"+
		"\2\2\u0197O\3\2\2\2\u0198\u019b\7\65\2\2\u0199\u019b\7\66\2\2\u019a\u0198"+
		"\3\2\2\2\u019a\u0199\3\2\2\2\u019bQ\3\2\2\2\u019c\u019d\5\64\33\2\u019d"+
		"\u019e\5T+\2\u019e\u01a1\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u019c\3\2\2"+
		"\2\u01a0\u019f\3\2\2\2\u01a1S\3\2\2\2\u01a2\u01a3\7\6\2\2\u01a3\u01a4"+
		"\5\64\33\2\u01a4\u01a5\5T+\2\u01a5\u01a8\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7"+
		"\u01a2\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8U\3\2\2\2\u01a9\u01aa\7\67\2\2"+
		"\u01aa\u01ab\5X-\2\u01abW\3\2\2\2\u01ac\u01ad\7\13\2\2\u01ad\u01ae\5\64"+
		"\33\2\u01ae\u01af\7\f\2\2\u01af\u01b4\3\2\2\2\u01b0\u01b1\7\17\2\2\u01b1"+
		"\u01b4\7\67\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01ac\3\2\2\2\u01b3\u01b0\3"+
		"\2\2\2\u01b3\u01b2\3\2\2\2\u01b4Y\3\2\2\2$btz\u0080\u0094\u009d\u00ae"+
		"\u00b3\u00c4\u00cb\u00d0\u00db\u010a\u0113\u011f\u0126\u012d\u0135\u013d"+
		"\u0145\u014d\u0155\u015d\u0165\u016d\u0175\u017d\u0185\u018d\u0196\u019a"+
		"\u01a0\u01a7\u01b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}