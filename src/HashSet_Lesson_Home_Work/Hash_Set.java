package HashSet_Lesson_Home_Work;

import java.util.Arrays;
import java.util.HashSet;

                                                                            // Java314 Giniyatullin_AF
// Todo Поиск пары чисел с заданной суммой. Самостоятельная работа по Set
/*
Дан массив целых чисел nums и целочисленное значение targetSum.
Необходимо найти и вернуть индексы двух чисел в массиве, сумма которых равна targetSum.
Предполагается, что в решении существует только одна пара чисел с заданной суммой.
Подход к решению:
1.	Создайте пустой HashSet для хранения значений.
2.	Пройдите по каждому числу num в массиве nums.
3.	Для каждого числа num, проверьте, присутствует ли targetSum - num в HashSet:
	Если да, то это означает, что найдена пара чисел с заданной суммой. Верните индексы текущего числа и числа targetSum - num.
	Если нет, добавьте num в HashSet.
4.	Если после завершения прохода по массиву не найдена ни одна пара чисел, верните пустой массив или значение null.
 */
public class Hash_Set {
    public static void main(String[] args) {
        Integer[] nums = new Integer[]{10, 20, 30, 40, 50};
        int targetSum = 70;
        System.out.println(Arrays.toString(findTargetSumNumbers(nums, targetSum)));
    }

    public static int[] findTargetSumNumbers(Integer[] numbers, int targetSum) {
        HashSet<Integer> storageNumbers = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            if (storageNumbers.contains(targetSum - numbers[i])) {
                int targetSumIndex = -1;
                for (int j = 0; j < numbers.length; j++) {
                    if (numbers[j] == targetSum - numbers[i]) {
                        targetSumIndex = j;
                        break;
                    }
                }
                return new int[]{targetSumIndex, i};
            }
            storageNumbers.add(numbers[i]);
        }
        return null;
    }
}

