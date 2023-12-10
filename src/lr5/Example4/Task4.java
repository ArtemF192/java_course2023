package lr5.Example4;

public class Task4 {
    public char ch1;
    public int int1;

    Task4(int i, char c) {
        this.ch1 = c;
        this.int1 = i;
        int length = (int) (Math.log10(int1) + 1);
        double result = (double) ch1 + (double) int1 * 1 / Math.pow(10, length);
        System.out.println("result1 = " + result + "; ch = " + (double) ch1 + "; int = " + length + "\n");
    }

    Task4(double d) {
        char ch1 = (char) d;
        int1 = (int) ((d - (int) d) * 100);
        System.out.println("ch = " + ch1 + "; int = " + int1 + "\n");
    }
}

