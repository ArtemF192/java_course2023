package lr5.Example3;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int x = in.nextInt();
        System.out.println("Введите второе число");
        int y = in.nextInt();
        new Task3();
        new Task3(x);
        new Task3(x, y);




    }
}

//        Напишите программу с классом, у которого есть два целочисленных поля.
//        В классе должны быть описаны конструкторы, позволяющие создавать
//        объекты без передачи аргументов, с передачей одного аргумента и с
//        передачей двух аргументов.
