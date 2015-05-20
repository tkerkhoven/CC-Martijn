package pp.iloc.parse;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

/**
 * Antlr error listener to collect errors rather than send them to stderr.
 */
public class ErrorListener extends BaseErrorListener {
	/**
	 * Errors collected by the listener.
	 */
	private final List<String> errors = new ArrayList<>();

	@Override
	public void syntaxError(Recognizer<?, ?> recognizer,
							Object offendingSymbol, int line, int charPositionInLine,
							String msg, RecognitionException e) {
		this.errors.add(String.format("Line %d:%d - %s", line,
				charPositionInLine, offendingSymbol, msg));
	}

	/**
	 * Adds an error message during the tree visit stage.
	 */
	public void visitError(Token token, String msg) {
		int line = token.getLine();
		int charPositionInLine = token.getCharPositionInLine();
		this.errors.add(String.format("Line %d:%d - %s", line,
				charPositionInLine,
				msg));
	}

	/**
	 * Indicates if the listener has collected any errors.
	 */
	public boolean hasErrors() {
		return !this.errors.isEmpty();
	}

	/**
	 * Returns the (possibly empty) list of errors collected by the listener.
	 */
	public List<String> getErrors() {
		return this.errors;
	}
}