package lr9.example5;

public class Recursion1 {
    public static void main(String[] args) {
        System.out.println("Результат: " + fact(5));
    }

    public static int fact(int n) {
        return factHelper(n);
    }

    private static int factHelper(int n) {
        System.out.println("Расчет факториала(" + n + ")");
        if (n == 0) {
            System.out.println("Достижение базового случая: fact(0)");
            return 0;
        } else if (n == 1) {
            System.out.println("Достижение базового случая: fact(1)");
            return 1;
        } else {
            int result = factHelper(n - 2) + factHelper(n - 1);
            System.out.println("Возвращаемый результат для заданного значения факториала(" + n + "): " + result);
            return result;
        }
    }
}

//Для примера 5 дополнительно вывести в консоль последовательность обхода дерева рекурсивных вызовов.
