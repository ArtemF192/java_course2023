package lr7.Example4;

public class Main {
    public static void main(String[] args) {
        ThirdClass obj1 = new ThirdClass('A', "Hello", 42);
        ThirdClass obj2 = new ThirdClass(obj1);


        System.out.println("Original Object:");
        System.out.println("Char1: " + obj1.char1);
        System.out.println("Str1: " + obj1.str1);
        System.out.println("Integer: " + obj1.integer);


        System.out.println("\nCopied Object:");
        System.out.println("Char1: " + obj2.char1);
        System.out.println("Str1: " + obj2.str1);
        System.out.println("Integer: " + obj2.integer);
    }

}
