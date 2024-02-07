package lr7.Example2;

public class SubClassTest extends SuperClassTest {
    public int integerValue;

    // Конструктор с двумя параметрами (целочисленным и текстовым)
    SubClassTest(int integerValue, String strEx) {
        super(strEx);
        this.integerValue = integerValue;
    }

    // Переопределение метода для присваивания значения текстовому полю без параметров
    @Override
    public void setStr1() {
        super.setStr1();
        this.integerValue = 0; // Обнуляем целочисленное поле
    }

    // Перегрузка метода для присваивания значения текстовому полю с текстовым параметром
    public void setStr1(String strEx) {
        super.setStr1(strEx);
        this.integerValue = 0; // Обнуляем целочисленное поле
    }

    // Перегрузка метода для присваивания значения целочисленному полю
    public void setStr1(int integerValue) {
        super.setStr1();
        this.integerValue = integerValue;
    }

    // Перегрузка метода для присваивания значений текстовому и целочисленному полям
    public void setStr1(String strEx, int integerValue) {
        super.setStr1(strEx);
        this.integerValue = integerValue;
    }

    public String getStr1() {
        return null;
    }

    public String getIntegerValue() {
        return null;
    }
}
