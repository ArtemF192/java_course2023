//        2. Напишите программу, в которой пользователю предлагается
//        ввести название дня недели. По введенному названию программа определяет
//        порядковый номер дня в неделе. Если пользователь вводит неправильное
//        название дня, программа выводит сообщение о том, что такого дня нет.
//        Предложите версию программы на основе вложенных условных операторов и
//        на основе оператора выбора switch.

package lr3;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели");
        String day = in.nextLine();

        WeekDay.IfMethod(day);
        WeekDay.SwitchMethod(day);
    }

    static class WeekDay {

        @SuppressWarnings("UnnecessaryLocalVariable")
        static void IfMethod(String d) {
            String day = d;
            System.out.println("\nверсия программы на основе вложенных условных операторов");
            int dayN = 0;
            if (d.equals("Понедельник")) {
                dayN = 1;
            } else if (d.equals("Вторник")) {
                dayN = 2;
            } else if (d.equals("Среда")) {
                dayN = 3;
            } else if (d.equals("Четверг")) {
                dayN = 4;
            } else if (d.equals("Пятница")) {
                dayN = 5;
            } else if (d.equals("Суббота")) {
                dayN = 6;
            } else if (day.equals("Воскресенье")) {
                dayN = 7;
            } else {
                System.out.println(day + " такого дня нет");
            }
            if (dayN != 0) {
                System.out.printf("%s это %s-й день недели\n", day, dayN);
            }

        }

        @SuppressWarnings("UnnecessaryLocalVariable")
        static void SwitchMethod(String d) {
            System.out.println("\nверсия программы на основе оператора выбора switch");
            String day = d;
            switch (day) {
                case "Понедельник":
                    System.out.println(day + " это 1-ый день недели");
                    break;
                case "Вторник":
                    System.out.println(day + " это 2-ой день недели");
                    break;
                case "Среда":
                    System.out.println(day + " это 3-ий день недели");
                    break;
                case "Четверг":
                    System.out.println(day + " это 4-ый день недели");
                    break;
                case "Пятница":
                    System.out.println(day + " это 5-ый день недели");
                    break;
                case "Суббота":
                    System.out.println(day + " это 6-ой день недели");
                    break;
                case "Воскресенье":
                    System.out.println(day + " это 7-ой день недели");
                    break;
                default:
                    System.out.println(day + " такого дня нет");
                    break;
            }
        }
    }

}
