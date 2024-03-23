package lr10.Example1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class RemoveBookFromLibrary {
    public static void main(String[] args) {
        String filename = "src/lr10/Example1/example.xml";

        // Запрос пользователю ввода названия книги для удаления
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название книги для удаления:");
        String bookToRemove = scanner.nextLine();

        try {
            // Загружаем XML-файл
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(filename);

            // Получаем корневой элемент
            Element root = doc.getDocumentElement();

            // Получаем список всех книг
            NodeList bookList = root.getElementsByTagName("book");

            // Просматриваем список книг и удаляем ту, которую пользователь хочет удалить
            for (int i = 0; i < bookList.getLength(); i++) {
                Element book = (Element) bookList.item(i);
                Element titleElement = (Element) book.getElementsByTagName("title").item(0);
                String title = titleElement.getTextContent();

                if (title.equalsIgnoreCase(bookToRemove)) {
                    root.removeChild(book); // Удаление элемента <book> из корневого элемента
                    System.out.println("Книга '" + bookToRemove + "' успешно удалена из библиотеки.");
                }
            }

            // Записываем изменения в файл
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT, "yes"); // Отступы для красивого форматирования
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filename));
            transformer.transform(source, result);

        } catch (ParserConfigurationException | org.xml.sax.SAXException | TransformerException | java.io.IOException e) {
            e.printStackTrace();
        }
    }
}

//Реализуйте функцию удаления книги из XML-файла. Например, пользователь может ввести название книги,
//которую хочет удалить, и программа удалит соответствующий элемент <book> из XML-файла.
