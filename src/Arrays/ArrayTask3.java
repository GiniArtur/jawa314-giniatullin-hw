package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask3 {                             // TODO Java314_Гиниятуллин_Массивы_задача3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean IsTrue = false;
        System.out.println("Введите размер массива:");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        for (int i = 0; i < size; i++) {
            myArray[i] = (int) (Math.random() * 10);
            System.out.print(myArray[i] + "\t");
        }
        System.out.println("Массив создан: " + Arrays.toString(myArray));
        int number;
        number = (int) (Math.random() * 10);
        System.out.println("Создано число = " + number);
        for (int i = 0; i < myArray.length; i++) {
            if (number == myArray[i]) {
                System.out.println("число равно элементу массива с индексом " + i);
                IsTrue = true;
            }
        }
        if (!IsTrue) System.out.println("Числа " + number + " нет в данном массиве");
    }
}
