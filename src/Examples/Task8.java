package Examples;

public class Task8 {
    public static void main(String[] args) {

        for (int i = 10; i <= 1_000_000; i++) {
            int numberOfDigits = String.valueOf(i).length();
            int number = i;
            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                sum += Math.pow(digit, numberOfDigits);
                number /= 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
//[22:53] Ли Роман Владиславович     Работа с логарифмами
//int number;
//int armstrongNum;
//int power = 0;
//for (int i = 11; i < 1_000_000; i ++) {
//    number = i;
//    armstrongNum = 0;
//    power = (int) Math.log10(number) + 1;
//    while (number != 0) {
//        armstrongNum += Math.pow(number % 10, power);
//        number /= 10;
//    }
//    if (armstrongNum == i) {
//        System.out.println(armstrongNum);
//    }
//}