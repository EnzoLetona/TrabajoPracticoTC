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
		FECHA=1, HORAM=2, HORAT=3, WS=4, OTRO=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGITO", "PARES", "FECHA", "HORAM", "HORAT", "WS", "OTRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FECHA", "HORAM", "HORAT", "WS", "OTRO"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\7U\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4\35\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\5\5)\n\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6L\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\2\2\t\3\2\5\2\7\3\t\4\13"+
		"\5\r\6\17\7\3\2\n\3\2\62;\7\2\62\62\64\64\66\6688::\4\2\62\62\64\64\3"+
		"\2:;\3\2\62\64\3\2\62\67\3\2\65\67\5\2\13\f\17\17\"\"\2X\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\21\3\2\2\2\5\23\3\2"+
		"\2\2\7\25\3\2\2\2\t(\3\2\2\2\13K\3\2\2\2\rM\3\2\2\2\17Q\3\2\2\2\21\22"+
		"\t\2\2\2\22\4\3\2\2\2\23\24\t\3\2\2\24\6\3\2\2\2\25\26\5\3\2\2\26\27\5"+
		"\3\2\2\27\34\7\61\2\2\30\31\7\62\2\2\31\35\5\5\3\2\32\33\7\63\2\2\33\35"+
		"\t\4\2\2\34\30\3\2\2\2\34\32\3\2\2\2\35\36\3\2\2\2\36\37\7\61\2\2\37 "+
		"\5\3\2\2 !\5\3\2\2!\"\5\3\2\2\"#\5\3\2\2#\b\3\2\2\2$%\7\62\2\2%)\t\5\2"+
		"\2&\'\7\63\2\2\')\t\6\2\2($\3\2\2\2(&\3\2\2\2)*\3\2\2\2*+\7<\2\2+,\t\7"+
		"\2\2,-\5\3\2\2-\n\3\2\2\2./\7\63\2\2/\60\7:\2\2\60\61\7<\2\2\61\62\3\2"+
		"\2\2\62\63\t\b\2\2\63L\5\3\2\2\64\65\7\63\2\2\65\66\7;\2\2\66\67\7<\2"+
		"\2\678\3\2\2\289\t\7\2\29L\5\3\2\2:;\7\64\2\2;<\7\63\2\2<=\7<\2\2=>\7"+
		"\65\2\2>L\7\62\2\2?@\7\64\2\2@A\7\63\2\2AB\7<\2\2BC\3\2\2\2CD\t\6\2\2"+
		"DL\5\3\2\2EF\7\64\2\2FG\7\62\2\2GH\7<\2\2HI\3\2\2\2IJ\t\7\2\2JL\5\3\2"+
		"\2K.\3\2\2\2K\64\3\2\2\2K:\3\2\2\2K?\3\2\2\2KE\3\2\2\2L\f\3\2\2\2MN\t"+
		"\t\2\2NO\3\2\2\2OP\b\7\2\2P\16\3\2\2\2QR\13\2\2\2RS\3\2\2\2ST\b\b\2\2"+
		"T\20\3\2\2\2\6\2\34(K\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}