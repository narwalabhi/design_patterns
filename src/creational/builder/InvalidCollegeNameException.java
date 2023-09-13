package creational.builder;

public class InvalidCollegeNameException extends Throwable {

    public InvalidCollegeNameException() {
        super();
    }

    public InvalidCollegeNameException(String message) {
        super(message);
    }

    public InvalidCollegeNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidCollegeNameException(Throwable cause) {
        super(cause);
    }

    protected InvalidCollegeNameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
