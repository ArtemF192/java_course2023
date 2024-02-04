package lr7.Example2;

public class SuperClassTest {

    private String str1;

    // Конструктор с одним текстовым аргументом
    SuperClassTest(String strEx) {
        this.str1 = strEx;
    }

    // Метод для присваивания значения полю без параметров
    public void setStr1() {
        this.str1 = "";
    }

    // Метод для присваивания значения полю с текстовым параметром
    public void setStr1(String strEx) {
        this.str1 = strEx;
    }

    // Метод для получения длины текстовой строки
    public int getLength() {
        return str1.length();
    }
}

