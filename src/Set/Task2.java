package Set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
                                                                //Java314 Гиниятуллин АФ
                                                                // Todo Объединение множеств    *Задачки по Set*
/*
* Напишите метод, который принимает на вход два
* множества Set и возвращает новое множество,
* содержащее все элементы из обоих исходных множеств.
 */

public class Task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Set<Integer> hashSet1 = new HashSet<>(5);
        Set<Integer> hashSet2 = new HashSet<>();
        hashSet1.add(rnd.nextInt(0, 20));
        hashSet1.add(rnd.nextInt(0, 20));
        hashSet1.add(rnd.nextInt(0, 20));
        hashSet1.add(rnd.nextInt(0, 20));
        hashSet1.add(rnd.nextInt(0, 20));
        hashSet1.add(rnd.nextInt(0, 20));
        hashSet1.add(rnd.nextInt(0, 20));
        hashSet2.add(rnd.nextInt(10, 40));
        hashSet2.add(rnd.nextInt(10, 40));
        hashSet2.add(rnd.nextInt(10, 40));
        hashSet2.add(rnd.nextInt(10, 40));
        hashSet2.add(rnd.nextInt(10, 40));
        hashSet2.add(rnd.nextInt(10, 40));
        hashSet2.add(rnd.nextInt(10, 40));

        System.out.print("Первое множество : " + hashSet1 + " \n");
        System.out.print("Второе  множество : " + hashSet2 + "\n");
        Set<Integer> unionHashSets = uunionSet(hashSet1, hashSet2);
        System.out.println("Объединение множеств :" + unionHashSets);
    }

    public static <T> Set<T> uunionSet(Set<T> t1, Set<T> t2) {
        Set<T> unionSets = new HashSet<>(t1);
        unionSets.addAll(t2);
        return unionSets;

    }

}
