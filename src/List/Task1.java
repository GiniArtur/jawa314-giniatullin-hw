package List;
import java.util.ArrayList;
import java.util.List;
                                                                       //Java 314 _ Giniyatullin_AF
                                                                       //Todo Задача 1: Извлечение подсписка   Задачи по коллекции List
                                                                       //Домашняя работа по LIST(ArrayList LinkedList)
/*
Создайте список строк типа ArrayList или LinkedList,
содержащий несколько элементов. Напишите код,
который извлекает подсписок из исходного списка
и выводит его на экран.
 */
public class Task1 {
    public static void main(String[] args) {
        List<String> listOne = new ArrayList<>();
        listOne.add("Стол");
        listOne.add("Стул");
        listOne.add("Кровать");
        listOne.add("Диван");
        listOne.add("Люстра");
        listOne.add("Компьютер");
        for (String item : listOne) {
            System.out.println("Элемент списка listOne : " + item);
        }
        List<String> subList = new ArrayList<>();
        subList = listOne.subList(0, 3);
        for (String item : subList) {
            System.out.println("Элемент списка subList: " + item);
        }
    }
    }
    //Знакомство с Git


