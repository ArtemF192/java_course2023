package lr1;

import java.util.Calendar;
import java.util.Scanner;

public class Example12 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int year = Calendar.getInstance().get(Calendar.YEAR);
        int age, result;
        do {
            System.out.print("Введите Ваш возраст: ");
            age = in.nextInt();
            result = age - year;
        } while(result>0);
        System.out.println("Ваш год рождения" + result);
    }
}
