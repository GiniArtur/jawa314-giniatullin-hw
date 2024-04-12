package Lesson_Potoki;


    public class Task implements Runnable {
        private long counter;
        //volatile - не кеширует переменную
        private volatile boolean isRunning;

        public Task() {
            isRunning = true;
        }

        public long getCounter() {
            return counter;
        }

        @Override
        public void run() {
            while (isRunning) {
                counter++;
            }
            System.out.println("Task: " + counter);
        }
        public void stop() {
            isRunning = false;
        }
    }

