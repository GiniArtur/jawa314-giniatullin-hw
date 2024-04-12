package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask4 {                         // TODO Java314_Гиниятуллин_Массивы_задача4
    public static void main(String[] args) {
        int[] array;
        Scanner sc = new Scanner(System.in);
        int min;
        System.out.println("Введите размер массива:");
        int size = sc.nextInt();
        array = new int[size];
        System.out.println("Задан массив чисел = ");
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + "\t");
        }
        min = array[0];
        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Минимальный элемент массива = " + min);
    }
}


