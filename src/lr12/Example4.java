package lr12;

public class Example4 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new MyRunnable(i));
            thread.start();
        }
    }

    static class MyRunnable implements Runnable {
        private final int threadNumber;

        public MyRunnable(int threadNumber) {
            this.threadNumber = threadNumber;
        }

        @Override
        public void run() {
            System.out.println("Thread number: " + threadNumber);
        }
    }
}

//4. Напишите программу, которая создает 10 потоков и каждый поток выводит на экран свой номер.
