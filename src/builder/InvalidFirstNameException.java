package builder;

public class InvalidFirstNameException extends Throwable {

    public InvalidFirstNameException() {
        super();
    }

    public InvalidFirstNameException(String message) {
        super(message);
    }

    public InvalidFirstNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidFirstNameException(Throwable cause) {
        super(cause);
    }

    protected InvalidFirstNameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
