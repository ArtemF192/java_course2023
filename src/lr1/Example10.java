package lr1;

import java.util.Calendar;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int year = Calendar.getInstance().get(Calendar.YEAR);
        int myyear, result;
        do {
            System.out.print("Введите год рождения: ");
            myyear = in.nextInt();
            result = myyear - year;
        } while(result>0);
        System.out.println("Ваш возраст" + result);
    }
}
