package Examples;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер дома от 1 до 5");
        int choice = sc.nextInt(); // Ввод значения с клавиатуры
        switch (choice) {
            case 1:
                System.out.println("Выбран дом №1, количество подъездов в доме 5");
                break;
            case 2:
                System.out.println("Выбран дом №2, количество подъездов в доме 3");
                break;
            case 3:
                System.out.println("Выбран дом №3, количество подъездов в доме 2");
                break;
            case 4:
                System.out.println("Выбран дом №4, количество подъездов в доме 10");
                break;
            case 5:
                System.out.println("Выбран дом №5, количество подъездов в доме 6");
                break;
            default:
                System.out.println("Выбран номер дома, невходящий в диапазон от 1 до 5");
                break;
        }
    }
}

