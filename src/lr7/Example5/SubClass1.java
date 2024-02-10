package lr7.Example5;

public class SubClass1 extends SuperClass{

    protected int integer;

    SubClass1(String str1, int integer) {
        super(str1);
        this.integer = integer;
    }

    @Override
    public void NameClassValueField() {
        System.out.println("Class: " + this.getClass().getSimpleName() + ", String Field: " + str1 + ", Int Field: " + integer);
    }
}
