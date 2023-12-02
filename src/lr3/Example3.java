//        3. Напишите программу, которая выводит последовательность чисел
//        Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
//        следующее число равно сумме двух предыдущих (получается последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество чисел
//        в последовательности вводится пользователем. Предложите версии
//        программы, использующие разные операторы цикла.

package lr3;

import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Ввведите количество чисел\n");
        int x = in.nextInt();

        Fib.WhileFib(x);
        Fib.ForFib(x);
    }

    static class Fib {
        static void WhileFib(int x) {
            System.out.println("\n\nверсия программы на основе оператора \"while\"");
            int i = x;
            long k = 0;
            long l = 1;
            long m = 1;
            while (i > 0) {
                System.out.printf("%d, ", m);
                m = k + l;
                k = l;
                l = m;
                i--;
            }
            System.out.println("\nконец цикла");
        }

        static void ForFib(int x) {
            System.out.println("\n\nверсия программы на основе оператора \"for\"");
            long k = 0;
            long l = 1;
            long m = 1;
            for (int x1 = x; x1 > 0; --x1) {
                System.out.printf("%d, ", m);
                m = k + l;
                k = l;
                l = m;
            }
            System.out.println("\nконец цикла");
        }
    }
}


