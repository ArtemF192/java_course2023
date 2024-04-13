package timus.task_1563;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] strings = new String[1000];
        Set<String> set = new HashSet<String>();
        int n, i;

        n = s.nextInt();
        n = n + 1;
        for (i = 0; i < n; i++) {
            set.add(s.nextLine());
        }
        if (n == set.size()) {
            System.out.println(0);
        } else {
            int n1 = set.size();
            n1 = n - n1;
            System.out.println(n1);
        }
    }
}

