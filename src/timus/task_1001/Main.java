package timus.task_1001;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Long> list = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        while (scn.hasNextLong()) {
            long p = scn.nextLong();
            list.add(p);
        }
        scn.close();
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.printf("%.4f%n", Math.sqrt((double) list.get(i)));
        }
    }

}
