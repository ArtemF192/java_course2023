package lr7.Example2;

public class Main {
    public static void main(String[] args) {
        SubClassTest subclass = new SubClassTest(10, "Hello, world!");

        // Использование методов для присваивания значений полям
        subclass.setStr1();
        subclass.setStr1("New Text");
        subclass.setStr1(42);
        subclass.setStr1("Another Text", 100);

        // Использование метода для получения длины текстовой строки
        int length = subclass.getLength();
        System.out.println("Length of the text: " + length);

        // Вывод значений полей
        System.out.println("Text: " + subclass.getStr1());
        System.out.println("Integer Value: " + subclass.getIntegerValue());
    }
}
