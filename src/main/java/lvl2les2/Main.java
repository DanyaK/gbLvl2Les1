package lvl2les2;

/*
1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, при подаче массива другого
   размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
   Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
   должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException,
   и вывести результат расчета.
 */

public class Main {
    public static void main(String[] args) {

        String[][] test1 = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};

        String[][] test2 = {{"51", "25", "as", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};

        String[][] test3 = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"},
                {"100"}};

        String[][] test4 = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8", "0"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};

        getArraySum(test1);
        getArraySum(test2);
        getArraySum(test3);
        getArraySum(test4);
    }

    public static void getArraySum(String[][] array) throws MyArrayDataException, MyArraySizeException {


        //Commit 3
        //Commit 2
        //AADAD

        try {

            for (int i = 0; i < array.length; i++) {
                if (array[i].length != 4)
                    throw new MyArraySizeException();
            }
            if (array.length != 4)
                throw new MyArraySizeException();

            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    try {
                        sum += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);
                    }
                }
            }

            System.out.println("ALL GOOD. SUM = " + sum);
        } catch (MyArraySizeException e) {
            e.printInfo();
        } catch (MyArrayDataException ee) {
            ee.printInfo();
        }

    }

}
