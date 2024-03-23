package lr10.example2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
public class RemoveBookFromLibrary {
    public static void main(String[] args) {
        // Путь к JSON файлу
        String filePath = "src/lr10/example2/example-json.json";

        // Название книги для удаления
        String titleToRemove = "Новая книга";

        try {
            // Чтение JSON файла
            JSONParser parser = new JSONParser();
            FileReader reader = new FileReader(filePath);
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            // Удаление книги по названию
            Iterator iterator = jsonArray.iterator();
            while (iterator.hasNext()) {
                JSONObject book = (JSONObject) iterator.next();
                if (titleToRemove.equals(book.get("title"))) {
                    iterator.remove();
                }
            }

            // Запись изменений обратно в JSON файл
            FileWriter writer = new FileWriter(filePath);
            jsonObject.writeJSONString(writer);

            // Закрытие потоков
            reader.close();
            writer.close();

            System.out.println("Книга '" + titleToRemove + "' успешно удалена из JSON файла.");

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
