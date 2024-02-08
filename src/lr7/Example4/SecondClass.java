package lr7.Example4;

public class SecondClass extends FirstClass{
    public String str1;
    SecondClass(char char1, String str1) {
        super(char1);
        this.str1 = str1;
    }
    SecondClass(SecondClass copy) {
        super(copy);
        this.str1 = copy.str1;
    }
}
