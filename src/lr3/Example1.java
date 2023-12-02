//        1. Напишите программу, в которой пользователь вводит целое число
//        в диапазоне от 1 до 7, а программа определяет по этому числу день недели.
//        Если введенное пользователем число выходит за допустимый диапазон,
//        выводится сообщение о том, что введено некорректное значение. Используйте
//        оператор выбора switch.

package lr3;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int day = in.nextInt();
        System.out.println(getDayName(day));
    }
    public static String getDayName(int day) {
        String dayName;
        switch (day) {
            case 1: dayName ="Понедельник"; break;
            case 2: dayName ="Вторник"; break;
            case 3: dayName ="Среда"; break;
            case 4: dayName ="Четверг"; break;
            case 5: dayName ="Пятница"; break;
            case 6: dayName ="Суббота"; break;
            case 7: dayName ="Воскресенье"; break;
            default:dayName ="Введено некорректное значение";
        }
        return dayName;
    }
}

