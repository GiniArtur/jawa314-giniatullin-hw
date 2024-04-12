package Examples;

import java.util.Scanner;

public class Java314GiniyatullinStar { // Todo Пирамида из звездочек Java314 Гиниятуллин
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите уровень");
        int level = sc.nextInt();
        int levelStar = 1;
        int levelSpase = level - 1;
        for (int i = 0; i < level; i++) {
            for (int j = 0; j < levelSpase; j++)
                System.out.print(" ");
            for (int s = 0; s < levelStar; s++) {
                System.out.print("*");
            }
            System.out.println();
            levelStar = levelStar+2;
            levelSpase--;


        }
    }
}
