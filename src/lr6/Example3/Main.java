package lr6.Example3;


public class Main {
    public static void main(String[] args) {
        int[] numbers = {15, 4, 7, 5, 11};

        int maximum = Task3.findMaximum(numbers);
        int minimum = Task3.findMinimum(numbers);
        double average = Task3.findAverage(numbers);

        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
        System.out.println("Average: " + average);
    }


}

//    Напишите программу с классом, в котором есть статические методы, которым можно передавать
//    произвольное количество целочисленных аргументов (или целочисленный массив). Методы, на основании
//    переданных аргументов или массива, позволяют вычислить: наибольшее значение, наименьшее
//    значение, а также среднее значение из набора чисел.
