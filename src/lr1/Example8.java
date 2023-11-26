package lr1;

import java.util.Scanner;

public class Example8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("День недели: ");
        String day = in.nextLine();

        System.out.println("Месяц: ");
        String month = in.nextLine();

        System.out.println("Дата: ");
        int date = in.nextInt();

        System.out.println("День недели: " + day);
        System.out.println("Месяц: " + month);
        System.out.println("Дата: " + date);

        in.close();
    }
}
