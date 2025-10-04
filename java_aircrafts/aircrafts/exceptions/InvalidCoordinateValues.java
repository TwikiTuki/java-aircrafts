package  java_aircrafts.aircrafts.exceptions;

public class InvalidCoordinateValues extends Exception {
    public InvalidCoordinateValues() {
        super();
    }

    public InvalidCoordinateValues(String message) {
        super(message);
    }

    public InvalidCoordinateValues(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidCoordinateValues(Throwable cause) {
        super(cause);
    }
}