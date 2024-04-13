package lr9.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input x:");
        int x = scan.nextInt();
        RecBin BinaryRec =  new RecBin(x);
    }
}

//Создать приложение с использованием рекурсии для перевода целого числа,
//введенного с клавиатуры, в двоичную систему счисления.
