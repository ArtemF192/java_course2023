package lr6.Example4;


public class Main {
    public static void main(String[] args) {
        int number = 7;
        int doubleFactorial = calculateDoubleFactorial(number);
        System.out.println("Двойной факториал " + number + ": " + doubleFactorial);
    }

    public static int calculateDoubleFactorial(int n) {
        if (n <= 0) {
            return 1;
        }

        int result = 1;
        for (int i = n; i >= 1; i -= 2) {
            result *= i;
        }

        return result;
    }

}

//    Напишите программу, в которой описан статический метод для вычисления двойного факториала числа,
//        переданного аргументом методу. По определению, двойной факториал числа n (обозначается как n!!)
//        — это произведение через одно всех чисел, не больших числа n.
//        То есть n!! = n * (n - 2) * (n - 4)* ... (последний множитель равен 1 для нечетного n и равен 2
//        для четного n). Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15.
