package lr1;

import java.util.Scanner;

public class Example9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Номер месяца: ");
        int month = in.nextInt();

        System.out.println("Количество дней в месяце: ");
        int days = in.nextInt();

        if (month == 1) {
            System.out.println("Январь");
        } else if (month == 2) {
            System.out.println("Февраль");
        } else if (month == 3) {
            System.out.println("Март");
        } else if (month == 4) {
            System.out.println("Апрель");
        } else if (month == 5) {
            System.out.println("Май");
        } else if (month == 6) {
            System.out.println("Июнь");
        } else if (month == 7) {
            System.out.println("Июль");
        } else if (month == 8) {
            System.out.println("Август");
        } else if (month == 9) {
            System.out.println("Сентябрь");
        } else if (month == 10) {
            System.out.println("Октябрь");
        } else if (month == 11) {
            System.out.println("Ноябрь");
        } else if (month == 12) {
            System.out.println("Декабрь");
        }

        if (month == 1 || month == 3 || month == 4 || month == 5 || month == 6 || month == 7 || month == 8 || month == 9 || month == 10 || month == 11 || month == 12) {
            System.out.println("Количество дней в месяце: " + days);
        } else if (month == 2) {
            System.out.println("Количество дней в месяце: 28 или 29");
        }


    }

}