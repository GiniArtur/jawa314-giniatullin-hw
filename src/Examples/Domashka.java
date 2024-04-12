package Examples;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Domashka {
    public static void main(String[] args) {

        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean F = a>0;
        if (F) {

            System.out.println("Число положительное");
        }

    }
}
