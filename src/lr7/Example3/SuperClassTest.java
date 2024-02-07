package lr7.Example3;

public class SuperClassTest {
    public int intValue;

    SuperClassTest(int value) {
        this.intValue = value;
    }

    public void setValue(int value) {
        this.intValue = value;
    }

    @Override
    public String toString() {
        return "SuperClassTest: intValue=" + intValue;
    }
}
