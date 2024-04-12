package Examples;

import java.util.Scanner;

public class Factorial3 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int result = 1;
        System.out.print("Введите натуральное число: ");
        int value = scan.nextInt();
        for (int i = value; i > 1; i--) {
            result *= i;
        }
        if (value < 0) {
            System.out.println("Факториал отрицательного числа невозможен!");
        } else {
            System.out.println("Факториал числа " + value + " равен " + result);
        }
    }
}
