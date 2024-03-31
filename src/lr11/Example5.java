package lr11;

import java.util.ArrayList;
import java.util.List;


public class Example5 {
    public static List<String> filterStrings(List<String> strings, String substring) {
        List<String> filteredStrings = new ArrayList<>();

        for (String str : strings) {
            if (str.contains(substring)) {
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

        String substring = "an";

        List<String> filteredList = filterStrings(originalList, substring);

        System.out.println("Original List: " + originalList);
        System.out.println("Filtered List (containing '" + substring + "'): " + filteredList);
    }

}

//5.	Напишите функцию, которая принимает на вход список строк и возвращает новый список,
//содержащий только те строки, которые содержат заданную подстроку.
