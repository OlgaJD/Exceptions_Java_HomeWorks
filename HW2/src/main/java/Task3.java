//Задание 3
//        Если необходимо, исправьте код:
//public static void main(String[] args) throws Exception {
//        try {
//        int a = 90;
//        int b = 3;
//        System.out.println(a / b);
//        printSum(23, 234);
//        int[] abc = { 1, 2 };
//        abc[3] = 9;
//        } catch (Throwable ex) {
//        System.out.println("Что-то пошло не так...");
//        } catch (NullPointerException ex) {
//        System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//        System.out.println("Массив выходит за пределы своего размера!");
//        }
//        }
//public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//        System.out.println(a + b);
//        }

public class Task3 {
    // 1. Разделим на 3 независимых метода: void printDivide(), void printSum(), void setElementValueByIndex(), все переменные поместим в параметры
    // 2. В ф-цию деления добавим ArithmeticException
    // 3. Правим порядок исключений по иерархии, последним исключением ставим Throwable ex
    // 4. FileNotFoundException не вызывается в таких случаях, убираем
    public static void printDivide(Integer a, Integer b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Делить на 0 нельзя");
        } catch (NullPointerException e) {
            System.out.println("Указатель не может указывать на null!");
        }
    }
    public static void printSum(Integer a, Integer b) {
        try {
            System.out.println(a + b);
        } catch (NullPointerException e) {
            System.out.println("Указатель не может указывать на null!");
        }
    }
    public static void setElementValueByIndex(int[] array, int index, int value) {
        try {
            array[index] = value;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 5;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int i = 3;
        int value = 9;

        printDivide(a, b);
        printSum(a, b);
        setElementValueByIndex(array, i, value);

        for (int k : array) {
            System.out.print(k + " ");
        }
    }
}
