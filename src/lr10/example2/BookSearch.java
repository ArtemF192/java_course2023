package lr10.example2;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Scanner;

public class BookSearch {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {
            // Чтение JSON-файла
            Object obj = parser.parse(new FileReader("src/lr10/example2/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj; // Преобразование в JSONObject

            JSONArray booksArray = (JSONArray) jsonObject.get("books"); // Извлечение массива книг

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите автора книги:");
            String author = scanner.nextLine();

            // Поиск книг по автору
            searchBooksByAuthor(booksArray, author);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void searchBooksByAuthor(JSONArray booksArray, String author) {
        booksArray.stream()
                .map(obj -> (JSONObject) obj)
                .filter(book -> {
                    Object authorObject = ((JSONObject) book).get("author");
                    return authorObject instanceof String && ((String) authorObject).equalsIgnoreCase(author);
                })
                .forEach(book -> System.out.println("Найдена книга: " + ((JSONObject) book).get("title") + " (" + ((JSONObject) book).get("year") + ")"));

        long count = booksArray.stream()
                .map(obj -> (JSONObject) obj)
                .filter(book -> {
                    Object authorObject = ((JSONObject) book).get("author");
                    return authorObject instanceof String && ((String) authorObject).equalsIgnoreCase(author);
                })
                .count();

        if (count == 0) {
            System.out.println("Книги данного автора не найдены.");
        }
    }
}


