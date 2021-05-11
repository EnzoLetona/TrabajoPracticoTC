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
		LETRA2=1, EQ=2, DOUBLE=3, WHILEF=4, IFF=5, INT=6, PARENTESISA=7, PARENTESISC=8, 
		LLAVEA=9, LLAVEC=10, PUNTOCOMA=11, COMA=12, ENTERO=13, COMP=14, WS=15, 
		OTRO=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGITO", "LETRA2", "EQ", "DOUBLE", "WHILEF", "IFF", "INT", "PARENTESISA", 
			"PARENTESISC", "LLAVEA", "LLAVEC", "PUNTOCOMA", "COMA", "ENTERO", "COMP", 
			"WS", "OTRO"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22g\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\6\17M\n\17\r\17\16\17N\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20[\n\20\3\21\6\21^\n\21\r\21\16\21_\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\2\2\23\3\2\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23"+
		"\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22\3\2\5\3\2\62;\4\2C\\c|\5"+
		"\2\13\f\17\17\"\"\2l\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3\2\2\2\7)\3\2\2\2\t+\3\2\2\2\13\62\3\2\2"+
		"\2\r8\3\2\2\2\17;\3\2\2\2\21?\3\2\2\2\23A\3\2\2\2\25C\3\2\2\2\27E\3\2"+
		"\2\2\31G\3\2\2\2\33I\3\2\2\2\35L\3\2\2\2\37Z\3\2\2\2!]\3\2\2\2#c\3\2\2"+
		"\2%&\t\2\2\2&\4\3\2\2\2\'(\t\3\2\2(\6\3\2\2\2)*\7?\2\2*\b\3\2\2\2+,\7"+
		"f\2\2,-\7q\2\2-.\7w\2\2./\7d\2\2/\60\7n\2\2\60\61\7g\2\2\61\n\3\2\2\2"+
		"\62\63\7y\2\2\63\64\7j\2\2\64\65\7k\2\2\65\66\7n\2\2\66\67\7g\2\2\67\f"+
		"\3\2\2\289\7k\2\29:\7h\2\2:\16\3\2\2\2;<\7k\2\2<=\7p\2\2=>\7v\2\2>\20"+
		"\3\2\2\2?@\7*\2\2@\22\3\2\2\2AB\7+\2\2B\24\3\2\2\2CD\7}\2\2D\26\3\2\2"+
		"\2EF\7\177\2\2F\30\3\2\2\2GH\7=\2\2H\32\3\2\2\2IJ\7.\2\2J\34\3\2\2\2K"+
		"M\5\3\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\36\3\2\2\2P[\7>\2\2"+
		"QR\7>\2\2R[\7?\2\2ST\7?\2\2T[\7?\2\2U[\7@\2\2VW\7@\2\2W[\7?\2\2XY\7#\2"+
		"\2Y[\7?\2\2ZP\3\2\2\2ZQ\3\2\2\2ZS\3\2\2\2ZU\3\2\2\2ZV\3\2\2\2ZX\3\2\2"+
		"\2[ \3\2\2\2\\^\t\4\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2"+
		"\2\2ab\b\21\2\2b\"\3\2\2\2cd\13\2\2\2de\3\2\2\2ef\b\22\2\2f$\3\2\2\2\6"+
		"\2NZ_\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}