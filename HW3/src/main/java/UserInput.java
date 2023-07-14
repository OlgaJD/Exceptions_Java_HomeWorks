import java.util.Scanner;

public class UserInput {
    private static final Scanner scanner = new Scanner(System.in);

    public static String inputUserString() {
        System.out.println("""
                Введите данные контакта через пробел:\s
                фамилия, имя и отчетство только буквы
                дата рождения в форммате dd.mm.yyyy
                номер телефона - 7 цифр
                пол буква m или f""");
        String input;
        input = scanner.nextLine();
        if (input.isEmpty()) {
            System.out.println("Строка пустая");
            inputUserString();
        }
        return input;
    }
}