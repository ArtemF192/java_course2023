package timus.task_1225;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер полоски: ");
        int M = scanner.nextInt();
        int result = countWays(M);
        System.out.println("Количество способов украсить витрину: " + result);
    }

    public static int countWays(int M) {
        int N = 45;
        long[] a = new long[N + 2];
        a[0] = 2;
        a[1] = 2;

        for (int i = 0; i < N; i++) {
            a[i + 2] = (a[i + 1] + a[i]);
        }
        return (int) a[M - 1];
    }
}

