package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = in.nextInt();
        int a, b, sum, kvadrat;
        a = number - 1;
        b = number + 1;
        sum = a + b + number;
        kvadrat = sum * sum;

        System.out.println(a + ", " + number + ", " + b + ", " + kvadrat);
    }
}
