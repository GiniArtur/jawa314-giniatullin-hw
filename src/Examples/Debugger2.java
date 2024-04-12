package Examples;

import java.util.Scanner;
public class Debugger2 {
            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            char symbol = sc.next().charAt(0);
            int result;
            switch (symbol) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/', ':':
                    result = num1 / num2;
                    break;
                case '%':
                    result = num1 % num2;
                    break;
                default:
                    result = 0;
                    break;
            }
            System.out.println(num1 + " " + symbol + " " + num2 + " = "+ result);

        }
    }

