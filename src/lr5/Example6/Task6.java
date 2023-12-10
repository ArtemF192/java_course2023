package lr5.Example6;

public class Task6 {
    private static int min;
    private static int max;



    @SuppressWarnings("SameParameterValue")
    static void SetInt(int num1, int num2) {
        System.out.println("Метод SetInt() c 2-я аргументами");
        min = Math.min(Math.min(num1, min),num2);
        max = Math.max(Math.max(num1, max),num2);
    }

    static void SetInt() {
        System.out.println("Метод SetInt() c 1-м аргументом");
        min = Math.min(min, -9);
        max = Math.max(max, -9);
    }

    static void PrintInt() {
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }

    Task6(int num1, int num2) {
        System.out.println("Конструктор Task6() c 2-я аргументами");
        min = Math.min(num1,num2);
        max = Math.max(num1,num2);
    }

    Task6(int num) {
        System.out.println("Конструктор Task6() c 1-м аргументом");
        min = Math.min(min, num);
        max = Math.max(max, num);
    }
}

