public class Task2 {
    // Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) { // NullPointerException, если элемент массива == null.
            for (int j = 0; j < 5; j++) { // ArrayIndexOutOfBoundsException, при количестве столбцов меньше чем 5.
                int val = Integer.parseInt(arr[i][j]); // NumberFormatException, если i и(или) j невозможно конвертировать в int (например символы или буквы).
                sum += val; //
            }
        }
        return sum;
    }
}
