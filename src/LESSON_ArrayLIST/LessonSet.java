package LESSON_ArrayLIST;

import java.util.Scanner;
import java.util.TreeSet;

public class LessonSet {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TreeSet<Integer> integerSet = new TreeSet<>();

        for (int i = 0; i < 10; i++) {
            integerSet.add((int) (100 * Math.random()));
        }

        System.out.println(integerSet);
        boolean isExit = false;
        while (!isExit) {
            try {
                System.out.println("1. Добавить элемент в список.\n2. Удалить элемент из списка.\n3. Показать содержимое списка.\n4. Проверить есть ли значение в списке.\n5. Заменить значение в списке.");
                System.out.print("Выберите действие: ");
                int action = scanner.nextInt();
                switch (action) {
                    case 1: {
                        System.out.print("\nВведите элемент для добавления: ");
                        integerSet.add(scanner.nextInt());
                        break;
                    }
                    case 2: {
                        System.out.print("\nВведите элемент, который хотите удалить: ");
                        int element = scanner.nextInt();
                        if (!integerSet.remove(element)) {
                            System.out.printf("Элемента %d нет в списке\n\n", element);
                        }
                        break;
                    }
                    case 3: {
                        System.out.print("\nПоказать содержимое списка: ");
                        for (int number : integerSet) {
                            System.out.print(number + " ");
                        }
                        System.out.println();
                        break;
                    }
                    case 4: {
                        System.out.println("Проверить есть ли значение в списке ");
                        System.out.println("Введите значение для проверки его в цикле");
                        int element = scanner.nextInt();
                        if (integerSet.contains(element)) {
                            System.out.println("Этот элемент есть в списке");
                        } else {
                            System.out.println("Этого элемента нет в списке");
                        }
                        break;
                    }
                    case 5: {
                        System.out.println("Заменить значение в списке ");
                        System.out.println("Введите число, которое надо заменить");
                        int oldElement = scanner.nextInt();
                        System.out.println("Введите число, НА которое надо заменить");
                        int newElement = scanner.nextInt();

                        if (integerSet.remove(oldElement)) {
                            integerSet.add(newElement);
                            System.out.println("Этот элемент заменен");
                        } else {
                            System.out.println(oldElement + " - нет в списке");
                        }
                        break;
                    }
                    default: {
                        isExit = true;
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Выходим!");
                isExit = true;
            }

        }

        scanner.close();
    }

}
