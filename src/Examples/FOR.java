package Examples;

import java.util.Arrays;
import java.util.Scanner;

public class FOR {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВЕдите начало диапазона: ");
        int number1 = scanner.nextInt();
        System.out.println("ВВЕдите конец диапазона: ");
        int number2 = scanner.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = number1; i <= number2; i++) {
            sum += i;
            count++;
        }
        double avg = (double) sum / count;
        System.out.println("сумма = " + sum);
        System.out.println(" среднее арифметическое = " + avg);
    }
}

