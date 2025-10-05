package  java_aircrafts.aircrafts.exceptions;

public class InvalidAircraftType extends ParsingException {
    public InvalidAircraftType() {
        super();
    }

    public InvalidAircraftType(String message) {
        super(message);
    }

    public InvalidAircraftType(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidAircraftType(Throwable cause) {
        super(cause);
    }
}