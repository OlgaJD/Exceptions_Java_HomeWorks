//Задание 2
//Если необходимо, исправьте код:
//
//try {
//        int d = 0;
//        double catchedRes1 = intArray[8] / d;
//        System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//        System.out.println("Catching exception: " + e);
//        }
public class Task2 {

    // 1. Добавим метод void funcTask2(). Передаем в параметры массив intArray
    // 2. Заменяем тип данных int у переменной d на тип double
    // 3. Переменную d поместим в параметр функции, добавив возможность изменять её значение. Т.к. в текущем варианте значение переменной d всегда равно 0, значиит всегда будет ошибка деления на 0, программа не имеет смысла.
    // 4. Вместо конкретного значения из массива intArray[8] добававляем в функцию возможность подсталения любого индекса массива
    // 5. Добавим catch исключение ArrayIndexOutOfBoundsException

    public static void funcTask2(int[] intArray, double d, int index) {
        try {
            double catchedRes1 = (double) intArray[index] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Указанный индекс за пределами массива ");
        }
    }
    public static void main(String[] args) {
        int [] array  = {1,2,3,4,5,6,7,8,9,10};
        double d = 0;
        int i = 8;
        funcTask2(array, d, i);
    }

}
