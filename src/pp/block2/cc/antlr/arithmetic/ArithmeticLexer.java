// Generated from Arithmetic.g4 by ANTLR 4.4
package pp.block2.cc.antlr.arithmetic;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArithmeticLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, NUMBER=3, OPERATORL1=4, OPERATORL2=5, OPERATORMIN=6, OPERATORR=7, 
		WS=8, TYPO=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "NUMBER", "OPERATORL1", "OPERATORL2", "OPERATORMIN", "OPERATORR", 
		"WS", "TYPO"
	};


	public ArithmeticLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Arithmetic.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\13\64\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\4\7\4\35\n\4\f\4\16\4 \13\4\5\4\"\n\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\6\n\61\n\n\r\n\16\n\62\2\2\13"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\3\2\5\4\2,,\61\61\5\2\13\f\17"+
		"\17\"\"\4\2C\\c|\66\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\25\3"+
		"\2\2\2\5\27\3\2\2\2\7!\3\2\2\2\t#\3\2\2\2\13%\3\2\2\2\r\'\3\2\2\2\17)"+
		"\3\2\2\2\21+\3\2\2\2\23\60\3\2\2\2\25\26\7+\2\2\26\4\3\2\2\2\27\30\7*"+
		"\2\2\30\6\3\2\2\2\31\"\7\62\2\2\32\36\4\63;\2\33\35\4\62;\2\34\33\3\2"+
		"\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2"+
		"!\31\3\2\2\2!\32\3\2\2\2\"\b\3\2\2\2#$\t\2\2\2$\n\3\2\2\2%&\7-\2\2&\f"+
		"\3\2\2\2\'(\7/\2\2(\16\3\2\2\2)*\7`\2\2*\20\3\2\2\2+,\t\3\2\2,-\3\2\2"+
		"\2-.\b\t\2\2.\22\3\2\2\2/\61\t\4\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3"+
		"\2\2\2\62\63\3\2\2\2\63\24\3\2\2\2\6\2\36!\62\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}