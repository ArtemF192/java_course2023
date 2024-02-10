package lr7.Example5;

public class SubClass2 extends SuperClass{

    protected char char1;

    SubClass2(String str1, char char1) {
        super(str1);
        this.char1 = char1;
    }
    @Override
    public void NameClassValueField() {
        System.out.println("Class: " + this.getClass().getSimpleName() + ", String Field: " + str1 + ", Char Field: " + char1);
    }
}
