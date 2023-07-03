import java.util.Random;
import java.util.Scanner;

public class Task3 {
    // Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
    // Если длины массивов не равны, необходимо как-то оповестить пользователя.
    // Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

    private static final Scanner scanner = new Scanner(System.in);

    private static int setArrayLengh() {
        System.out.println("Введите длину массива");
        while (true) {
            while (!scanner.hasNextInt()) {
                System.out.println("Это не число, попробуйте еще раз");
                scanner.next();
            }
            int number = scanner.nextInt();
            if (number < 1) {
                System.out.println("Число должно быть больше 0, попробуйте еще раз");
            } else {
                return number;
            }
        }
    }

    private static void fillArrayRandom(int[] array) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static int[] resultArray(int[] firstArray, int[] secondArray) {
        if (firstArray.length != secondArray.length)
            throw new RuntimeException("Заданы массивы разной длины, попробуйте еще раз");
        int arrayLengh = firstArray.length;
        int[] resultArray = new int[0];
        try {
            resultArray = new int[arrayLengh];
            for (int i = 0; i < arrayLengh; i++) {
                resultArray[i] = firstArray[i] / secondArray[i];
            }
            System.out.println("Новый массив");
            print(resultArray);
            return resultArray;
        } catch (RuntimeException e) {
            System.out.println("При рандомном заполнении второго массива, элементу присвоилось значение 0. Делить на 0 нельзя, попробуйте еще раз");
        }
        return resultArray;
    }

    private static void print(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    private static void newDividedArray() {
        int[] firstArray = new int[setArrayLengh()];
        int[] secondArray = new int[setArrayLengh()];
        System.out.println("Заполняем массивы");
        fillArrayRandom(firstArray);
        fillArrayRandom(secondArray);
        int[] resArray = resultArray(firstArray, secondArray);
    }

    public static void main(String[] args) {
        newDividedArray();
    }
}