package lr7.Example5;

public class SuperClass {

    protected String str1;

    SuperClass(String str1) {
        this.str1 = str1;
    }

    public void NameClassValueField() {
        System.out.println("Class: " + this.getClass().getSimpleName() + ", String Field: " + str1);
    }
}
