package Examples;

import java.util.Arrays;
import java.util.Scanner;

public class Ternary3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число ");
        int item = sc.nextInt();
        int result1 = (item % 2) + (item % 5);
        int result2 = (item % 3) + (item % 7);
        if (result1 == 0) {
            System.out.println("Число" + item + " делится нацело на 2,5");
        }
        if (result2 == 0) {
            System.out.println("Число" + item + " делится нацело на 3,7");
        }
        if (result1 != 0) {
            System.out.println("Число" + item + " не делится нацело на 2,5");
        }
        if (result2 != 0) {

            System.out.println("Число" + item + " не делится нацело на 3,7");
        }


    }
}


