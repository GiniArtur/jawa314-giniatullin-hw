package Set;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Напишите метод, который принимает на вход строку и
 * проверяет, содержит ли она все уникальные символы.
 * Метод должен вернуть true, если все символы в строке уникальны,
 * и false в противном случае.                                          //Java314 Giniyatullin_AF
 */
public class Task1 {                           //Todo Проверка на уникальность * Задачки по Set
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите символы \n ");
        String inputStr = scaner.nextLine();
        boolean res = isUnicueAllChar(inputStr);
        System.out.println("Символы уникальны? - " + res);
    }

    public static boolean isUnicueAllChar(String string) {
        HashSet<Character> uniqueChar = new HashSet<>();
        for (char ch : string.toCharArray()) {
            if (!uniqueChar.add(ch)) {
                return false;
            }
        }
        return true;
    }
}




