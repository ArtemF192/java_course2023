package lr6.Example5;


public class Main {
    public static void main(String[] args) {
        int n = 3;

        int sum = calculateSumOfSquares(n);
        System.out.println("Сумма квадратов: " + sum);
    }

    public static int calculateSumOfSquares(int n) {
        return (n * (n + 1) * (2 * n + 1)) / 6;
    }
}

//    Напишите программу со статическим методом, которым вычисляется сумма квадратов
//        натуральных чисел. Число n передается аргументом
//        методу.
