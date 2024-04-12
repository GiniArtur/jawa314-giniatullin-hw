package Lesson_SET;

import java.util.HashSet;

public class Mane {
    public static void main(String[] args) {
        //План:
        //HashSet
        //TreeSet
        //Set - уникальный набор элементов

        HashSet<Task> todoList = new HashSet<>();

        long start = System.currentTimeMillis();
        int value = 999000;
        for (int i = 0; i < 1_000_000; i++) {
            int random = (int) (1000 * Math.random());
            if (todoList.add(new Task("Купить молоко" + random))) {
                System.out.println(i + " - " + random);
            } else {
                value -= 1000;
            }
        }

        int sum = 0;
        for (int i = 1; i < 1001; i++) {
            sum += i;
        }
        for (int i = 0; i < value; i++) {
            sum += 1000;
        }


        System.out.println(sum);


        System.out.println("total time: " + (System.currentTimeMillis() - start));
        System.out.println(Task.getEqualsCount());

        System.out.println(todoList.size());
    }
    /*HashSet<Task> todoList = new HashSet<>();
todoList.add(new Task("Купить молоко"));
todoList.add(new Task("Приготовить ужин"));
todoList.add(new Task("Покормить кота"));
todoList.add(new Task("Купить молоко"));
todoList.add(new Task("Приготовить ужин"));

System.out.println(todoList.contains(new Task("купить молоко")));



System.out.println();
*/


  /*  //План:
    //HashSet - hashCode() и equals()
    //TreeSet
    //Set - уникальный набор элементов

    HashSet<Task> todoList = new HashSet<>();
    todoList.add(new Task("Купить молоко"));
    todoList.add(new Task("Приготовить ужин"));
    todoList.add(new Task("Покормить кота"));
    todoList.add(new Task("Купить молоко"));
    todoList.add(new Task("Приготовить ужин"));

    for (Task task : todoList) {
        System.out.println(task);
    }
}
*/
  //Set - уникальный набор элементов
  //HashSet - hashCode() и equals()
  // лучший случай - O(1)
  //TreeSet - Comparable<> compareTo() /
  //          Comparator<> compare()
  //O(logN)
  /*TreeSet<Task> todoList = new TreeSet<>();
        todoList.add(new Task("Купить молоко"));
        Thread.sleep(1);
        todoList.add(new Task("Приготовить ужин"));
        Thread.sleep(1);
        todoList.add(new Task("Покормить кота"));
        Thread.sleep(1);
        todoList.add(new Task("Купить молоко"));
        Thread.sleep(1);
        todoList.add(new Task("Приготовить ужин"));
//        for (Task task : todoList) {
//            System.out.println(task);
//        }
    //ceiling() - ищет объект, если нет, то ближайший больший объект
        System.out.println(todoList.ceiling(new Task("Покормить кот")));

    //floor() - ищет объект, если нет, то ближайший меньший объект
        System.out.println(todoList.floor(new Task("Покормить кот")));
    доступно контекстное меню
    
   */


}
