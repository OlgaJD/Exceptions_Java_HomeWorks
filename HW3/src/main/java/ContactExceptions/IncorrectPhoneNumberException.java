package ContactExceptions;

public class IncorrectPhoneNumberException extends RuntimeException {
    public IncorrectPhoneNumberException(String phone) {
        super(String.format("Номер телефона %s введен неверно. Телефон должен состоять только 7 цифр ", phone));
    }
}
