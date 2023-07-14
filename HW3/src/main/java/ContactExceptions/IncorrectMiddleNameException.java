package ContactExceptions;

public class IncorrectMiddleNameException extends RuntimeException {
    public IncorrectMiddleNameException(String midlename) {
        super(String.format("В отчетстве %s недопустимые символы", midlename));
    }
}
