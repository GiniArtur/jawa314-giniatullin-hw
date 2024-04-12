package Examples;

import java.util.Arrays;
import java.util.Scanner;

public class Ternary2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
               System.out.println("Введите число ");
        int item = sc.nextInt();
        //int item = 7;
        int result = (item%2);

        String isEven = (result==0) ? "Четное!" : "Нечетное!";// Четное число?



        System.out.println("Число = " + item + " "+ isEven);


    }


    }






