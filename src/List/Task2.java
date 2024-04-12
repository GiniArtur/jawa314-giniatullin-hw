package List;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;                                 //Java 314 _ Giniyatullin_AF
                                                        //Todo Задача 2: Поиск минимума и максимума   Задачи по коллекции List
/*
Создайте список чисел типа ArrayList или LinkedList,
заполните его несколькими числами. Напишите код,
который находит минимальный и максимальный элементы
в списке и выводит их на экран.
 */
public class Task2 {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(15);
        linkedList.add(13);
        linkedList.add(70);
        linkedList.add(2);
        linkedList.add(16);
        linkedList.add(17);
        Integer min = linkedList.get(0);
        Integer max = linkedList.get(0);
        for (Integer item : linkedList) {
            if (item < min) {
                min = item;
            }
        }
        System.out.println("Минимальный элемент списка = " + min);
        for (Integer item : linkedList) {
            if (item > max) {
                max = item;
            }
        }
        System.out.println("Максимальный элемент списка = " + max);
    }
}



