package ContactExceptions;

public class IncorrectGenderException extends RuntimeException {
    public IncorrectGenderException(String gender) {
        super(String.format("Неверно указан пол, можно вводить только буку m или f", gender));
    }

}
