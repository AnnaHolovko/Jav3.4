package zad4;

import java.util.Arrays;

public class Zad4 {

    public static void main(String[] args) {
        /*1. Для двух введенных чисел проделать операции умножения, деления, вычитания, суммирования, возведения в квадрат. 
     Т.е. всего 5 операций. Результат выполнения каждой операции вывести в консоль с текстовым пояснением 
     (Например «Результат умножения первого числа на второе равен» Результат…)
  2. Над каждым результатом выполнения предыдущих операций осуществить извлечение квадратного корня. 
     Результаты аналогично снабдить текстовыми пояснениями.
  3. Записать полученные результаты в 2 разных массива.
  4. Записать полученные данные в один массив (т.е. массив из массивов-двумерный, например, [[9,16,25,36,49], [3.4.5.6,7]]
  5. В зависимости от введенного в консоли числа – вывести соответствующий элемент 1-го и 2-го вложенных массивов.*/

//1
        int a = 4;
        int b = 2;
        System.out.println("Результат умножения первого числа на второе равен:  " + (a * b));
        System.out.println("Результат деления первого числа на второе равен:  " + (a / b));
        System.out.println("Результат вычитания первого числа на второе равен:  " + (a - b));
        System.out.println("Результат суммирования первого числа и второго равен:  " + (a + b));
        System.out.println("Результат возведения в квадрат первого числа:  " + (Math.pow(2, a)) + "\n");

//2
        int a1 = 8;
        int a2 = 2;
        int a3 = 2;
        int a4 = 6;
        double a5 = 16.0;
        double x1 = Math.sqrt(a1);
        double x2 = Math.sqrt(a2);
        double x3 = Math.sqrt(a3);
        double x4 = Math.sqrt(a4);
        double x5 = Math.sqrt(a5);
        System.out.println("Результат извлечение квадратного корня из    8:  " + x1);
        System.out.println("Результат извлечение квадратного корня из    2:  " + x2);
        System.out.println("Результат извлечение квадратного корня из    2:  " + x3);
        System.out.println("Результат извлечение квадратного корня из    6:  " + x4);
        System.out.println("Результат извлечение квадратного корня из 16.0:  " + x5 + "\n");

//3
        String[] aArray = new String[5];
        String[] bArray = {"a", "b", "c", "d", "e"};
        String[] cArray = new String[]{"a", "b", "c", "d", "e"};
        int[] intArray = {8, 2, 2, 6, 16};
        String intArrayString = Arrays.toString(intArray);
        System.out.println(intArray);
        System.out.println(intArrayString);

        String[] dArray = new String[5];
        String[] eArray = {"a1", "b1", "c1", "d1", "e1"};
        String[] fArray = new String[]{"a1", "b1", "c1", "d1", "e1"};
        double[] Array = {2.8, 1.4, 1.4, 2.4, 4.0};
        String ArrayString = Arrays.toString(Array);
        System.out.println(Array);
        System.out.println(ArrayString);
//4
        double[][] num = {{8, 2, 2, 6, 16}, {2.8, 1.4, 1.4, 2.4, 4.0},};
        System.out.println(Arrays.deepToString(num));

//5
        int[][] nums2 = {{0, 1, 2}, {3, 4, 5}};
        System.out.println(nums2[0][1]);
        System.out.println(nums2[1][0]);
        // TODO code application logic here
    }

}
