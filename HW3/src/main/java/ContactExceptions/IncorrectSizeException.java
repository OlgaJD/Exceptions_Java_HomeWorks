package ContactExceptions;

public class IncorrectSizeException extends RuntimeException {
    public IncorrectSizeException(int lengh) {
        super(String.format("Необходимо ввести 6 параметров, вы ввели %s", lengh));
    }
}
