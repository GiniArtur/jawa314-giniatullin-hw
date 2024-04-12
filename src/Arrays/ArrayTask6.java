package Arrays;

import java.util.Scanner;

public class ArrayTask6 {                        // TODO Java314_Гиниятуллин_Массивы_задача6
    public static void main(String[] args) {
        int[][][] array;
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Введите первую размерность массива:");
        int sizeX = sc.nextInt();
        System.out.println("Введите вторую размерность массива:");
        int sizeY = sc.nextInt();
        System.out.println("Введите третью размерность массива:");
        int sizeZ = sc.nextInt();
        array = new int[sizeX][sizeY][sizeZ];
        System.out.println("Задан массив чисел = ");
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                for (int z = 0; z < sizeZ; z++) {
                    array[i][j][z] = (int) (Math.random() * 30);
                    System.out.print(array[i][j][z] + "\t");
                    sum += array[i][j][z];
                }
            }
        }
        System.out.println(" ");
        System.out.println("Среднее значение элементов трехмерного массива = " + (float) sum / (sizeX + sizeY + sizeZ));
    }
}

