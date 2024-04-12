package Examples;

import java.util.Arrays;
import java.util.Scanner;

public class Person {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести длину L в сантиметрах");
        int numberA = scanner.nextInt();
                        System.out.println("Количество целых метров=");
                        int S = numberA/100;
        scanner.close();
        System.out.println(S);



    }
}

