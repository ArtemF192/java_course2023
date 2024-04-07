package lr12;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Example5 {
    public static int findMax(int[] arr) {
        int processors = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(processors);

        Future<Integer>[] results = new Future[processors];

        for (int i = 0; i < processors; i++) {
            final int threadIndex = i;
            results[i] = executor.submit(() -> {
                int max = Integer.MIN_VALUE;
                int startIndex = threadIndex * (arr.length / processors);
                int endIndex = (threadIndex == processors - 1) ? arr.length : (threadIndex + 1) * (arr.length / processors);
                for (int j = startIndex; j < endIndex; j++) {
                    if (arr[j] > max) {
                        max = arr[j];
                    }
                }
                return max;
            });
        }

        int overallMax = Integer.MIN_VALUE;
        try {
            for (Future<Integer> result : results) {
                int threadMax = result.get();
                if (threadMax > overallMax) {
                    overallMax = threadMax;
                }
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }

        return overallMax;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 3, 9, 2, 7, 6, 4};
        int max = findMax(arr);
        System.out.println("Максимальный элемент в массиве: " + max);
    }
}

//5. Напишите функцию, которая находит максимальный элемент в массиве целых чисел
//при помощи многопоточности. Количество потоков должно быть равно количеству ядер процессора.

