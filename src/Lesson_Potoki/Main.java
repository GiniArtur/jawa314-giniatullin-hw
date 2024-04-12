package Lesson_Potoki;



    public class Main {
        public static void main(String[] args) {
            Task task = new Task();
            new Thread(task).start();

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            task.stop();
            System.out.println("Main: " + task.getCounter());
        }
    }


