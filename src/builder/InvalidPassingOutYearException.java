package builder;

public class InvalidPassingOutYearException extends Throwable {

    public InvalidPassingOutYearException() {
        super();
    }

    public InvalidPassingOutYearException(String message) {
        super(message);
    }

    public InvalidPassingOutYearException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidPassingOutYearException(Throwable cause) {
        super(cause);
    }

    protected InvalidPassingOutYearException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
