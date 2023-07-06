import java.util.Scanner;

// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class Task4 {
    private static final Scanner scanner = new Scanner(System.in);
    public static String inputText() throws EmptyStringException {
        System.out.println("Введите строку");
        String text = scanner.nextLine();
        if (text.isEmpty()) {
            throw new EmptyStringException ("Строка не должна быть пустой");
        } else {
            return text;
        }
    }

    public static void main(String[] args) throws EmptyStringException {
        System.out.println("Текст: " + inputText());
    }
}
