package lr11;

import java.util.ArrayList;
import java.util.List;


public class Example6 {

    public static List<Integer> filterIntegers(List<Integer> numbers, int divisor) {
        List<Integer> divisibleNumbers = new ArrayList<>();

        for (Integer num : numbers) {
            if (num % divisor == 0) {
                divisibleNumbers.add(num);
            }
        }

        return divisibleNumbers;
    }

    public static void main(String[] args) {

        List<Integer> originalList = new ArrayList<>();
        originalList.add(10);
        originalList.add(15);
        originalList.add(20);
        originalList.add(25);
        originalList.add(30);

        int divisor = 3;

        List<Integer> filteredList = filterIntegers(originalList, divisor);

        System.out.println("Original List: " + originalList);
        System.out.println("Filtered List (делятся на " + divisor + "): " + filteredList);
    }

}

//6.	Напишите функцию, которая принимает на вход список целых чисел и возвращает новый список,
//содержащий только те числа, которые делятся на заданное число без остатка
