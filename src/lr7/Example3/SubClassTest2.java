package lr7.Example3;

public class SubClassTest2 extends SubClassTest1 {
    public String stringValue;

    SubClassTest2(int intValue, char charValue, String stringValue) {
        super(intValue, charValue);
        this.stringValue = stringValue;
    }

    public void setValues(int intValue, char charValue, String stringValue) {
        super.setValues(intValue, charValue);
        this.stringValue = stringValue;
    }

    @Override
    public String toString() {
        return "SubClassTest2: intValue=" + intValue + ", charValue=" + charValue + ", stringValue=" + stringValue;
    }
}
