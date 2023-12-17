package lr6.Example1;

public class Main {
    public static void main(String[] args) {
        MyClass1 myClass1 = new MyClass1();

        myClass1.setCh1OrStr1('l');
        myClass1.setCh1OrStr1("Привет");

        System.out.println(myClass1.ch1);
        System.out.println(myClass1.str1);

        char[] chars1 = new char[5];
        chars1[0] = 'П';
        chars1[1] = 'о';
        chars1[2] = 'к';
        chars1[3] = 'а';
        chars1[4] = '!';
        myClass1.setCh1OrStr1(chars1);
        System.out.println(myClass1.str1);

        char[] chars2 = new char[1];
        chars2[0] = 'Ц';

        myClass1.setCh1OrStr1(chars2);

        System.out.println(myClass1.ch1);

    }
}
