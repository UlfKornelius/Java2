package ru.bondarev.java2.lesson2;

public class ExceptionHW2 {

    public static void main(String[] args) throws MyException {
        String g = "103 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";
        /* 3. Ваши методы должны бросить исключения в случаях:
    Если размер матрицы, полученной из строки, не равен 4x4;
    Если в одной из ячеек полученной матрицы не число; (например символ или слово)
          4. В методе main необходимо вызвать полученные методы, обработать
          возможные исключения и вывести результат расчета.
          5. * Написать собственные классы исключений для каждого из случаев**/

        //String g = "10 3 1 2\n2 3 2 2\n5 6 7 \n300 3 1 0"; // MyException: NOT 4x4 ARRAY Exception
        //String g = "10 3 1 2\n2 3 2 2\n5 6 x 1\n300 3 1 0"; // NumberFormatException

    String[][] arr = convertStringToSquareArrays(g);
    System.out.println("*********");
    System.out.println(convertStringArraysToIntArraysForCalculate(arr));

}

      /* 1. Есть строка вида: "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";
    (другими словами матрица 4x4)
    10 3 1 2
    2 3 2 2
    5 6 7 1
    300 3 1 0
    Написать метод, на вход которого подаётся такая строка,
    метод должен преобразовать строку в двумерный массив типа String[][];**/

    static String[][] convertStringToSquareArrays(String g) {

        int length = g.split("\n").length;
        String[][] result = new String[length][length];
        String[] clearN = g.split("\n");

        for (int i = 0; i < length; i++) {
            String[] clearSpaces = clearN[i].split(" ");
            for (int j = 0; j < length; j++) {
                try {
                    result[i][j] = clearSpaces[j];
                    System.out.print(result[i][j] + " ");

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("размер матрицы, полученной из строки, не равен 4x4");
                    e.printStackTrace();
                    System.exit(1);
                }


            }
            System.out.println("");
        }
        return result;
    }


        static int convertStringArraysToIntArraysForCalculate(String[][] arr) {
        /* 2. Преобразовать все элементы массива в числа типа int,
    просуммировать, поделить полученную сумму на 2, и вернуть результат; **/

            int[][] numbers = new int[arr.length][arr.length];
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    try {
                        numbers[i][j] = Integer.parseInt(arr[i][j]);
                        sum = sum + numbers[i][j];

                    } catch (NumberFormatException e) {
                        System.out.println("в одной из ячеек полученной матрицы не число");
                        e.printStackTrace();
                        System.exit(1);
                    }
                }
            }
            return sum / 2;
    }






}








