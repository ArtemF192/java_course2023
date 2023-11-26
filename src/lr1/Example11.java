package lr1;

import java.util.Scanner;
import java.util.Calendar;

public class Example11 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        int year = Calendar.getInstance().get(Calendar.YEAR);
        int myyear, result;
        do {
            System.out.print("Введите год рождения: ");
            myyear = in.nextInt();
            result = myyear - year;
        } while(result>0);
        System.out.println(name + result);
    }
}
