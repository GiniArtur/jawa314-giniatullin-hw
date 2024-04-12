package Examples;

import java.util.Random;
import java.util.Scanner;

public class GiniyatullinRandom {  // TODO  Рандомное число Java314 Гиниятуллин
    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        boolean result = false;
        System.out.println("Добро пожаловать в игру 'Угадай число'!\n" + "Попробуйте угадать число от 1 до 100. \n");
        do {
            System.out.println("Введите вашу догадку\n");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            result = (number - i == 0) ? true : false;
            if (i - number > 0) System.out.println("Слишком маленькое число");
            if (i - number < 0) System.out.println("Слишком большое число");
        }   while (result == false);
        System.out.println("Random number = " + i + "\nПоздравляю!!! Вы угадали число!!!");

    }
}
