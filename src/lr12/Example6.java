package lr12;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Example6 {
    public static int calculateSum(int[] arr) {
        int processors = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(processors);

        Future<Integer>[] results = new Future[processors];

        for (int i = 0; i < processors; i++) {
            final int threadIndex = i;
            results[i] = executor.submit(() -> {
                int sum = 0;
                int startIndex = threadIndex * (arr.length / processors);
                int endIndex = (threadIndex == processors - 1) ? arr.length : (threadIndex + 1) * (arr.length / processors);
                for (int j = startIndex; j < endIndex; j++) {
                    sum += arr[j];
                }
                return sum;
            });
        }

        int totalSum = 0;
        try {
            for (Future<Integer> result : results) {
                totalSum += result.get();
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = calculateSum(arr);
        System.out.println("Сумма элементов в массиве: " + sum);
    }
}

//6. Напишите функцию, которая суммирует элементы в массиве целых чисел при помощи многопоточности.
//Количество потоков должно быть равно количеству ядер процессора.

