package lr11;

import java.util.ArrayList;
import java.util.List;

public class Example8 {
    public static List<Integer> filterIntegersByValue(List<Integer> numbers, int threshold) {
        List<Integer> filteredNumbers = new ArrayList<>();

        for (Integer num : numbers) {
            if (num > threshold) {
                filteredNumbers.add(num);
            }
        }

        return filteredNumbers;
    }

    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>();
        originalList.add(5);
        originalList.add(10);
        originalList.add(15);
        originalList.add(20);
        originalList.add(25);

        int threshold = 12;

        List<Integer> filteredList = filterIntegersByValue(originalList, threshold);

        System.out.println("Original List: " + originalList);
        System.out.println("Filtered List (числа, которые больше чем " + threshold + "): " + filteredList);
    }

}

//8.	Напишите функцию, которая принимает на вход список целых чисел и возвращает новый список,
//содержащий только те числа, которые больше заданного значения.
