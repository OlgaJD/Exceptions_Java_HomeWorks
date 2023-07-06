import java.util.Scanner;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
//Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
public class Task1 {
    private static final Scanner scanner = new Scanner(System.in);
    private static float setNumberFloat() {
        System.out.println("Введите дробное число: ");
        while (true) {
            try {
                return Float.parseFloat(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Число введено неверно. Можно использовать только цифры, разделитель для дробной части - точка");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Ваше число: " + setNumberFloat());
    }
}
