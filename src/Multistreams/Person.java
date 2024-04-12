//package Multistreams;
//
//
//import java.util.concurrent.Callable;
//
//public class Person implements Callable {
//        private String name;
//        private int age;
//        private int countSteps;
//
//        private int pauseMs;
//        private boolean isFinished;
//
//        public Person(String name, int age, int pauseMs) {
//            this.name = name;
//            this.age = age;
//            this.pauseMs = pauseMs;
//        }
//
//        @Override
//        public boolean call() {
//            while (countSteps < 50) {
//                move();
//                System.out.println(this);
//                try {
//                    Thread.sleep(pauseMs);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//
//            }
//            return true;
//
//
//        private void move() {
//            countSteps++;
//        }
//
////    @Override
////    public Object call() throws Exception {
////        return isFinished;
////    }
//
//    @Override
//        public String toString() {
//            return "Person{" +
//                    "name='" + name + '\'' +
//                    ", age=" + age +
//                    ", countSteps=" + countSteps +
//                    '}';
//        }
//    }

