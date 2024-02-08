package lr7.Example4;

public class FirstClass {
    public char char1;
    FirstClass(char char1) {
        this.char1 = char1;
    }
    FirstClass(FirstClass copy) {
        this.char1 = copy.char1;
    }
}
