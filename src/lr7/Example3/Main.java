package lr7.Example3;

public class Main {
    public static void main(String[] args) {
        SuperClassTest superclasstestobj = new SuperClassTest(10);
        System.out.println(superclasstestobj);

        SubClassTest1 subclasstest1obj = new SubClassTest1(20, 'A');
        System.out.println(subclasstest1obj);

        SubClassTest2 subclasstest2obj = new SubClassTest2(30, 'B', "Hello");
        System.out.println(subclasstest2obj);
    }

}
