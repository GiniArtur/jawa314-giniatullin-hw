package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask2 {                          // TODO Java314_Гиниятуллин_Массивы_задача2
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            myArray[i] = sc.nextInt();
        }
        System.out.println("Массив создан"+Arrays.toString(myArray));
        System.out.println("Индексы повторяющихся элементов:");

        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) {
                    System.out.println(j);
                }
            }
        }
    } //Добавляю комментарий в ветку MASTER
}     // Теперь добавили залили ветку *TREE* в ветку
      // *Master*
