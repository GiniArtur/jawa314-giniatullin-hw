package StringsMethods;

import java.util.Arrays;
import java.util.Scanner;

public class StringMedoth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String[] myStr = new String[]{sc.nextLine()};
        System.out.println("Массив создан" + Arrays.toString(myStr));
        Object[] array = Arrays.stream(myStr).toArray();
        System.out.println("Массив создан" + Arrays.toString(array));
    }
}
