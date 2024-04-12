package Files_HomeWork;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Path;

public class Test {                                //Java314 Giniyatullin_AF
    public static void main(String[] args) {

        work1();
        work2();
        work3();
    }
    /* Задание 1:
       1. Пользователь вводит с клавиатуры путь к файлу.
        2. Программа считывает содержимое файла.
        3. Программа анализирует содержимое файла и подсчитывает количество букв, чисел и знаков препинания.
        4. Программа выводит на экран количество букв, чисел и знаков препинания в файле.
    */
    public static void work1() {
        int sumItems = 0;
        int sumDigits = 0;
        int sumLetters = 0;
        System.out.println("Введите директорию файла");
        var scanner = new Scanner(System.in);
        String path = scanner.next();         // Путь к файлу
        String items = "-?!*;=,.";           //Знаки препинания
        try {
            FileReader reader = new FileReader(path);
            char ch;
            int code;
                   while ((code = reader.read()) != -1) { // Пока есть данные
                ch = (char) code;
                if (items.contains(String.valueOf(ch))) {
                    sumItems++;
                }
                if (ch >= '0' && ch <= '9') {
                    sumDigits++;
                    continue;
                }
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= 'а' && ch <= 'я') || (ch >= 'А' && ch <= 'Я')) {
                    sumLetters++;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.print("Всего цифр:  " + sumDigits + " Всего цифр:  " + sumLetters + " Всего знаков препинания:  " + sumItems + "\n");
    }

    /*Задание 2:
        1. Пользователь с клавиатуры вводит путь к файлу, искомое слово и слово для замены.
        2. Программа открывает файл и ищет искомое слово в его содержимом.
        3. Если слово найдено, программа заменяет его на указанное слово.
        4. Программа подсчитывает количество произведенных замен.
        5. Программа выводит на экран отчет о количестве замен.

     */
    public static void work2() {
        var scanner = new Scanner(System.in);
        System.out.println("Введите директорию файла");
        String pathOfFile = scanner.next();
        System.out.println("Введите слово, которое надо заменить");
        String wordToChange = scanner.next();
        System.out.println("Введите новое слово:");
        String newWord = scanner.next();
        Path path = Path.of(pathOfFile);
        try {
            String maintenance = new String(Files.readAllBytes(path));     //Содержание. метод readAllBytes()
            // принимает объект Path, представляющий путь к файлу, и возвращает
            // массив байтов, содержащий все байты файла.
            System.out.println(maintenance);
            int change = (maintenance.length() - maintenance.replaceAll(wordToChange, "").length()) / wordToChange.length();   //Замена
            String newContents = maintenance.replaceAll(wordToChange, newWord);

            System.out.println(newContents);
            System.out.printf("Количество замен - %d ", change);
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
        }
    }

    /*Задание 3:
       1. Пользователь вводит с клавиатуры пути к четырем файлам.
       2. Программа открывает каждый из четырех файлов и считывает их содержимое.
       3. Программа записывает содержимое трех файлов в четвертый файл.
       4. Программа подсчитывает количество перенесенных байт.
       5. Программа выводит на экран отчет о количестве перенесенных байт.

     */
    public static void work3() {
        var scanner = new Scanner(System.in);
        System.out.println("Введите пути к следующим файлам");
        String[] paths = new String[4];
        System.out.print("Первый путь: ");
        paths[0] = scanner.next();
        System.out.print("Второй путь: ");
        paths[1] = scanner.next();
        System.out.print("Третий путь: ");
        paths[2] = scanner.next();
        System.out.print("Четвертый путь: ");
        paths[3] = scanner.next();
        int sumBytes = 0;
        Path path;
        ArrayList<byte[]> dates = new ArrayList<>();    //Данные файлов
        for (int i = 0; i < 4; i++) {
            path = Path.of(paths[i]);
            try {
                dates.add(Files.readAllBytes(path));                         //Содержание. метод readAllBytes()
                // принимает объект Path, представляющий путь к файлу, и возвращает
                // массив байтов, содержащий все байты файла.
                sumBytes += dates.getFirst().length;                         // getFirst(): возвращает без удаления элемент из головы очереди.
            } catch (IOException e) {
                System.out.println("Ошибка чтения файла " + i);
            }
        }
        try {
            FileWriter writer = new FileWriter(paths[3], true);
            writer.write(new String(dates.get(0), StandardCharsets.UTF_8));
            writer.write(new String(dates.get(1), StandardCharsets.UTF_8));
            writer.write(new String(dates.get(2), StandardCharsets.UTF_8));
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(new String(dates.get(0), StandardCharsets.UTF_8));
        System.out.println(new String(dates.get(1), StandardCharsets.UTF_8));
        System.out.println(new String(dates.get(2), StandardCharsets.UTF_8));
    }
}

