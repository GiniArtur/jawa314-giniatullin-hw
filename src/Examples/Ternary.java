package Examples;

import java.util.Scanner;
public class Ternary {
    public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int numberFirst = sc.nextInt();
        System.out.println("Введите второе число ");
        int numberSecond = sc.nextInt();
        int result = 0;
        if (numberFirst > numberSecond) { result = 1; }  //Todo сравнение чисел CASE
        if (numberFirst < numberSecond) { result = 2; }
        if (numberFirst == numberSecond) { result = 3; }
        switch (result){
                case 1:
                System.out.println("Первое число больше второго ");
                break;
                case 2:
                    System.out.println("Второе число больше первого ");
                    break;
                case 3:
                    System.out.println("Числа равны");
                    break;
                    default:
                    System.out.println("Ошибка! Не сработал CASE!!!!");
                    break;
            }
            System.out.println("Первое число =" + numberFirst);
            System.out.println("Второе число =" + numberSecond);

        }
    }

