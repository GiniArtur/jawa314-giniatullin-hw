package Set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
                                                                    //Java314 Гиниятуллин АФ
                                                                    // Todo Пересечение множеств *Задачки по Set*

public class Task3 {
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
        Set<Integer> diffSets = differenceSet(hashSet1, hashSet2);
        System.out.println("Пересечение множеств :" + diffSets);
    }

    public static <T> Set<T> differenceSet(Set<T> t1, Set<T> t2) {
        Set<T> diffeenceSets = new HashSet<>(t1);
        diffeenceSets.retainAll(t2);
        return diffeenceSets;

    }

}


