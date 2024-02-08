package lr7.Example4;

public class ThirdClass extends SecondClass{
    public int integer;
    ThirdClass(char char1, String str1, int integer) {
        super(char1, str1);
        this.integer = integer;
    }
    ThirdClass(ThirdClass copy) {
        super(copy);
        this.integer = copy.integer;
    }
}
