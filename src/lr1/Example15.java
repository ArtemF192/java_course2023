package lr1;

import java.util.Scanner;

public class Example15 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int firstnumber = in.nextInt();

        System.out.println("Введите второе число: ");
        int secondnumber = in.nextInt();

        int sum = firstnumber + secondnumber;
        int raznost = firstnumber - secondnumber;
        System.out.println("Сумма равна: " + sum);
        System.out.println("Разность равна: " + raznost);
    }
}
