package List;

import java.util.ArrayList;
import java.util.List;                          //Java 314 _ Giniyatullin_AF
                                                //Todo Задача 3: Удаление дубликатов   Задачи по коллекции List
/*
Создайте список строк типа ArrayList или LinkedList,
который содержит несколько дубликатов. Напишите код,
который удаляет все дубликаты из списка, оставляя только
уникальные элементы. Выведите список после удаления дубликатов
*/
public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(30);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2 = RemoveDublcate(arrayList);
        System.out.println("Список элементов без повторяющихся значений :");
        for (Integer item : list2) {
            System.out.println(item);
        }
    }

    public static <T> ArrayList<T> RemoveDublcate(ArrayList<T> list) {
        ArrayList<T> list2 = new ArrayList<>();
        for (T item : list) {
            if (!list2.contains(item)) {
                list2.add(item);
            }
        }
        return list2;
    }
}
