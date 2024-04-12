package NewClass;

public class Calculator {
    double numberA;
    double numberB;

    public void subtraction(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
        System.out.println("Разность чисел = " + (numberA - numberB));
    }

    public void multiplication(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
        System.out.println("Произведение чисел  = " + (numberA * numberB));
    }

    public void add(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
        System.out.println("Сумма чисел  = " + (numberA + numberB));
    }

    public void division(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
        System.out.println("Результат деления чисел = " + (double) (numberA / numberB));
    }
}

