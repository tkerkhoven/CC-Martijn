package pp.block6.cc;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

=======
>>>>>>> f1ec579d82a186ab97eb983ec42b54784fb31b9f
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;


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
		this.errors.add(String.format("line %d:%d - %s", line,
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


	/**
	 * Throws an exception if any errors were reported;
	 * does nothing otherwise.
	 *
	 * @throws ParseException an exception containing all errors found
	 *                        during listening
	 */
	public void throwException() throws ParseException {
		if (hasErrors()) {
			throw new ParseException(getErrors());
		}
	}
}
