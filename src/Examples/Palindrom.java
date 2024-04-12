package Examples;

import java.util.Scanner;
public class Palindrom {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String line = scanner.nextLine();
            String lineMod = line.toLowerCase().replaceAll("[^а-я,a-z]", "");
            int lineLength = lineMod.length() - 1;
            int x = 0;
            while (x <= (lineLength - x)){
                char symbolOne = lineMod.charAt(x);
                char symbolTwo = lineMod.charAt(lineLength - x);
                if(symbolOne != symbolTwo){
                    System.out.println("Это не палиндром");
                    return;
                }
                x++;
            }
            System.out.println("Это палиндром");
        }
    }

