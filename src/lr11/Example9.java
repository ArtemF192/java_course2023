package lr11;

import java.util.ArrayList;
import java.util.List;

public class Example9 {
    public static List<String> filterStringsOnlyLetters(List<String> strings) {
        List<String> filteredStrings = new ArrayList<>();

        for (String str : strings) {
            if (containsOnlyLetters(str)) {
                filteredStrings.add(str);
            }
        }

        return filteredStrings;
    }
    private static boolean containsOnlyLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        List<String> originalList = new ArrayList<>();
        originalList.add("apple");
        originalList.add("123banana");
        originalList.add("orange!?");
        originalList.add("grape123");

        List<String> filteredList = filterStringsOnlyLetters(originalList);

        System.out.println("Original List: " + originalList);
        System.out.println("Filtered List (строки, которые содержат только буквы): " + filteredList);
    }
}

//9.	Напишите функцию, которая принимает на вход список строк и возвращает новый список,
//содержащий только те строки, которые содержат только буквы (без цифр и символов).
