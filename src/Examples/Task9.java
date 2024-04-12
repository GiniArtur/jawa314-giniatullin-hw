package Examples;

public class Task9 {
    public static void main(String[] args) {
        int number;
        int armstrongNum;
        int power = 0;
        for (int i = 11; i < 1_000_000; i++) {
            number = i;
            armstrongNum = 0;
            power = (int) Math.log10(number) + 1;
            while (number != 0) {
                armstrongNum += Math.pow(number % 10, power);
                number /= 10;
            }
            if (armstrongNum == i) {
                System.out.println(armstrongNum);
            }
        }
    }
}