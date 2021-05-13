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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, EQ=7, DOUBLE=8, WHILEF=9, 
		IFF=10, FORR=11, INT=12, STRING=13, CHAR=14, FLOAT=15, COMILLAS=16, PARENTESISA=17, 
		PARENTESISC=18, LLAVEA=19, LLAVEC=20, PUNTOCOMA=21, MAS=22, MENOS=23, 
		PRODUCTO=24, DIVISION=25, COMA=26, PALABRA=27, ENTERO=28, COMP=29, WS=30, 
		OTRO=31;
	public static final int
		RULE_programa = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_iwhile = 3, 
		RULE_iif = 4, RULE_ifor = 5, RULE_operador = 6, RULE_asignacion = 7, RULE_operacion = 8, 
		RULE_operadores = 9, RULE_operacionesaritlogicas = 10, RULE_operadorLogico = 11, 
		RULE_declaracion = 12, RULE_declarar = 13, RULE_numerochar = 14, RULE_declaracionfuncion = 15, 
		RULE_parametros = 16, RULE_llamadoFuncion = 17, RULE_concatenacionPalabras = 18, 
		RULE_definicionFunciones = 19, RULE_type = 20, RULE_variable = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucciones", "instruccion", "iwhile", "iif", "ifor", 
			"operador", "asignacion", "operacion", "operadores", "operacionesaritlogicas", 
			"operadorLogico", "declaracion", "declarar", "numerochar", "declaracionfuncion", 
			"parametros", "llamadoFuncion", "concatenacionPalabras", "definicionFunciones", 
			"type", "variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'++'", "'--'", "'&&'", "'||'", "'['", "']'", "'='", "'double'", 
			"'while'", "'if'", "'for'", "'int'", "'string'", "'char'", "'float'", 
			"'\"'", "'('", "')'", "'{'", "'}'", "';'", "'+'", "'-'", "'*'", "'/'", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "EQ", "DOUBLE", "WHILEF", "IFF", 
			"FORR", "INT", "STRING", "CHAR", "FLOAT", "COMILLAS", "PARENTESISA", 
			"PARENTESISC", "LLAVEA", "LLAVEC", "PUNTOCOMA", "MAS", "MENOS", "PRODUCTO", 
			"DIVISION", "COMA", "PALABRA", "ENTERO", "COMP", "WS", "OTRO"
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
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			instrucciones();
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

	public static class InstruccionesContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE:
			case WHILEF:
			case IFF:
			case FORR:
			case INT:
			case CHAR:
			case FLOAT:
			case PALABRA:
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				instruccion();
				setState(47);
				instrucciones();
				}
				break;
			case EOF:
			case LLAVEC:
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
		public IforContext ifor() {
			return getRuleContext(IforContext.class,0);
		}
		public DeclaracionfuncionContext declaracionfuncion() {
			return getRuleContext(DeclaracionfuncionContext.class,0);
		}
		public DefinicionFuncionesContext definicionFunciones() {
			return getRuleContext(DefinicionFuncionesContext.class,0);
		}
		public OperacionesaritlogicasContext operacionesaritlogicas() {
			return getRuleContext(OperacionesaritlogicasContext.class,0);
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
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				declaracion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				asignacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				iwhile();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				iif();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(56);
				ifor();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				declaracionfuncion();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(58);
				definicionFunciones();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(59);
				operacionesaritlogicas();
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

	public static class IwhileContext extends ParserRuleContext {
		public TerminalNode WHILEF() { return getToken(programaParser.WHILEF, 0); }
		public TerminalNode PARENTESISA() { return getToken(programaParser.PARENTESISA, 0); }
		public OperacionesaritlogicasContext operacionesaritlogicas() {
			return getRuleContext(OperacionesaritlogicasContext.class,0);
		}
		public TerminalNode PARENTESISC() { return getToken(programaParser.PARENTESISC, 0); }
		public TerminalNode LLAVEA() { return getToken(programaParser.LLAVEA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
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
		enterRule(_localctx, 6, RULE_iwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(WHILEF);
			setState(63);
			match(PARENTESISA);
			setState(64);
			operacionesaritlogicas();
			setState(65);
			match(PARENTESISC);
			setState(66);
			match(LLAVEA);
			setState(67);
			instrucciones();
			setState(68);
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
		public OperacionesaritlogicasContext operacionesaritlogicas() {
			return getRuleContext(OperacionesaritlogicasContext.class,0);
		}
		public TerminalNode PARENTESISC() { return getToken(programaParser.PARENTESISC, 0); }
		public TerminalNode LLAVEA() { return getToken(programaParser.LLAVEA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
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
		enterRule(_localctx, 8, RULE_iif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(IFF);
			setState(71);
			match(PARENTESISA);
			setState(72);
			operacionesaritlogicas();
			setState(73);
			match(PARENTESISC);
			setState(74);
			match(LLAVEA);
			setState(75);
			instrucciones();
			setState(76);
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

	public static class IforContext extends ParserRuleContext {
		public TerminalNode FORR() { return getToken(programaParser.FORR, 0); }
		public TerminalNode PARENTESISA() { return getToken(programaParser.PARENTESISA, 0); }
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public List<TerminalNode> PALABRA() { return getTokens(programaParser.PALABRA); }
		public TerminalNode PALABRA(int i) {
			return getToken(programaParser.PALABRA, i);
		}
		public TerminalNode COMP() { return getToken(programaParser.COMP, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(programaParser.PUNTOCOMA, 0); }
		public List<OperadorContext> operador() {
			return getRuleContexts(OperadorContext.class);
		}
		public OperadorContext operador(int i) {
			return getRuleContext(OperadorContext.class,i);
		}
		public TerminalNode PARENTESISC() { return getToken(programaParser.PARENTESISC, 0); }
		public TerminalNode LLAVEA() { return getToken(programaParser.LLAVEA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LLAVEC() { return getToken(programaParser.LLAVEC, 0); }
		public IforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterIfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitIfor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitIfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IforContext ifor() throws RecognitionException {
		IforContext _localctx = new IforContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(FORR);
			setState(79);
			match(PARENTESISA);
			setState(80);
			declaracion();
			setState(81);
			match(PALABRA);
			setState(82);
			match(COMP);
			setState(83);
			variable();
			setState(84);
			match(PUNTOCOMA);
			setState(85);
			operador();
			setState(86);
			match(PALABRA);
			setState(87);
			operador();
			setState(88);
			match(PARENTESISC);
			setState(89);
			match(LLAVEA);
			setState(90);
			instrucciones();
			setState(91);
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

	public static class OperadorContext extends ParserRuleContext {
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterOperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitOperador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitOperador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operador);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(T__0);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(T__1);
				}
				break;
			case PARENTESISC:
			case PALABRA:
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode PALABRA() { return getToken(programaParser.PALABRA, 0); }
		public TerminalNode EQ() { return getToken(programaParser.EQ, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
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
		enterRule(_localctx, 14, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(PALABRA);
			setState(99);
			match(EQ);
			setState(100);
			variable();
			setState(101);
			operacion();
			setState(102);
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

	public static class OperacionContext extends ParserRuleContext {
		public OperadoresContext operadores() {
			return getRuleContext(OperadoresContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitOperacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operacion);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				operadores();
				setState(105);
				variable();
				setState(106);
				operacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				operadores();
				setState(109);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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

	public static class OperadoresContext extends ParserRuleContext {
		public TerminalNode MAS() { return getToken(programaParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(programaParser.MENOS, 0); }
		public TerminalNode PRODUCTO() { return getToken(programaParser.PRODUCTO, 0); }
		public TerminalNode DIVISION() { return getToken(programaParser.DIVISION, 0); }
		public OperadoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterOperadores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitOperadores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitOperadores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadoresContext operadores() throws RecognitionException {
		OperadoresContext _localctx = new OperadoresContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operadores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAS) | (1L << MENOS) | (1L << PRODUCTO) | (1L << DIVISION))) != 0)) ) {
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

	public static class OperacionesaritlogicasContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode COMP() { return getToken(programaParser.COMP, 0); }
		public OperacionesaritlogicasContext operacionesaritlogicas() {
			return getRuleContext(OperacionesaritlogicasContext.class,0);
		}
		public OperacionesaritlogicasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacionesaritlogicas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterOperacionesaritlogicas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitOperacionesaritlogicas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitOperacionesaritlogicas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionesaritlogicasContext operacionesaritlogicas() throws RecognitionException {
		OperacionesaritlogicasContext _localctx = new OperacionesaritlogicasContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operacionesaritlogicas);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				variable();
				setState(117);
				match(COMP);
				setState(118);
				variable();
				setState(119);
				match(T__2);
				setState(120);
				operacionesaritlogicas();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				variable();
				setState(123);
				match(COMP);
				setState(124);
				variable();
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

	public static class OperadorLogicoContext extends ParserRuleContext {
		public OperadorLogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorLogico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterOperadorLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitOperadorLogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitOperadorLogico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorLogicoContext operadorLogico() throws RecognitionException {
		OperadorLogicoContext _localctx = new OperadorLogicoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operadorLogico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
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
		enterRule(_localctx, 24, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			type();
			setState(131);
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
		public List<TerminalNode> PALABRA() { return getTokens(programaParser.PALABRA); }
		public TerminalNode PALABRA(int i) {
			return getToken(programaParser.PALABRA, i);
		}
		public TerminalNode EQ() { return getToken(programaParser.EQ, 0); }
		public TerminalNode ENTERO() { return getToken(programaParser.ENTERO, 0); }
		public TerminalNode COMA() { return getToken(programaParser.COMA, 0); }
		public DeclararContext declarar() {
			return getRuleContext(DeclararContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(programaParser.PUNTOCOMA, 0); }
		public NumerocharContext numerochar() {
			return getRuleContext(NumerocharContext.class,0);
		}
		public List<TerminalNode> COMILLAS() { return getTokens(programaParser.COMILLAS); }
		public TerminalNode COMILLAS(int i) {
			return getToken(programaParser.COMILLAS, i);
		}
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
		enterRule(_localctx, 26, RULE_declarar);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(PALABRA);
				setState(134);
				match(EQ);
				setState(135);
				match(ENTERO);
				setState(136);
				match(COMA);
				setState(137);
				declarar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(PALABRA);
				setState(139);
				match(COMA);
				setState(140);
				declarar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				match(PALABRA);
				setState(142);
				match(EQ);
				setState(143);
				match(ENTERO);
				setState(144);
				match(PUNTOCOMA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				match(PALABRA);
				setState(146);
				match(T__4);
				setState(147);
				numerochar();
				setState(148);
				match(T__5);
				setState(149);
				match(EQ);
				setState(150);
				match(COMILLAS);
				setState(151);
				match(PALABRA);
				setState(152);
				match(COMILLAS);
				setState(153);
				match(COMA);
				setState(154);
				declarar();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				match(PALABRA);
				setState(157);
				match(T__4);
				setState(158);
				numerochar();
				setState(159);
				match(T__5);
				setState(160);
				match(EQ);
				setState(161);
				match(COMILLAS);
				setState(162);
				match(PALABRA);
				setState(163);
				match(COMILLAS);
				setState(164);
				match(PUNTOCOMA);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(166);
				match(PALABRA);
				setState(167);
				match(T__4);
				setState(168);
				numerochar();
				setState(169);
				match(T__5);
				setState(170);
				match(COMA);
				setState(171);
				declarar();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(173);
				match(PALABRA);
				setState(174);
				match(T__4);
				setState(175);
				numerochar();
				setState(176);
				match(T__5);
				setState(177);
				match(PUNTOCOMA);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(179);
				match(PALABRA);
				setState(180);
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

	public static class NumerocharContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(programaParser.ENTERO, 0); }
		public TerminalNode PALABRA() { return getToken(programaParser.PALABRA, 0); }
		public NumerocharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numerochar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterNumerochar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitNumerochar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitNumerochar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumerocharContext numerochar() throws RecognitionException {
		NumerocharContext _localctx = new NumerocharContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_numerochar);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(ENTERO);
				}
				break;
			case PALABRA:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(PALABRA);
				}
				break;
			case T__5:
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

	public static class DeclaracionfuncionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode PALABRA() { return getToken(programaParser.PALABRA, 0); }
		public TerminalNode PARENTESISA() { return getToken(programaParser.PARENTESISA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode PARENTESISC() { return getToken(programaParser.PARENTESISC, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(programaParser.PUNTOCOMA, 0); }
		public DeclaracionfuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionfuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterDeclaracionfuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitDeclaracionfuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitDeclaracionfuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionfuncionContext declaracionfuncion() throws RecognitionException {
		DeclaracionfuncionContext _localctx = new DeclaracionfuncionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declaracionfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			type();
			setState(189);
			match(PALABRA);
			setState(190);
			match(PARENTESISA);
			setState(191);
			parametros();
			setState(192);
			match(PARENTESISC);
			setState(193);
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

	public static class ParametrosContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode PALABRA() { return getToken(programaParser.PALABRA, 0); }
		public TerminalNode COMA() { return getToken(programaParser.COMA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parametros);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				type();
				setState(196);
				match(PALABRA);
				setState(197);
				match(COMA);
				setState(198);
				parametros();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				type();
				setState(201);
				match(PALABRA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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

	public static class LlamadoFuncionContext extends ParserRuleContext {
		public TerminalNode PALABRA() { return getToken(programaParser.PALABRA, 0); }
		public TerminalNode PARENTESISA() { return getToken(programaParser.PARENTESISA, 0); }
		public ConcatenacionPalabrasContext concatenacionPalabras() {
			return getRuleContext(ConcatenacionPalabrasContext.class,0);
		}
		public TerminalNode PARENTESISC() { return getToken(programaParser.PARENTESISC, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(programaParser.PUNTOCOMA, 0); }
		public LlamadoFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadoFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterLlamadoFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitLlamadoFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitLlamadoFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlamadoFuncionContext llamadoFuncion() throws RecognitionException {
		LlamadoFuncionContext _localctx = new LlamadoFuncionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_llamadoFuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(PALABRA);
			setState(207);
			match(PARENTESISA);
			setState(208);
			concatenacionPalabras();
			setState(209);
			match(PARENTESISC);
			setState(210);
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

	public static class ConcatenacionPalabrasContext extends ParserRuleContext {
		public TerminalNode PALABRA() { return getToken(programaParser.PALABRA, 0); }
		public TerminalNode COMA() { return getToken(programaParser.COMA, 0); }
		public ConcatenacionPalabrasContext concatenacionPalabras() {
			return getRuleContext(ConcatenacionPalabrasContext.class,0);
		}
		public ConcatenacionPalabrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatenacionPalabras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterConcatenacionPalabras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitConcatenacionPalabras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitConcatenacionPalabras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcatenacionPalabrasContext concatenacionPalabras() throws RecognitionException {
		ConcatenacionPalabrasContext _localctx = new ConcatenacionPalabrasContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_concatenacionPalabras);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(PALABRA);
				setState(213);
				match(COMA);
				setState(214);
				concatenacionPalabras();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(PALABRA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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

	public static class DefinicionFuncionesContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode PALABRA() { return getToken(programaParser.PALABRA, 0); }
		public TerminalNode PARENTESISA() { return getToken(programaParser.PARENTESISA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode PARENTESISC() { return getToken(programaParser.PARENTESISC, 0); }
		public TerminalNode LLAVEA() { return getToken(programaParser.LLAVEA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LLAVEC() { return getToken(programaParser.LLAVEC, 0); }
		public DefinicionFuncionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicionFunciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterDefinicionFunciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitDefinicionFunciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitDefinicionFunciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinicionFuncionesContext definicionFunciones() throws RecognitionException {
		DefinicionFuncionesContext _localctx = new DefinicionFuncionesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_definicionFunciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			type();
			setState(220);
			match(PALABRA);
			setState(221);
			match(PARENTESISA);
			setState(222);
			parametros();
			setState(223);
			match(PARENTESISC);
			setState(224);
			match(LLAVEA);
			setState(225);
			instrucciones();
			setState(226);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(programaParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(programaParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(programaParser.CHAR, 0); }
		public TerminalNode FLOAT() { return getToken(programaParser.FLOAT, 0); }
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
		enterRule(_localctx, 40, RULE_type);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(DOUBLE);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(INT);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				match(CHAR);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				match(FLOAT);
				}
				break;
			case PALABRA:
				enterOuterAlt(_localctx, 5);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode PALABRA() { return getToken(programaParser.PALABRA, 0); }
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
		enterRule(_localctx, 42, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_la = _input.LA(1);
			if ( !(_la==PALABRA || _la==ENTERO) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00f0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\5\3\65\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\bc\n\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\ns\n\n\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0081\n\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b8\n\17\3\20\3\20\3\20\5\20"+
		"\u00bd\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u00cf\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00dc\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u00ec\n\26\3\27\3\27\3\27\2\2"+
		"\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\5\3\2\30\33\3\2\5"+
		"\6\3\2\35\36\2\u00f7\2.\3\2\2\2\4\64\3\2\2\2\6>\3\2\2\2\b@\3\2\2\2\nH"+
		"\3\2\2\2\fP\3\2\2\2\16b\3\2\2\2\20d\3\2\2\2\22r\3\2\2\2\24t\3\2\2\2\26"+
		"\u0080\3\2\2\2\30\u0082\3\2\2\2\32\u0084\3\2\2\2\34\u00b7\3\2\2\2\36\u00bc"+
		"\3\2\2\2 \u00be\3\2\2\2\"\u00ce\3\2\2\2$\u00d0\3\2\2\2&\u00db\3\2\2\2"+
		"(\u00dd\3\2\2\2*\u00eb\3\2\2\2,\u00ed\3\2\2\2./\5\4\3\2/\3\3\2\2\2\60"+
		"\61\5\6\4\2\61\62\5\4\3\2\62\65\3\2\2\2\63\65\3\2\2\2\64\60\3\2\2\2\64"+
		"\63\3\2\2\2\65\5\3\2\2\2\66?\5\32\16\2\67?\5\20\t\28?\5\b\5\29?\5\n\6"+
		"\2:?\5\f\7\2;?\5 \21\2<?\5(\25\2=?\5\26\f\2>\66\3\2\2\2>\67\3\2\2\2>8"+
		"\3\2\2\2>9\3\2\2\2>:\3\2\2\2>;\3\2\2\2><\3\2\2\2>=\3\2\2\2?\7\3\2\2\2"+
		"@A\7\13\2\2AB\7\23\2\2BC\5\26\f\2CD\7\24\2\2DE\7\25\2\2EF\5\4\3\2FG\7"+
		"\26\2\2G\t\3\2\2\2HI\7\f\2\2IJ\7\23\2\2JK\5\26\f\2KL\7\24\2\2LM\7\25\2"+
		"\2MN\5\4\3\2NO\7\26\2\2O\13\3\2\2\2PQ\7\r\2\2QR\7\23\2\2RS\5\32\16\2S"+
		"T\7\35\2\2TU\7\37\2\2UV\5,\27\2VW\7\27\2\2WX\5\16\b\2XY\7\35\2\2YZ\5\16"+
		"\b\2Z[\7\24\2\2[\\\7\25\2\2\\]\5\4\3\2]^\7\26\2\2^\r\3\2\2\2_c\7\3\2\2"+
		"`c\7\4\2\2ac\3\2\2\2b_\3\2\2\2b`\3\2\2\2ba\3\2\2\2c\17\3\2\2\2de\7\35"+
		"\2\2ef\7\t\2\2fg\5,\27\2gh\5\22\n\2hi\7\27\2\2i\21\3\2\2\2jk\5\24\13\2"+
		"kl\5,\27\2lm\5\22\n\2ms\3\2\2\2no\5\24\13\2op\5,\27\2ps\3\2\2\2qs\3\2"+
		"\2\2rj\3\2\2\2rn\3\2\2\2rq\3\2\2\2s\23\3\2\2\2tu\t\2\2\2u\25\3\2\2\2v"+
		"w\5,\27\2wx\7\37\2\2xy\5,\27\2yz\7\5\2\2z{\5\26\f\2{\u0081\3\2\2\2|}\5"+
		",\27\2}~\7\37\2\2~\177\5,\27\2\177\u0081\3\2\2\2\u0080v\3\2\2\2\u0080"+
		"|\3\2\2\2\u0081\27\3\2\2\2\u0082\u0083\t\3\2\2\u0083\31\3\2\2\2\u0084"+
		"\u0085\5*\26\2\u0085\u0086\5\34\17\2\u0086\33\3\2\2\2\u0087\u0088\7\35"+
		"\2\2\u0088\u0089\7\t\2\2\u0089\u008a\7\36\2\2\u008a\u008b\7\34\2\2\u008b"+
		"\u00b8\5\34\17\2\u008c\u008d\7\35\2\2\u008d\u008e\7\34\2\2\u008e\u00b8"+
		"\5\34\17\2\u008f\u0090\7\35\2\2\u0090\u0091\7\t\2\2\u0091\u0092\7\36\2"+
		"\2\u0092\u00b8\7\27\2\2\u0093\u0094\7\35\2\2\u0094\u0095\7\7\2\2\u0095"+
		"\u0096\5\36\20\2\u0096\u0097\7\b\2\2\u0097\u0098\7\t\2\2\u0098\u0099\7"+
		"\22\2\2\u0099\u009a\7\35\2\2\u009a\u009b\7\22\2\2\u009b\u009c\7\34\2\2"+
		"\u009c\u009d\5\34\17\2\u009d\u00b8\3\2\2\2\u009e\u009f\7\35\2\2\u009f"+
		"\u00a0\7\7\2\2\u00a0\u00a1\5\36\20\2\u00a1\u00a2\7\b\2\2\u00a2\u00a3\7"+
		"\t\2\2\u00a3\u00a4\7\22\2\2\u00a4\u00a5\7\35\2\2\u00a5\u00a6\7\22\2\2"+
		"\u00a6\u00a7\7\27\2\2\u00a7\u00b8\3\2\2\2\u00a8\u00a9\7\35\2\2\u00a9\u00aa"+
		"\7\7\2\2\u00aa\u00ab\5\36\20\2\u00ab\u00ac\7\b\2\2\u00ac\u00ad\7\34\2"+
		"\2\u00ad\u00ae\5\34\17\2\u00ae\u00b8\3\2\2\2\u00af\u00b0\7\35\2\2\u00b0"+
		"\u00b1\7\7\2\2\u00b1\u00b2\5\36\20\2\u00b2\u00b3\7\b\2\2\u00b3\u00b4\7"+
		"\27\2\2\u00b4\u00b8\3\2\2\2\u00b5\u00b6\7\35\2\2\u00b6\u00b8\7\27\2\2"+
		"\u00b7\u0087\3\2\2\2\u00b7\u008c\3\2\2\2\u00b7\u008f\3\2\2\2\u00b7\u0093"+
		"\3\2\2\2\u00b7\u009e\3\2\2\2\u00b7\u00a8\3\2\2\2\u00b7\u00af\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\35\3\2\2\2\u00b9\u00bd\7\36\2\2\u00ba\u00bd\7\35"+
		"\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bb\3\2\2\2\u00bd\37\3\2\2\2\u00be\u00bf\5*\26\2\u00bf\u00c0\7\35\2"+
		"\2\u00c0\u00c1\7\23\2\2\u00c1\u00c2\5\"\22\2\u00c2\u00c3\7\24\2\2\u00c3"+
		"\u00c4\7\27\2\2\u00c4!\3\2\2\2\u00c5\u00c6\5*\26\2\u00c6\u00c7\7\35\2"+
		"\2\u00c7\u00c8\7\34\2\2\u00c8\u00c9\5\"\22\2\u00c9\u00cf\3\2\2\2\u00ca"+
		"\u00cb\5*\26\2\u00cb\u00cc\7\35\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cf\3"+
		"\2\2\2\u00ce\u00c5\3\2\2\2\u00ce\u00ca\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf"+
		"#\3\2\2\2\u00d0\u00d1\7\35\2\2\u00d1\u00d2\7\23\2\2\u00d2\u00d3\5&\24"+
		"\2\u00d3\u00d4\7\24\2\2\u00d4\u00d5\7\27\2\2\u00d5%\3\2\2\2\u00d6\u00d7"+
		"\7\35\2\2\u00d7\u00d8\7\34\2\2\u00d8\u00dc\5&\24\2\u00d9\u00dc\7\35\2"+
		"\2\u00da\u00dc\3\2\2\2\u00db\u00d6\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00da"+
		"\3\2\2\2\u00dc\'\3\2\2\2\u00dd\u00de\5*\26\2\u00de\u00df\7\35\2\2\u00df"+
		"\u00e0\7\23\2\2\u00e0\u00e1\5\"\22\2\u00e1\u00e2\7\24\2\2\u00e2\u00e3"+
		"\7\25\2\2\u00e3\u00e4\5\4\3\2\u00e4\u00e5\7\26\2\2\u00e5)\3\2\2\2\u00e6"+
		"\u00ec\7\n\2\2\u00e7\u00ec\7\16\2\2\u00e8\u00ec\7\20\2\2\u00e9\u00ec\7"+
		"\21\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e6\3\2\2\2\u00eb\u00e7\3\2\2\2\u00eb"+
		"\u00e8\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec+\3\2\2\2"+
		"\u00ed\u00ee\t\4\2\2\u00ee-\3\2\2\2\f\64>br\u0080\u00b7\u00bc\u00ce\u00db"+
		"\u00eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}