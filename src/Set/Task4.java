package Set;


import java.util.HashSet;
import java.util.Random;
import java.util.Set;

//Java314 Гиниятуллин АФ
// Todo Разность множеств *Задачки по Set*
/*
 * Напишите метод, который принимает на вход два
 * множества Set и возвращает новое множество, содержащее
 * только те элементы, которые присутствуют только в одном из
 * исходных множеств.
 */
public class Task4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Set<Integer> hashSet1 = new HashSet<>(5);
        Set<Integer> hashSet2 = new HashSet<>();
        hashSet1.add(rnd.nextInt(0, 50));
        hashSet1.add(rnd.nextInt(0, 50));
        hashSet1.add(rnd.nextInt(0, 50));
        hashSet1.add(rnd.nextInt(0, 50));
        hashSet1.add(rnd.nextInt(0, 50));
        hashSet1.add(rnd.nextInt(0, 50));
        hashSet1.add(rnd.nextInt(0, 50));
        hashSet2.add(rnd.nextInt(10, 40));
        hashSet2.add(rnd.nextInt(10, 40));
        hashSet2.add(rnd.nextInt(10, 40));
        hashSet2.add(rnd.nextInt(10, 40));
        hashSet2.add(rnd.nextInt(10, 40));
        hashSet2.add(rnd.nextInt(10, 40));
        hashSet2.add(rnd.nextInt(10, 40));
        System.out.print("Первое множество : " + hashSet1 + " \n");
        System.out.print("Второе  множество : " + hashSet2 + "\n");
        Set<Integer> diffSets = othernessSet(hashSet1, hashSet2);
        System.out.println("Разность множеств :" + diffSets);
    }

    public static <T> Set<T> othernessSet(Set<T> t1, Set<T> t2) {
        Set<T> othernessSets = new HashSet<>();
        for (T num : t1) {
            if (!t2.contains(num)) {
                othernessSets.add(num);
            }
        }
        for (T num : t2) {
            if (!t1.contains(num)) {
                othernessSets.add(num);
            }
        }
        return othernessSets;
    }
}
