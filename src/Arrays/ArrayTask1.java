package Arrays;

import java.util.Random;

public class ArrayTask1 {                     // TODO Java314_Гиниятуллин_Массивы_задача1
    public static void main(String[] args) {
        int[] array1;
        int[] array2;
        array1 = new int[5];
        array2 = new int[5];
        System.out.println("Первый массив = ");
        for (int i = 0; i < 5; i++) {
            array1[i] = (int) (Math.random() * 10);
            System.out.print(array1[i] + "\t");
        }
        System.out.println(" ");
        System.out.println("Второй массив = ");
        for (int j = 0; j < 5; j++) {
            array2[j] = array1[4-j];
            System.out.print(array2[j] + "\t");

        }fdbdb
    }
}








