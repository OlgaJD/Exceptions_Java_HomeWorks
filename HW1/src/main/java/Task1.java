import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Task1 {
    // Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

    // 1. FileNotFoundException. Не указан файл для записи данных.
    private static String dataFile = "";
     public static void saveDataToFile() throws IOException {
         String data = "ABC";
         FileWriter writer  = new FileWriter(dataFile, true);
         writer.append(data);
         writer.flush();
     }

     // 2. ArrayIndexOutOfBoundsException. Индекс за пределами массива
    public static void fillArray (int[] array) {
        Random rnd = new Random();
        for (int i = 0; i <= array.length; i++) {
            array[i] = rnd.nextInt(10);
        }
    }

    // 3. ArithmeticException. Деление на 0
    public static int divide (int n1, int n2) {
         return n1 / n2;
    }

    public static void main(String[] args) throws IOException {
        // saveDataToFile(); //1.

        // int[] array = new int[5]; //2.
        // fillArray(array);

        // divide(5, 0); //3.
    }
}
