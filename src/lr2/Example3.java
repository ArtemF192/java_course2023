package lr2;

import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int x = in.nextInt();

        int result = x % 4;
        System.out.println("result = " + result);

        if (result == 0 && x >= 10) {
            System.out.println("Введенное число удовлетворяет критериям");
        } else {
            System.out.println("Введенное число не удовлетворяет критериям");
        }
        if (x < 10) {
            System.out.println("Введенное число должно быть не меньше 10");
        }
    }
}
