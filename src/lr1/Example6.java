package lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("firstName: ");
        String firstName = in.nextLine();

        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println("Input secondName: ");
        String secondName = in.nextLine();

        System.out.println("firstName: " + firstName);
        System.out.println("name: " + name);
        System.out.println("secondName: " + secondName);
        in.close();
    }
}
