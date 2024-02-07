package lr7.Example3;

public class SubClassTest1 extends SuperClassTest {
    public char charValue;

    SubClassTest1(int intValue, char charValue) {
        super(intValue);
        this.charValue = charValue;
    }

    public void setValues(int intValue, char charValue) {
        super.setValue(intValue);
        this.charValue = charValue;
    }

    @Override
    public String toString() {
        return "SubClassTest1: intValue=" + intValue + ", charValue=" + charValue;
    }
}

