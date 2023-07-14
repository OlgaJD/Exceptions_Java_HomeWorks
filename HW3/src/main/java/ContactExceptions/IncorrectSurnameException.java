package ContactExceptions;

public class IncorrectSurnameException extends RuntimeException {
    public IncorrectSurnameException(String surname) {
        super(String.format("В фамилии %s недопустимые символы", surname));
    }
}
