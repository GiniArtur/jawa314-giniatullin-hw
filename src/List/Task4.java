package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;                               //Java 314 _ Giniyatullin_AF

                                                      //  Задачи по коллекции List
public class Task4 {                                 //Todo Задача 4*: Поиск уникального элемента     Задачи по коллекции List
    /*
   /Предположим, у вас есть список целых чисел. Некоторые из
   /чисел встречаются в списке дважды, а одно число встречается только один раз.
   /Ваша задача - найти это уникальное число.
   /Напишите метод, который принимает на вход список целых чисел и возвращает уникальное число из списка.
     */
    public static void main(String[] args) {
        Random rnd = new Random();
        LinkedList<Integer> integerList = new LinkedList<>();
        for (int i = 0; i < 15; i++) {
            integerList.add(rnd.nextInt(1, 6));
        }
        int uniqueNumber = rnd.nextInt(100, 500);
        System.out.println(" Уникальное число - uniqueNumber = " + uniqueNumber);
        integerList.add(rnd.nextInt(0, integerList.size()), uniqueNumber);    // добавляется число *uniqueNumber* на какую-то позицию  по рандому
        integerList.add(1);
        for (Integer item : integerList) {
            System.out.println(item);
        }
        Integer unique = findUnique(integerList);
        System.out.println((unique == null) ? "Уникальный элемент не найден, либо кол-во уникальных элементов больше 2-х" : "Найден уникальный элемент: " + unique);
    }
    private static Integer findUnique(List list) {
        List<Integer> notUniqueList = new ArrayList<>();
        Integer unique = null;
        Integer element;
        for (int i = 0; i < list.size(); i++) {
            boolean isUnique = true;
            element = (Integer) list.get(i);
            if (notUniqueList.contains(element)) {
                continue;
            }
            for (int j = i + 1; j < list.size(); j++) {
                if (element.equals(list.get(j))) {
                    isUnique = false;
                    notUniqueList.add(element);
                    break;
                }
            }
            if (isUnique) {
                if (unique != null) {
                    return null;
                }
                unique = element;
            }
        }
        return unique;
    }
}

