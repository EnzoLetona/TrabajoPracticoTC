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
		IFF=10, FORR=11, INT=12, STRING=13, VOID=14, CHAR=15, FLOAT=16, COMILLAS=17, 
		RETURN=18, PARENTESISA=19, PARENTESISC=20, LLAVEA=21, LLAVEC=22, PUNTOCOMA=23, 
		MAS=24, MENOS=25, PRODUCTO=26, DIVISION=27, COMA=28, PALABRA=29, VARIABLENUMERO=30, 
		ENTERO=31, COMP=32, WS=33, OTRO=34;
	public static final int
		RULE_programa = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_bloque = 3, 
		RULE_iwhile = 4, RULE_iif = 5, RULE_ifor = 6, RULE_declaracionIndice = 7, 
		RULE_declararIndice = 8, RULE_operador = 9, RULE_asignacion = 10, RULE_operacion = 11, 
		RULE_operadores = 12, RULE_operacionesaritlogicas = 13, RULE_operadorLogico = 14, 
		RULE_declaracion = 15, RULE_declarar = 16, RULE_declararConDef = 17, RULE_declararSinDef = 18, 
		RULE_declaracionChar = 19, RULE_declararChar = 20, RULE_numerochar = 21, 
		RULE_declaracionfuncion = 22, RULE_reglaParentesisA = 23, RULE_reglaParentesisC = 24, 
		RULE_nombreFuncion = 25, RULE_parametrosSinDef = 26, RULE_parametros = 27, 
		RULE_nombreParametro = 28, RULE_llamadoFuncion = 29, RULE_concatenacionPalabras = 30, 
		RULE_definicionFunciones = 31, RULE_typeFunctions = 32, RULE_type = 33, 
		RULE_returnss = 34, RULE_variable = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucciones", "instruccion", "bloque", "iwhile", "iif", 
			"ifor", "declaracionIndice", "declararIndice", "operador", "asignacion", 
			"operacion", "operadores", "operacionesaritlogicas", "operadorLogico", 
			"declaracion", "declarar", "declararConDef", "declararSinDef", "declaracionChar", 
			"declararChar", "numerochar", "declaracionfuncion", "reglaParentesisA", 
			"reglaParentesisC", "nombreFuncion", "parametrosSinDef", "parametros", 
			"nombreParametro", "llamadoFuncion", "concatenacionPalabras", "definicionFunciones", 
			"typeFunctions", "type", "returnss", "variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'++'", "'--'", "'&&'", "'||'", "'['", "']'", "'='", "'double'", 
			"'while'", "'if'", "'for'", "'int'", "'string'", "'void'", "'char'", 
			"'float'", "'\"'", "'return'", "'('", "')'", "'{'", "'}'", "';'", "'+'", 
			"'-'", "'*'", "'/'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "EQ", "DOUBLE", "WHILEF", "IFF", 
			"FORR", "INT", "STRING", "VOID", "CHAR", "FLOAT", "COMILLAS", "RETURN", 
			"PARENTESISA", "PARENTESISC", "LLAVEA", "LLAVEC", "PUNTOCOMA", "MAS", 
			"MENOS", "PRODUCTO", "DIVISION", "COMA", "PALABRA", "VARIABLENUMERO", 
			"ENTERO", "COMP", "WS", "OTRO"
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
			setState(72);
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
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE:
			case WHILEF:
			case IFF:
			case FORR:
			case INT:
			case VOID:
			case CHAR:
			case FLOAT:
			case RETURN:
			case LLAVEA:
			case PALABRA:
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				instruccion();
				setState(75);
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
		public LlamadoFuncionContext llamadoFuncion() {
			return getRuleContext(LlamadoFuncionContext.class,0);
		}
		public ReturnssContext returnss() {
			return getRuleContext(ReturnssContext.class,0);
		}
		public DeclaracionCharContext declaracionChar() {
			return getRuleContext(DeclaracionCharContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
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
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				declaracion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				asignacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				iwhile();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				iif();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				ifor();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				declaracionfuncion();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(86);
				definicionFunciones();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(87);
				operacionesaritlogicas();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(88);
				llamadoFuncion();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(89);
				returnss();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(90);
				declaracionChar();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(91);
				bloque();
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

	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LLAVEA() { return getToken(programaParser.LLAVEA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LLAVEC() { return getToken(programaParser.LLAVEC, 0); }
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(LLAVEA);
			setState(95);
			instrucciones();
			setState(96);
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

	public static class IwhileContext extends ParserRuleContext {
		public TerminalNode WHILEF() { return getToken(programaParser.WHILEF, 0); }
		public ReglaParentesisAContext reglaParentesisA() {
			return getRuleContext(ReglaParentesisAContext.class,0);
		}
		public OperacionesaritlogicasContext operacionesaritlogicas() {
			return getRuleContext(OperacionesaritlogicasContext.class,0);
		}
		public TerminalNode PARENTESISC() { return getToken(programaParser.PARENTESISC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
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
		enterRule(_localctx, 8, RULE_iwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(WHILEF);
			setState(99);
			reglaParentesisA();
			setState(100);
			operacionesaritlogicas();
			setState(101);
			match(PARENTESISC);
			setState(102);
			bloque();
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
		public ReglaParentesisAContext reglaParentesisA() {
			return getRuleContext(ReglaParentesisAContext.class,0);
		}
		public OperacionesaritlogicasContext operacionesaritlogicas() {
			return getRuleContext(OperacionesaritlogicasContext.class,0);
		}
		public TerminalNode PARENTESISC() { return getToken(programaParser.PARENTESISC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
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
		enterRule(_localctx, 10, RULE_iif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(IFF);
			setState(105);
			reglaParentesisA();
			setState(106);
			operacionesaritlogicas();
			setState(107);
			match(PARENTESISC);
			setState(108);
			bloque();
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
		public DeclaracionIndiceContext declaracionIndice() {
			return getRuleContext(DeclaracionIndiceContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode COMP() { return getToken(programaParser.COMP, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(programaParser.PUNTOCOMA, 0); }
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public TerminalNode PARENTESISC() { return getToken(programaParser.PARENTESISC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_ifor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(FORR);
			setState(111);
			match(PARENTESISA);
			setState(112);
			declaracionIndice();
			setState(113);
			variable();
			setState(114);
			match(COMP);
			setState(115);
			variable();
			setState(116);
			match(PUNTOCOMA);
			setState(117);
			variable();
			setState(118);
			operador();
			setState(119);
			match(PARENTESISC);
			setState(120);
			bloque();
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

	public static class DeclaracionIndiceContext extends ParserRuleContext {
		public DeclararIndiceContext declararIndice() {
			return getRuleContext(DeclararIndiceContext.class,0);
		}
		public DeclaracionIndiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionIndice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterDeclaracionIndice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitDeclaracionIndice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitDeclaracionIndice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionIndiceContext declaracionIndice() throws RecognitionException {
		DeclaracionIndiceContext _localctx = new DeclaracionIndiceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracionIndice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			declararIndice();
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

	public static class DeclararIndiceContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode EQ() { return getToken(programaParser.EQ, 0); }
		public TerminalNode COMA() { return getToken(programaParser.COMA, 0); }
		public DeclararIndiceContext declararIndice() {
			return getRuleContext(DeclararIndiceContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(programaParser.PUNTOCOMA, 0); }
		public DeclararIndiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declararIndice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterDeclararIndice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitDeclararIndice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitDeclararIndice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararIndiceContext declararIndice() throws RecognitionException {
		DeclararIndiceContext _localctx = new DeclararIndiceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declararIndice);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				variable();
				setState(125);
				match(EQ);
				setState(126);
				variable();
				setState(127);
				match(COMA);
				setState(128);
				declararIndice();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				variable();
				setState(131);
				match(EQ);
				setState(132);
				variable();
				setState(133);
				match(PUNTOCOMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				variable();
				setState(136);
				match(COMA);
				setState(137);
				declararIndice();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				variable();
				setState(140);
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
		enterRule(_localctx, 18, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
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
		enterRule(_localctx, 20, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(PALABRA);
			setState(147);
			match(EQ);
			setState(148);
			variable();
			setState(149);
			operacion();
			setState(150);
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
		enterRule(_localctx, 22, RULE_operacion);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				operadores();
				setState(153);
				variable();
				setState(154);
				operacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				operadores();
				setState(157);
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
		enterRule(_localctx, 24, RULE_operadores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
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
		public OperadorLogicoContext operadorLogico() {
			return getRuleContext(OperadorLogicoContext.class,0);
		}
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
		enterRule(_localctx, 26, RULE_operacionesaritlogicas);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				variable();
				setState(165);
				match(COMP);
				setState(166);
				variable();
				setState(167);
				operadorLogico();
				setState(168);
				operacionesaritlogicas();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				variable();
				setState(171);
				match(COMP);
				setState(172);
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
		enterRule(_localctx, 28, RULE_operadorLogico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
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
		enterRule(_localctx, 30, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			type();
			setState(179);
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
		public DeclararConDefContext declararConDef() {
			return getRuleContext(DeclararConDefContext.class,0);
		}
		public DeclararSinDefContext declararSinDef() {
			return getRuleContext(DeclararSinDefContext.class,0);
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
		enterRule(_localctx, 32, RULE_declarar);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				declararConDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				declararSinDef();
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

	public static class DeclararConDefContext extends ParserRuleContext {
		public TerminalNode PALABRA() { return getToken(programaParser.PALABRA, 0); }
		public TerminalNode EQ() { return getToken(programaParser.EQ, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode COMA() { return getToken(programaParser.COMA, 0); }
		public DeclararContext declarar() {
			return getRuleContext(DeclararContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(programaParser.PUNTOCOMA, 0); }
		public DeclararConDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declararConDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterDeclararConDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitDeclararConDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitDeclararConDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararConDefContext declararConDef() throws RecognitionException {
		DeclararConDefContext _localctx = new DeclararConDefContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declararConDef);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(PALABRA);
				setState(186);
				match(EQ);
				setState(187);
				variable();
				setState(188);
				match(COMA);
				setState(189);
				declarar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(PALABRA);
				setState(192);
				match(EQ);
				setState(193);
				variable();
				setState(194);
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

	public static class DeclararSinDefContext extends ParserRuleContext {
		public TerminalNode PALABRA() { return getToken(programaParser.PALABRA, 0); }
		public TerminalNode COMA() { return getToken(programaParser.COMA, 0); }
		public DeclararContext declarar() {
			return getRuleContext(DeclararContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(programaParser.PUNTOCOMA, 0); }
		public DeclararSinDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declararSinDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterDeclararSinDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitDeclararSinDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitDeclararSinDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararSinDefContext declararSinDef() throws RecognitionException {
		DeclararSinDefContext _localctx = new DeclararSinDefContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declararSinDef);
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(PALABRA);
				setState(199);
				match(COMA);
				setState(200);
				declarar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(PALABRA);
				setState(202);
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

	public static class DeclaracionCharContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(programaParser.CHAR, 0); }
		public DeclararCharContext declararChar() {
			return getRuleContext(DeclararCharContext.class,0);
		}
		public DeclaracionCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterDeclaracionChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitDeclaracionChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitDeclaracionChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionCharContext declaracionChar() throws RecognitionException {
		DeclaracionCharContext _localctx = new DeclaracionCharContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_declaracionChar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(CHAR);
			setState(206);
			declararChar();
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

	public static class DeclararCharContext extends ParserRuleContext {
		public List<TerminalNode> PALABRA() { return getTokens(programaParser.PALABRA); }
		public TerminalNode PALABRA(int i) {
			return getToken(programaParser.PALABRA, i);
		}
		public NumerocharContext numerochar() {
			return getRuleContext(NumerocharContext.class,0);
		}
		public TerminalNode EQ() { return getToken(programaParser.EQ, 0); }
		public List<TerminalNode> COMILLAS() { return getTokens(programaParser.COMILLAS); }
		public TerminalNode COMILLAS(int i) {
			return getToken(programaParser.COMILLAS, i);
		}
		public TerminalNode COMA() { return getToken(programaParser.COMA, 0); }
		public DeclararCharContext declararChar() {
			return getRuleContext(DeclararCharContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(programaParser.PUNTOCOMA, 0); }
		public DeclararCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declararChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterDeclararChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitDeclararChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitDeclararChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararCharContext declararChar() throws RecognitionException {
		DeclararCharContext _localctx = new DeclararCharContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declararChar);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(PALABRA);
				setState(209);
				match(T__4);
				setState(210);
				numerochar();
				setState(211);
				match(T__5);
				setState(212);
				match(EQ);
				setState(213);
				match(COMILLAS);
				setState(214);
				match(PALABRA);
				setState(215);
				match(COMILLAS);
				setState(216);
				match(COMA);
				setState(217);
				declararChar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(PALABRA);
				setState(220);
				match(T__4);
				setState(221);
				numerochar();
				setState(222);
				match(T__5);
				setState(223);
				match(EQ);
				setState(224);
				match(COMILLAS);
				setState(225);
				match(PALABRA);
				setState(226);
				match(COMILLAS);
				setState(227);
				match(PUNTOCOMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				match(PALABRA);
				setState(230);
				match(T__4);
				setState(231);
				numerochar();
				setState(232);
				match(T__5);
				setState(233);
				match(COMA);
				setState(234);
				declararChar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				match(PALABRA);
				setState(237);
				match(T__4);
				setState(238);
				numerochar();
				setState(239);
				match(T__5);
				setState(240);
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
		enterRule(_localctx, 42, RULE_numerochar);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(ENTERO);
				}
				break;
			case PALABRA:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
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
		public TypeFunctionsContext typeFunctions() {
			return getRuleContext(TypeFunctionsContext.class,0);
		}
		public NombreFuncionContext nombreFuncion() {
			return getRuleContext(NombreFuncionContext.class,0);
		}
		public ReglaParentesisAContext reglaParentesisA() {
			return getRuleContext(ReglaParentesisAContext.class,0);
		}
		public ParametrosSinDefContext parametrosSinDef() {
			return getRuleContext(ParametrosSinDefContext.class,0);
		}
		public ReglaParentesisCContext reglaParentesisC() {
			return getRuleContext(ReglaParentesisCContext.class,0);
		}
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
		enterRule(_localctx, 44, RULE_declaracionfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			typeFunctions();
			setState(250);
			nombreFuncion();
			setState(251);
			reglaParentesisA();
			setState(252);
			parametrosSinDef();
			setState(253);
			reglaParentesisC();
			setState(254);
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

	public static class ReglaParentesisAContext extends ParserRuleContext {
		public TerminalNode PARENTESISA() { return getToken(programaParser.PARENTESISA, 0); }
		public ReglaParentesisAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reglaParentesisA; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterReglaParentesisA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitReglaParentesisA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitReglaParentesisA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReglaParentesisAContext reglaParentesisA() throws RecognitionException {
		ReglaParentesisAContext _localctx = new ReglaParentesisAContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_reglaParentesisA);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARENTESISA:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(PARENTESISA);
				}
				break;
			case DOUBLE:
			case INT:
			case FLOAT:
			case PARENTESISC:
			case PUNTOCOMA:
			case PALABRA:
			case ENTERO:
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

	public static class ReglaParentesisCContext extends ParserRuleContext {
		public TerminalNode PARENTESISC() { return getToken(programaParser.PARENTESISC, 0); }
		public ReglaParentesisCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reglaParentesisC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterReglaParentesisC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitReglaParentesisC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitReglaParentesisC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReglaParentesisCContext reglaParentesisC() throws RecognitionException {
		ReglaParentesisCContext _localctx = new ReglaParentesisCContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_reglaParentesisC);
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARENTESISC:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(PARENTESISC);
				}
				break;
			case PUNTOCOMA:
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

	public static class NombreFuncionContext extends ParserRuleContext {
		public TerminalNode PALABRA() { return getToken(programaParser.PALABRA, 0); }
		public NombreFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombreFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterNombreFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitNombreFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitNombreFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NombreFuncionContext nombreFuncion() throws RecognitionException {
		NombreFuncionContext _localctx = new NombreFuncionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_nombreFuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(PALABRA);
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

	public static class ParametrosSinDefContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COMA() { return getToken(programaParser.COMA, 0); }
		public ParametrosSinDefContext parametrosSinDef() {
			return getRuleContext(ParametrosSinDefContext.class,0);
		}
		public ParametrosSinDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosSinDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterParametrosSinDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitParametrosSinDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitParametrosSinDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosSinDefContext parametrosSinDef() throws RecognitionException {
		ParametrosSinDefContext _localctx = new ParametrosSinDefContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_parametrosSinDef);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				type();
				setState(267);
				match(COMA);
				setState(268);
				parametrosSinDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				type();
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

	public static class ParametrosContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NombreParametroContext nombreParametro() {
			return getRuleContext(NombreParametroContext.class,0);
		}
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
		enterRule(_localctx, 54, RULE_parametros);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				type();
				setState(275);
				nombreParametro();
				setState(276);
				match(COMA);
				setState(277);
				parametros();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				type();
				setState(280);
				nombreParametro();
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

	public static class NombreParametroContext extends ParserRuleContext {
		public TerminalNode PALABRA() { return getToken(programaParser.PALABRA, 0); }
		public NombreParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombreParametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterNombreParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitNombreParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitNombreParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NombreParametroContext nombreParametro() throws RecognitionException {
		NombreParametroContext _localctx = new NombreParametroContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_nombreParametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(PALABRA);
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
		public ReglaParentesisAContext reglaParentesisA() {
			return getRuleContext(ReglaParentesisAContext.class,0);
		}
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
		enterRule(_localctx, 58, RULE_llamadoFuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(PALABRA);
			setState(288);
			reglaParentesisA();
			setState(289);
			concatenacionPalabras();
			setState(290);
			match(PARENTESISC);
			setState(291);
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
		enterRule(_localctx, 60, RULE_concatenacionPalabras);
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				match(PALABRA);
				setState(294);
				match(COMA);
				setState(295);
				concatenacionPalabras();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
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
		public TypeFunctionsContext typeFunctions() {
			return getRuleContext(TypeFunctionsContext.class,0);
		}
		public NombreFuncionContext nombreFuncion() {
			return getRuleContext(NombreFuncionContext.class,0);
		}
		public ReglaParentesisAContext reglaParentesisA() {
			return getRuleContext(ReglaParentesisAContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode PARENTESISC() { return getToken(programaParser.PARENTESISC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
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
		enterRule(_localctx, 62, RULE_definicionFunciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			typeFunctions();
			setState(301);
			nombreFuncion();
			setState(302);
			reglaParentesisA();
			setState(303);
			parametros();
			setState(304);
			match(PARENTESISC);
			setState(305);
			bloque();
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

	public static class TypeFunctionsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(programaParser.VOID, 0); }
		public TypeFunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeFunctions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterTypeFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitTypeFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitTypeFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeFunctionsContext typeFunctions() throws RecognitionException {
		TypeFunctionsContext _localctx = new TypeFunctionsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_typeFunctions);
		try {
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(VOID);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(programaParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(programaParser.INT, 0); }
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
		enterRule(_localctx, 66, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
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

	public static class ReturnssContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(programaParser.RETURN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(programaParser.PUNTOCOMA, 0); }
		public LlamadoFuncionContext llamadoFuncion() {
			return getRuleContext(LlamadoFuncionContext.class,0);
		}
		public ReturnssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterReturnss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitReturnss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitReturnss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnssContext returnss() throws RecognitionException {
		ReturnssContext _localctx = new ReturnssContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_returnss);
		try {
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(RETURN);
				setState(314);
				variable();
				setState(315);
				match(PUNTOCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				match(RETURN);
				setState(318);
				llamadoFuncion();
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
		enterRule(_localctx, 70, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u0146\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\3\3\3\5\3Q\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4_\n\4\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0091\n\n\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a3\n\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b1\n\17\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\5\22\u00ba\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u00c7\n\23\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u00ce\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00f5\n\26"+
		"\3\27\3\27\3\27\5\27\u00fa\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\5\31\u0105\n\31\3\32\3\32\5\32\u0109\n\32\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\5\34\u0113\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u011e\n\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 "+
		"\3 \3 \3 \3 \5 \u012d\n \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\5\"\u0138\n\"\3"+
		"#\3#\3$\3$\3$\3$\3$\3$\5$\u0142\n$\3%\3%\3%\2\2&\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\7\3\2\3\4\3\2\32\35"+
		"\3\2\5\6\5\2\n\n\16\16\22\22\4\2\37\37!!\2\u0145\2J\3\2\2\2\4P\3\2\2\2"+
		"\6^\3\2\2\2\b`\3\2\2\2\nd\3\2\2\2\fj\3\2\2\2\16p\3\2\2\2\20|\3\2\2\2\22"+
		"\u0090\3\2\2\2\24\u0092\3\2\2\2\26\u0094\3\2\2\2\30\u00a2\3\2\2\2\32\u00a4"+
		"\3\2\2\2\34\u00b0\3\2\2\2\36\u00b2\3\2\2\2 \u00b4\3\2\2\2\"\u00b9\3\2"+
		"\2\2$\u00c6\3\2\2\2&\u00cd\3\2\2\2(\u00cf\3\2\2\2*\u00f4\3\2\2\2,\u00f9"+
		"\3\2\2\2.\u00fb\3\2\2\2\60\u0104\3\2\2\2\62\u0108\3\2\2\2\64\u010a\3\2"+
		"\2\2\66\u0112\3\2\2\28\u011d\3\2\2\2:\u011f\3\2\2\2<\u0121\3\2\2\2>\u012c"+
		"\3\2\2\2@\u012e\3\2\2\2B\u0137\3\2\2\2D\u0139\3\2\2\2F\u0141\3\2\2\2H"+
		"\u0143\3\2\2\2JK\5\4\3\2K\3\3\2\2\2LM\5\6\4\2MN\5\4\3\2NQ\3\2\2\2OQ\3"+
		"\2\2\2PL\3\2\2\2PO\3\2\2\2Q\5\3\2\2\2R_\5 \21\2S_\5\26\f\2T_\5\n\6\2U"+
		"_\5\f\7\2V_\5\16\b\2W_\5.\30\2X_\5@!\2Y_\5\34\17\2Z_\5<\37\2[_\5F$\2\\"+
		"_\5(\25\2]_\5\b\5\2^R\3\2\2\2^S\3\2\2\2^T\3\2\2\2^U\3\2\2\2^V\3\2\2\2"+
		"^W\3\2\2\2^X\3\2\2\2^Y\3\2\2\2^Z\3\2\2\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2"+
		"\2_\7\3\2\2\2`a\7\27\2\2ab\5\4\3\2bc\7\30\2\2c\t\3\2\2\2de\7\13\2\2ef"+
		"\5\60\31\2fg\5\34\17\2gh\7\26\2\2hi\5\b\5\2i\13\3\2\2\2jk\7\f\2\2kl\5"+
		"\60\31\2lm\5\34\17\2mn\7\26\2\2no\5\b\5\2o\r\3\2\2\2pq\7\r\2\2qr\7\25"+
		"\2\2rs\5\20\t\2st\5H%\2tu\7\"\2\2uv\5H%\2vw\7\31\2\2wx\5H%\2xy\5\24\13"+
		"\2yz\7\26\2\2z{\5\b\5\2{\17\3\2\2\2|}\5\22\n\2}\21\3\2\2\2~\177\5H%\2"+
		"\177\u0080\7\t\2\2\u0080\u0081\5H%\2\u0081\u0082\7\36\2\2\u0082\u0083"+
		"\5\22\n\2\u0083\u0091\3\2\2\2\u0084\u0085\5H%\2\u0085\u0086\7\t\2\2\u0086"+
		"\u0087\5H%\2\u0087\u0088\7\31\2\2\u0088\u0091\3\2\2\2\u0089\u008a\5H%"+
		"\2\u008a\u008b\7\36\2\2\u008b\u008c\5\22\n\2\u008c\u0091\3\2\2\2\u008d"+
		"\u008e\5H%\2\u008e\u008f\7\31\2\2\u008f\u0091\3\2\2\2\u0090~\3\2\2\2\u0090"+
		"\u0084\3\2\2\2\u0090\u0089\3\2\2\2\u0090\u008d\3\2\2\2\u0091\23\3\2\2"+
		"\2\u0092\u0093\t\2\2\2\u0093\25\3\2\2\2\u0094\u0095\7\37\2\2\u0095\u0096"+
		"\7\t\2\2\u0096\u0097\5H%\2\u0097\u0098\5\30\r\2\u0098\u0099\7\31\2\2\u0099"+
		"\27\3\2\2\2\u009a\u009b\5\32\16\2\u009b\u009c\5H%\2\u009c\u009d\5\30\r"+
		"\2\u009d\u00a3\3\2\2\2\u009e\u009f\5\32\16\2\u009f\u00a0\5H%\2\u00a0\u00a3"+
		"\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u009a\3\2\2\2\u00a2\u009e\3\2\2\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\31\3\2\2\2\u00a4\u00a5\t\3\2\2\u00a5\33\3\2\2\2\u00a6"+
		"\u00a7\5H%\2\u00a7\u00a8\7\"\2\2\u00a8\u00a9\5H%\2\u00a9\u00aa\5\36\20"+
		"\2\u00aa\u00ab\5\34\17\2\u00ab\u00b1\3\2\2\2\u00ac\u00ad\5H%\2\u00ad\u00ae"+
		"\7\"\2\2\u00ae\u00af\5H%\2\u00af\u00b1\3\2\2\2\u00b0\u00a6\3\2\2\2\u00b0"+
		"\u00ac\3\2\2\2\u00b1\35\3\2\2\2\u00b2\u00b3\t\4\2\2\u00b3\37\3\2\2\2\u00b4"+
		"\u00b5\5D#\2\u00b5\u00b6\5\"\22\2\u00b6!\3\2\2\2\u00b7\u00ba\5$\23\2\u00b8"+
		"\u00ba\5&\24\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba#\3\2\2\2"+
		"\u00bb\u00bc\7\37\2\2\u00bc\u00bd\7\t\2\2\u00bd\u00be\5H%\2\u00be\u00bf"+
		"\7\36\2\2\u00bf\u00c0\5\"\22\2\u00c0\u00c7\3\2\2\2\u00c1\u00c2\7\37\2"+
		"\2\u00c2\u00c3\7\t\2\2\u00c3\u00c4\5H%\2\u00c4\u00c5\7\31\2\2\u00c5\u00c7"+
		"\3\2\2\2\u00c6\u00bb\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c7%\3\2\2\2\u00c8"+
		"\u00c9\7\37\2\2\u00c9\u00ca\7\36\2\2\u00ca\u00ce\5\"\22\2\u00cb\u00cc"+
		"\7\37\2\2\u00cc\u00ce\7\31\2\2\u00cd\u00c8\3\2\2\2\u00cd\u00cb\3\2\2\2"+
		"\u00ce\'\3\2\2\2\u00cf\u00d0\7\21\2\2\u00d0\u00d1\5*\26\2\u00d1)\3\2\2"+
		"\2\u00d2\u00d3\7\37\2\2\u00d3\u00d4\7\7\2\2\u00d4\u00d5\5,\27\2\u00d5"+
		"\u00d6\7\b\2\2\u00d6\u00d7\7\t\2\2\u00d7\u00d8\7\23\2\2\u00d8\u00d9\7"+
		"\37\2\2\u00d9\u00da\7\23\2\2\u00da\u00db\7\36\2\2\u00db\u00dc\5*\26\2"+
		"\u00dc\u00f5\3\2\2\2\u00dd\u00de\7\37\2\2\u00de\u00df\7\7\2\2\u00df\u00e0"+
		"\5,\27\2\u00e0\u00e1\7\b\2\2\u00e1\u00e2\7\t\2\2\u00e2\u00e3\7\23\2\2"+
		"\u00e3\u00e4\7\37\2\2\u00e4\u00e5\7\23\2\2\u00e5\u00e6\7\31\2\2\u00e6"+
		"\u00f5\3\2\2\2\u00e7\u00e8\7\37\2\2\u00e8\u00e9\7\7\2\2\u00e9\u00ea\5"+
		",\27\2\u00ea\u00eb\7\b\2\2\u00eb\u00ec\7\36\2\2\u00ec\u00ed\5*\26\2\u00ed"+
		"\u00f5\3\2\2\2\u00ee\u00ef\7\37\2\2\u00ef\u00f0\7\7\2\2\u00f0\u00f1\5"+
		",\27\2\u00f1\u00f2\7\b\2\2\u00f2\u00f3\7\31\2\2\u00f3\u00f5\3\2\2\2\u00f4"+
		"\u00d2\3\2\2\2\u00f4\u00dd\3\2\2\2\u00f4\u00e7\3\2\2\2\u00f4\u00ee\3\2"+
		"\2\2\u00f5+\3\2\2\2\u00f6\u00fa\7!\2\2\u00f7\u00fa\7\37\2\2\u00f8\u00fa"+
		"\3\2\2\2\u00f9\u00f6\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa"+
		"-\3\2\2\2\u00fb\u00fc\5B\"\2\u00fc\u00fd\5\64\33\2\u00fd\u00fe\5\60\31"+
		"\2\u00fe\u00ff\5\66\34\2\u00ff\u0100\5\62\32\2\u0100\u0101\7\31\2\2\u0101"+
		"/\3\2\2\2\u0102\u0105\7\25\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2\2\2"+
		"\u0104\u0103\3\2\2\2\u0105\61\3\2\2\2\u0106\u0109\7\26\2\2\u0107\u0109"+
		"\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109\63\3\2\2\2\u010a"+
		"\u010b\7\37\2\2\u010b\65\3\2\2\2\u010c\u010d\5D#\2\u010d\u010e\7\36\2"+
		"\2\u010e\u010f\5\66\34\2\u010f\u0113\3\2\2\2\u0110\u0113\5D#\2\u0111\u0113"+
		"\3\2\2\2\u0112\u010c\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113"+
		"\67\3\2\2\2\u0114\u0115\5D#\2\u0115\u0116\5:\36\2\u0116\u0117\7\36\2\2"+
		"\u0117\u0118\58\35\2\u0118\u011e\3\2\2\2\u0119\u011a\5D#\2\u011a\u011b"+
		"\5:\36\2\u011b\u011e\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u0114\3\2\2\2\u011d"+
		"\u0119\3\2\2\2\u011d\u011c\3\2\2\2\u011e9\3\2\2\2\u011f\u0120\7\37\2\2"+
		"\u0120;\3\2\2\2\u0121\u0122\7\37\2\2\u0122\u0123\5\60\31\2\u0123\u0124"+
		"\5> \2\u0124\u0125\7\26\2\2\u0125\u0126\7\31\2\2\u0126=\3\2\2\2\u0127"+
		"\u0128\7\37\2\2\u0128\u0129\7\36\2\2\u0129\u012d\5> \2\u012a\u012d\7\37"+
		"\2\2\u012b\u012d\3\2\2\2\u012c\u0127\3\2\2\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012b\3\2\2\2\u012d?\3\2\2\2\u012e\u012f\5B\"\2\u012f\u0130\5\64\33\2"+
		"\u0130\u0131\5\60\31\2\u0131\u0132\58\35\2\u0132\u0133\7\26\2\2\u0133"+
		"\u0134\5\b\5\2\u0134A\3\2\2\2\u0135\u0138\5D#\2\u0136\u0138\7\20\2\2\u0137"+
		"\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138C\3\2\2\2\u0139\u013a\t\5\2\2"+
		"\u013aE\3\2\2\2\u013b\u013c\7\24\2\2\u013c\u013d\5H%\2\u013d\u013e\7\31"+
		"\2\2\u013e\u0142\3\2\2\2\u013f\u0140\7\24\2\2\u0140\u0142\5<\37\2\u0141"+
		"\u013b\3\2\2\2\u0141\u013f\3\2\2\2\u0142G\3\2\2\2\u0143\u0144\t\6\2\2"+
		"\u0144I\3\2\2\2\23P^\u0090\u00a2\u00b0\u00b9\u00c6\u00cd\u00f4\u00f9\u0104"+
		"\u0108\u0112\u011d\u012c\u0137\u0141";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}