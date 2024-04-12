package Examples;

public class OddNumber {
    public static void main(String[] args) { //ToDO Пропуск четных чисел Java314 Гиниятуллин
        System.out.println("Нечетные числа");
        for (int i = 0; i < 21; i++) {
            if (i % 2 == 0) continue;
            System.out.print(i + " ");
        }
    }
}
