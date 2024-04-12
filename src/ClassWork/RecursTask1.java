package ClassWork;

public class RecursTask1 { // JAVA314 Giniyatullin   Самостоятельная работа
    public static void main(String[] args) {     //  TODO   Нахождение факториала числа Рекурсия
        int t = 3;
        System.out.println("Факториал числа " + t + " равен " + factorial(t));

    }

    public static long factorial(int t) {
        if ((t == 0) || (t == 1)) {
            return 1;
        } else return t * factorial(t - 1);
    }
}
