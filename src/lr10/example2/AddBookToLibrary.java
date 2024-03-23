package lr10.example2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AddBookToLibrary {
    public static void main(String[] args) {
        String filePath = "src/lr10/example2/example-json.json";

        try {
            // Чтение JSON файла
            JSONParser parser = new JSONParser();
            FileReader reader = new FileReader(filePath);
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            reader.close();

            // Получение массива книг
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            // Создание новой книги
            JSONObject newBook = new JSONObject();
            newBook.put("title", "Новая книга");
            newBook.put("author", "Новый автор");
            newBook.put("year", 2024);

            // Добавление новой книги в массив
            jsonArray.add(newBook);

            // Запись обновленного JSON файла
            FileWriter writer = new FileWriter(filePath);
            writer.write(jsonObject.toJSONString());
            writer.close();

            System.out.println("Новая книга успешно добавлена в JSON файл.");

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}


