package StringsMethods;

import java.util.Arrays;

public class MethodIntTask1 {
    public static void method(int[] array) {
        System.out.println("Вывод массива целых чисел : " + Arrays.toString(array));
    }

    public static void method(String[] str) {
        System.out.println("Вывод массива строковых значений : " + Arrays.toString(str));
    }
    public static void method(int[][] array2) {
        System.out.println("Вывод двумерного массива целых чисел : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array2[i][j]);
                System.out.print(",");
            }
            System.out.println();
        }
    }
    public static void method(String[][] str2) {
        System.out.println("Вывод двумерного массива строковых значений : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(str2[i][j]);
                System.out.print(",");
            }
            System.out.println();
        }
    }
}
