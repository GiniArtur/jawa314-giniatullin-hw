package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask5 {                             // TODO Java314_Гиниятуллин_Массивы_задача5
        public static void main(String[] args) {
        int[][] array;
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Введите первую размерность массива:");
        int sizeX = sc.nextInt();
        System.out.println("Введите вторую размерность массива:");
        int sizeY = sc.nextInt();
        array = new int[sizeX][sizeY];
        System.out.println("Задан массив чисел = ");
        for (int i = 0; i < sizeX; i++) {
            System.out.println(" ");
            for (int j = 0; j < sizeY; j++) {
                array[i][j] = (int) (Math.random() * 30);
                System.out.print(array[i][j] + "\t");
                sum += array[i][j];
            }
        }
        System.out.println(" ");
        System.out.println("Сумма элементов двумерного массива = " + sum);
    }
}
