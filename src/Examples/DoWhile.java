package Examples;

import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
            int num;
            do {
                System.out.println("Введите число, входящее в диапазон от 0 до 100 ");
                num = sc.nextInt();
            } while (num < 0 || num > 100);
            System.out.println("Вы ввели число " + num);
        }
    }
//[22:55] Комаров Никита Олегович
//public static void main(String[] args) {
//    //TODO:Подсчитать количество цифр в числе:
//    int num = 19876;
//    int count = 0;
//    do {
//        num /= 10;
//        count++;
//    } while (num != 0);
//    System.out.println(count);
//}
