package Examples;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int firstNum = scanner.nextInt();
            int finalNum = scanner.nextInt();
            int i;
            for (i=firstNum; i<=finalNum; i++) {
                if (isPrime(i)) {
                    System.out.print(i+" ");
                }
            }
        }
        public static boolean isPrime(int num) {
            int i;
            for (i=2; i<num; i++) {
                if (num%i==0) {
                    return false;
                }
            }
            return true;
        }
    }

