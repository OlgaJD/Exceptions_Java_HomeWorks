package ContactExceptions;

public class IncorrectBirthDayException extends RuntimeException {
    public IncorrectBirthDayException(String date) {
        super(String.format(date));
    }
}
