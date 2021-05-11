// Generated from c:\Users\Usuario\Documents\TrabajoPracticoTC\trabajopractico\src\main\java\trabajopractico\programa.g4 by ANTLR 4.8

    package trabajopractico;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class programaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LETRA2=1, EQ=2, DOUBLE=3, WHILEF=4, IFF=5, INT=6, PARENTESISA=7, PARENTESISC=8, 
		LLAVEA=9, LLAVEC=10, PUNTOCOMA=11, COMA=12, ENTERO=13, COMP=14, WS=15, 
		OTRO=16;
	public static final int
		RULE_programa = 0, RULE_instruccion = 1, RULE_iwhile = 2, RULE_iif = 3, 
		RULE_asignacion = 4, RULE_declaracion = 5, RULE_declarar = 6, RULE_type = 7, 
		RULE_variable = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instruccion", "iwhile", "iif", "asignacion", "declaracion", 
			"declarar", "type", "variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'='", "'double'", "'while'", "'if'", "'int'", "'('", "')'", 
			"'{'", "'}'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LETRA2", "EQ", "DOUBLE", "WHILEF", "IFF", "INT", "PARENTESISA", 
			"PARENTESISC", "LLAVEA", "LLAVEC", "PUNTOCOMA", "COMA", "ENTERO", "COMP", 
			"WS", "OTRO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "programa.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public programaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			setState(22);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				instruccion();
				setState(19);
				programa();
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

	public static class InstruccionContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public IwhileContext iwhile() {
			return getRuleContext(IwhileContext.class,0);
		}
		public IifContext iif() {
			return getRuleContext(IifContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruccion);
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				declaracion();
				}
				break;
			case LETRA2:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				asignacion();
				}
				break;
			case WHILEF:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				iwhile();
				}
				break;
			case IFF:
				enterOuterAlt(_localctx, 4);
				{
				setState(27);
				iif();
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

	public static class IwhileContext extends ParserRuleContext {
		public TerminalNode WHILEF() { return getToken(programaParser.WHILEF, 0); }
		public TerminalNode PARENTESISA() { return getToken(programaParser.PARENTESISA, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode COMP() { return getToken(programaParser.COMP, 0); }
		public TerminalNode PARENTESISC() { return getToken(programaParser.PARENTESISC, 0); }
		public TerminalNode LLAVEA() { return getToken(programaParser.LLAVEA, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public TerminalNode LLAVEC() { return getToken(programaParser.LLAVEC, 0); }
		public IwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterIwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitIwhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitIwhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IwhileContext iwhile() throws RecognitionException {
		IwhileContext _localctx = new IwhileContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_iwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(WHILEF);
			setState(31);
			match(PARENTESISA);
			setState(32);
			variable();
			setState(33);
			match(COMP);
			setState(34);
			variable();
			setState(35);
			match(PARENTESISC);
			setState(36);
			match(LLAVEA);
			setState(37);
			instruccion();
			setState(38);
			match(LLAVEC);
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

	public static class IifContext extends ParserRuleContext {
		public TerminalNode IFF() { return getToken(programaParser.IFF, 0); }
		public TerminalNode PARENTESISA() { return getToken(programaParser.PARENTESISA, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode COMP() { return getToken(programaParser.COMP, 0); }
		public TerminalNode PARENTESISC() { return getToken(programaParser.PARENTESISC, 0); }
		public TerminalNode LLAVEA() { return getToken(programaParser.LLAVEA, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public TerminalNode LLAVEC() { return getToken(programaParser.LLAVEC, 0); }
		public IifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterIif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitIif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitIif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IifContext iif() throws RecognitionException {
		IifContext _localctx = new IifContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_iif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(IFF);
			setState(41);
			match(PARENTESISA);
			setState(42);
			variable();
			setState(43);
			match(COMP);
			setState(44);
			variable();
			setState(45);
			match(PARENTESISC);
			setState(46);
			match(LLAVEA);
			setState(47);
			instruccion();
			setState(48);
			match(LLAVEC);
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode LETRA2() { return getToken(programaParser.LETRA2, 0); }
		public TerminalNode EQ() { return getToken(programaParser.EQ, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(programaParser.PUNTOCOMA, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(LETRA2);
			setState(51);
			match(EQ);
			setState(52);
			variable();
			setState(53);
			match(PUNTOCOMA);
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

	public static class DeclaracionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclararContext declarar() {
			return getRuleContext(DeclararContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			type();
			setState(56);
			declarar();
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

	public static class DeclararContext extends ParserRuleContext {
		public TerminalNode LETRA2() { return getToken(programaParser.LETRA2, 0); }
		public TerminalNode EQ() { return getToken(programaParser.EQ, 0); }
		public TerminalNode ENTERO() { return getToken(programaParser.ENTERO, 0); }
		public TerminalNode COMA() { return getToken(programaParser.COMA, 0); }
		public DeclararContext declarar() {
			return getRuleContext(DeclararContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(programaParser.PUNTOCOMA, 0); }
		public DeclararContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterDeclarar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitDeclarar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitDeclarar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararContext declarar() throws RecognitionException {
		DeclararContext _localctx = new DeclararContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declarar);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(LETRA2);
				setState(59);
				match(EQ);
				setState(60);
				match(ENTERO);
				setState(61);
				match(COMA);
				setState(62);
				declarar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(LETRA2);
				setState(64);
				match(COMA);
				setState(65);
				declarar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(LETRA2);
				setState(67);
				match(EQ);
				setState(68);
				match(ENTERO);
				setState(69);
				match(PUNTOCOMA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				match(LETRA2);
				setState(71);
				match(PUNTOCOMA);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(programaParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(programaParser.INT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==INT) ) {
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode LETRA2() { return getToken(programaParser.LETRA2, 0); }
		public TerminalNode ENTERO() { return getToken(programaParser.ENTERO, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !(_la==LETRA2 || _la==ENTERO) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22Q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\5\2\31\n\2\3\3\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\bK\n\b\3\t\3\t\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\4\4\2\5\5"+
		"\b\b\4\2\3\3\17\17\2N\2\30\3\2\2\2\4\36\3\2\2\2\6 \3\2\2\2\b*\3\2\2\2"+
		"\n\64\3\2\2\2\f9\3\2\2\2\16J\3\2\2\2\20L\3\2\2\2\22N\3\2\2\2\24\25\5\4"+
		"\3\2\25\26\5\2\2\2\26\31\3\2\2\2\27\31\3\2\2\2\30\24\3\2\2\2\30\27\3\2"+
		"\2\2\31\3\3\2\2\2\32\37\5\f\7\2\33\37\5\n\6\2\34\37\5\6\4\2\35\37\5\b"+
		"\5\2\36\32\3\2\2\2\36\33\3\2\2\2\36\34\3\2\2\2\36\35\3\2\2\2\37\5\3\2"+
		"\2\2 !\7\6\2\2!\"\7\t\2\2\"#\5\22\n\2#$\7\20\2\2$%\5\22\n\2%&\7\n\2\2"+
		"&\'\7\13\2\2\'(\5\4\3\2()\7\f\2\2)\7\3\2\2\2*+\7\7\2\2+,\7\t\2\2,-\5\22"+
		"\n\2-.\7\20\2\2./\5\22\n\2/\60\7\n\2\2\60\61\7\13\2\2\61\62\5\4\3\2\62"+
		"\63\7\f\2\2\63\t\3\2\2\2\64\65\7\3\2\2\65\66\7\4\2\2\66\67\5\22\n\2\67"+
		"8\7\r\2\28\13\3\2\2\29:\5\20\t\2:;\5\16\b\2;\r\3\2\2\2<=\7\3\2\2=>\7\4"+
		"\2\2>?\7\17\2\2?@\7\16\2\2@K\5\16\b\2AB\7\3\2\2BC\7\16\2\2CK\5\16\b\2"+
		"DE\7\3\2\2EF\7\4\2\2FG\7\17\2\2GK\7\r\2\2HI\7\3\2\2IK\7\r\2\2J<\3\2\2"+
		"\2JA\3\2\2\2JD\3\2\2\2JH\3\2\2\2K\17\3\2\2\2LM\t\2\2\2M\21\3\2\2\2NO\t"+
		"\3\2\2O\23\3\2\2\2\5\30\36J";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}