package Generics;

import java.util.Arrays;

public class Main {                            //Java314 Giniyatullin - GENERICS
    public static void main(String[] args) throws Exception {
        Generic<Integer> test = new Generic<Integer>();
        int[] array1 = {0, 2, 5, 7, 9};
        int[] array2 = {1, 3, 6, 8, 10};
        boolean printBool = test.compareArrays(array1, array2);
        if (printBool == true) {
            System.out.println("Массивы равны - " + printBool);
        } else {
            System.out.println("Массивы не равны - " + printBool);
        }
        System.out.println("Запускаем метод *СЛИЯНИЕ МАССИВОВ* - ");
        System.out.println(Arrays.toString((test.mergeArrays(array1, array2))));
        String[] array3 = {"ghvd", "cnb", "f"};
        Generic<String> test1 = new Generic<String>();
        int res = test1.findElement(array3, "f");
        if (res == 1) {
            System.out.println("Элемент найден в массиве- " + res);
        } else {
            System.out.println("Элемент не найден - " + res);
        }
        DataContainer<String> dc = new DataContainer<>();
        System.out.println("Добавляем элементы в список - ");
        dc.add("10");
        dc.add("15");
        dc.add("FDJJ");

        System.out.println("Выводим список на консоль");
        dc.printData();

        System.out.println("Удалим элемент с индексом = 1");
        dc.deleteByIndex(1);

        System.out.println("Выводим список на консоль");
        dc.printData();

        System.out.println("Выводим первый элемент- " + dc.getDataByIndex(0));

        System.out.println("Поиск элемента 15, Вывод: " + dc.searchData("15"));
        if (dc.searchData("15") == -1) {
            System.out.println("Элемент не найден");
        }
    }
}
