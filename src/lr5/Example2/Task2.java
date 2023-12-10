package lr5.Example2;

public class Task2 {
    private char ch1;
    private char ch2;

    public void setCh(char ch1, char ch2) {
        this.ch1 = ch1;
        this.ch2 = ch2;
    }

    public void showCharArray() {
        int int1 = ch1;
        int int2 = ch2;
        if (ch1 > ch2) {
            int1 = ch2;
            int2 = ch1;
        }
        int count = 1;
        for (int i = int1; i <= int2; i++) {
            System.out.println(count + " symbol = " + (char) i);
            count++;
        }

    }
}