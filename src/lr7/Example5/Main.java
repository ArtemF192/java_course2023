package lr7.Example5;

public class Main {
    public static void main(String[] args) {

        SubClass1 obj1 = new SubClass1("Hello", 42);
        SubClass2 obj2 = new SubClass2("World", 'A');

        obj1.NameClassValueField();
        obj2.NameClassValueField();

        // Использование объектной переменной суперкласса для объекта производного класса
        SuperClass superClassObj = obj1;
        superClassObj.NameClassValueField();
    }

}
