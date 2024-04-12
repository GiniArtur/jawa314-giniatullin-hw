package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.time.LocalDate;

public class Main {                                           //Java314 Giniyatullin_AF ИСКЛЮЧЕНИЯ
    public static void main(String[] args) {

        validateEmail();
        parseDate();
        sqrt();
        factorial();
    }

    //TODO: Задача 1. Ввод данных: 
    //Напишите программу, которая запрашивает у пользователя ввод данных и
    // пытается обработать этот ввод. Обработайте исключение InputMismatchException,
    //которое возникает, если введенные данные не соответствуют ожидаемому формату.


    public static void validateEmail() {
        var scanner = new Scanner(System.in);
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        System.out.println("Введите email адрес ");

        try {
            String email = scanner.next();
            Pattern pattern = Pattern.compile(emailRegex);  //Работа с регулярными выражениями в любой Java-программе начинается с создания объекта класса *Pattern*
            Matcher matcher = pattern.matcher(email);       //необходимо вызвать один из двух имеющихся в классе статических методов *compile*, который
            //принимает один аргумент – строковый литерал регулярного выражения,
            // *Matcher* представляет собой класс, из которого создается объект для поиска совпадений по шаблону.
            // pattern.matcher(email) - создали поисковик в тексте “email” по шаблону "emailRegex"
            if (matcher.matches()) {
                System.out.println("Valid email");
            } else {
                throw new InputMismatchException("Invalid email");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    //TODO: Задача 2. Парсинг даты:
    //Напишите программу, которая запрашивает у пользователя ввод даты в формате
    //"год-месяц-день" (например, "2022-01-31"). Затем попробуйте преобразовать эту строку в объект типа
    //LocalDate с помощью метода LocalDate.parse(). Обработайте возможное исключение DateTimeParseException, если введенная строка имеет неверный формат.
    //
    //

    public static void parseDate() {
        var scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате *год-месяц-день* (например, *2022-01-31*)");

        String inputDate = scanner.next();

        try {
            LocalDate date = LocalDate.parse(inputDate);
            System.out.println("Entered date is valid: " + date);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }

    //TODO: Задача 3. Вычисление квадратного корня: 
    //Напишите программу, которая запрашивает у пользователя число и вычисляет его
    //квадратный корень с помощью метода Math.sqrt().
    //Обработайте возможное исключение IllegalArgumentException, если пользователь вводит отрицательное число.

    public static void sqrt() {
        var scanner = new Scanner(System.in);
        System.out.println("Введите число, у которого будет вычисляться квадратный корень");
        double num = scanner.nextDouble();
        try {
            if (num < 0) {
                throw new IllegalArgumentException("sqrt of a negative value");
            }
            System.out.println("Квадратный корень числа = " + Math.sqrt(num));
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }

    //TODO: Задача 4. Подсчет факториала:
    //Напишите программу, которая запрашивает у пользователя целое число и вычисляет его
    //факториал. Факториал числа nn (обозначается n!n!) - это произведение всех целых чисел
    //от 1 до nn. Например, 5!=5×4×3×2×1=120   Однако, для решения этой задачи предусмотрите возможность ввода отрицательных
    //чисел. В случае, если пользователь ввел отрицательное число, выбросьте специальное исключение NegativeNumberException, а затем обработайте его, выводя сообщение об
    //ошибке. Вот отдельный класс ошибки, который также необходимо создать.
    //      class NegativeNumberException extends Exception {
    //      public NegativeNumberException(String message) { super(message);}
    //      }
    public static void factorial() {
        var scanner = new Scanner(System.in);
        System.out.println("Введите число, факториал которого необходимо вычислить");
        int num = scanner.nextInt();

        try {
            System.out.println("Факториал числа = " + factorial(num));
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static int factorial(int num) throws NegativeNumberException {
        if (num < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed");
        }
        if (num <= 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
