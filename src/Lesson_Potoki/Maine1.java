//package Lesson_Potoki;
//
//import java.util.ArrayList;
//
//public class Maine1 {
//
//    private static ArrayList<Double> numbers = new ArrayList<>();
//
//    public static void main(String[] args) {
//        ArrayList<Thread> threads = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            threads.add(new Thread(Main::someHeavyMethod));
//        }
//        threads.forEach(t -> t.start());
//    }
//
//    private static void someHeavyMethod() {
//        for (int i = 0; i < 100000; i++) {
//            double value = Math.random() / Math.random();
//            synchronized (numbers) {
//                numbers.add(value);
//            }
//        }
//        System.out.println(numbers.size());
//        numbers.clear();
//    }
//



