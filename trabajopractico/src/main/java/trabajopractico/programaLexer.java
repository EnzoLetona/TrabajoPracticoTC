// Generated from c:\Users\Usuario\Documents\TrabajoPracticoTC\trabajopractico\src\main\java\trabajopractico\programa.g4 by ANTLR 4.8

    package trabajopractico;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class programaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, EQ=4, DOUBLE=5, WHILEF=6, IFF=7, FORR=8, INT=9, 
		STRING=10, CHAR=11, FLOAT=12, COMILLAS=13, PARENTESISA=14, PARENTESISC=15, 
		LLAVEA=16, LLAVEC=17, PUNTOCOMA=18, COMA=19, PALABRA=20, ENTERO=21, COMP=22, 
		WS=23, OTRO=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "DIGITO", "LETRA2", "EQ", "DOUBLE", "WHILEF", 
			"IFF", "FORR", "INT", "STRING", "CHAR", "FLOAT", "COMILLAS", "PARENTESISA", 
			"PARENTESISC", "LLAVEA", "LLAVEC", "PUNTOCOMA", "COMA", "PALABRA", "ENTERO", 
			"COMP", "WS", "OTRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'++'", "'['", "']'", "'='", "'double'", "'while'", "'if'", "'for'", 
			"'int'", "'string'", "'char'", "'float'", "'\"'", "'('", "')'", "'{'", 
			"'}'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "EQ", "DOUBLE", "WHILEF", "IFF", "FORR", "INT", 
			"STRING", "CHAR", "FLOAT", "COMILLAS", "PARENTESISA", "PARENTESISC", 
			"LLAVEA", "LLAVEC", "PUNTOCOMA", "COMA", "PALABRA", "ENTERO", "COMP", 
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


	public programaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "programa.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u009d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\6\27~\n\27\r\27"+
		"\16\27\177\3\30\6\30\u0083\n\30\r\30\16\30\u0084\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\5\31\u0091\n\31\3\32\6\32\u0094\n\32\r\32"+
		"\16\32\u0095\3\32\3\32\3\33\3\33\3\33\3\33\2\2\34\3\3\5\4\7\5\t\2\13\2"+
		"\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23"+
		")\24+\25-\26/\27\61\30\63\31\65\32\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17"+
		"\17\"\"\2\u00a2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5:\3\2\2\2\7<\3\2\2\2\t>\3"+
		"\2\2\2\13@\3\2\2\2\rB\3\2\2\2\17D\3\2\2\2\21K\3\2\2\2\23Q\3\2\2\2\25T"+
		"\3\2\2\2\27X\3\2\2\2\31\\\3\2\2\2\33c\3\2\2\2\35h\3\2\2\2\37n\3\2\2\2"+
		"!p\3\2\2\2#r\3\2\2\2%t\3\2\2\2\'v\3\2\2\2)x\3\2\2\2+z\3\2\2\2-}\3\2\2"+
		"\2/\u0082\3\2\2\2\61\u0090\3\2\2\2\63\u0093\3\2\2\2\65\u0099\3\2\2\2\67"+
		"8\7-\2\289\7-\2\29\4\3\2\2\2:;\7]\2\2;\6\3\2\2\2<=\7_\2\2=\b\3\2\2\2>"+
		"?\t\2\2\2?\n\3\2\2\2@A\t\3\2\2A\f\3\2\2\2BC\7?\2\2C\16\3\2\2\2DE\7f\2"+
		"\2EF\7q\2\2FG\7w\2\2GH\7d\2\2HI\7n\2\2IJ\7g\2\2J\20\3\2\2\2KL\7y\2\2L"+
		"M\7j\2\2MN\7k\2\2NO\7n\2\2OP\7g\2\2P\22\3\2\2\2QR\7k\2\2RS\7h\2\2S\24"+
		"\3\2\2\2TU\7h\2\2UV\7q\2\2VW\7t\2\2W\26\3\2\2\2XY\7k\2\2YZ\7p\2\2Z[\7"+
		"v\2\2[\30\3\2\2\2\\]\7u\2\2]^\7v\2\2^_\7t\2\2_`\7k\2\2`a\7p\2\2ab\7i\2"+
		"\2b\32\3\2\2\2cd\7e\2\2de\7j\2\2ef\7c\2\2fg\7t\2\2g\34\3\2\2\2hi\7h\2"+
		"\2ij\7n\2\2jk\7q\2\2kl\7c\2\2lm\7v\2\2m\36\3\2\2\2no\7$\2\2o \3\2\2\2"+
		"pq\7*\2\2q\"\3\2\2\2rs\7+\2\2s$\3\2\2\2tu\7}\2\2u&\3\2\2\2vw\7\177\2\2"+
		"w(\3\2\2\2xy\7=\2\2y*\3\2\2\2z{\7.\2\2{,\3\2\2\2|~\5\13\6\2}|\3\2\2\2"+
		"~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080.\3\2\2\2\u0081\u0083"+
		"\5\t\5\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\60\3\2\2\2\u0086\u0091\7>\2\2\u0087\u0088\7>\2\2"+
		"\u0088\u0091\7?\2\2\u0089\u008a\7?\2\2\u008a\u0091\7?\2\2\u008b\u0091"+
		"\7@\2\2\u008c\u008d\7@\2\2\u008d\u0091\7?\2\2\u008e\u008f\7#\2\2\u008f"+
		"\u0091\7?\2\2\u0090\u0086\3\2\2\2\u0090\u0087\3\2\2\2\u0090\u0089\3\2"+
		"\2\2\u0090\u008b\3\2\2\2\u0090\u008c\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\62\3\2\2\2\u0092\u0094\t\4\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2"+
		"\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098"+
		"\b\32\2\2\u0098\64\3\2\2\2\u0099\u009a\13\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009c\b\33\2\2\u009c\66\3\2\2\2\7\2\177\u0084\u0090\u0095\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}