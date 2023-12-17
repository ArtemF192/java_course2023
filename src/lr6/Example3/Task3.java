package lr6.Example3;


public class Task3 {
    public static int findMaximum(int... numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;


    }

    public static int findMinimum(int... numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static double findAverage(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }
}
