package lr11;

import java.util.ArrayList;
import java.util.List;

public class Example7 {
    public static List<String> filterStringsByLength(List<String> strings, int minLength) {
        List<String> filteredStrings = new ArrayList<>();

        for (String str : strings) {
            if (str.length() > minLength) {
                filteredStrings.add(str);
            }
        }

        return filteredStrings;
    }

    public static void main(String[] args) {
        List<String> originalList = new ArrayList<>();
        originalList.add("apple");
        originalList.add("banana");
        originalList.add("orange");
        originalList.add("grape");

        int minLength = 5;

        List<String> filteredList = filterStringsByLength(originalList, minLength);

        System.out.println("Original List: " + originalList);
        System.out.println("Filtered List (строки, которые имеют длину больше чем " + minLength + " символов): " + filteredList);
    }

}

//7.	Напишите функцию, которая принимает на вход список строк и возвращает новый список,
//содержащий только те строки, которые имеют длину больше заданного значения
