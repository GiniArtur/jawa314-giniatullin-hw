package Recyrs;

import java.util.Scanner;

public class RecursTask6 {                                  //Java314 Гиниятуллин_АФ
    public static int recursion(int n, int i) {              // TODO Рекурсия Разворот числа
        return (n==0) ? i : recursion( n/10, i*10 + n%10 );   //  Передаем число n, и i - отстаток от деления, вначале = 0
    }
    public static void main(String[] args) {                 //Для инвертирования числа в Java необходимо делить число на 10,
        int n;                                               // пока оно не станет равным 0. А в теле  находить остаток от деления
        Scanner sc = new Scanner(System.in);                 // на 10 и прибавлять к результату от предыдущего шага, увеличенного в 10 раз.
        System.out.println("Введите число N");
        n = sc.nextInt();

        System.out.println(recursion(n, 0));
    }
}
