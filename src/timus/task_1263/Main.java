package timus.task_1263;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bin, sum = 0;
        int n = input.nextInt();
        int m = input.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < m; i++) {
            bin = input.nextInt();
            sum += 1;
            mas[bin - 1] = mas[bin - 1] + 1;

        }
        for (int i = 0; i < n; i++) {
            System.out.println(String.format("%.2f", mas[i] / (sum * 0.01)) + "%");
        }

    }
}
