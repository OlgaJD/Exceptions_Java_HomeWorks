package ContactExceptions;

public class IncorrectNameException extends RuntimeException {
    public IncorrectNameException(String name) {
        super(String.format("В имени %s недопустимые символы", name));
    }
}
