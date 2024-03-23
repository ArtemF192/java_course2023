package lr10.Example1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

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

public class AddBookToLibrary {
    public static void main(String[] args) {
        String filename = "src/lr10/Example1/example.xml";

        // Запрос пользователю ввода данных о новой книге
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название книги:");
        String newTitle = scanner.nextLine();
        System.out.println("Введите имя автора:");
        String newAuthor = scanner.nextLine();
        System.out.println("Введите год:");
        int newYear = scanner.nextInt();

        try {
            // Загружаем XML-файл
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(filename);

            // Получаем корневой элемент
            Element root = doc.getDocumentElement();

            // Создаем новый элемент <book>
            Element newBook = doc.createElement("book");

            // Создаем дочерние элементы для новой книги
            Element titleElement = doc.createElement("title");
            titleElement.appendChild(doc.createTextNode(newTitle));
            newBook.appendChild(titleElement);

            Element authorElement = doc.createElement("author");
            authorElement.appendChild(doc.createTextNode(newAuthor));
            newBook.appendChild(authorElement);

            Element yearElement = doc.createElement("year");
            yearElement.appendChild(doc.createTextNode(Integer.toString(newYear)));
            newBook.appendChild(yearElement);

            // Добавляем новую книгу в корневой элемент
            root.appendChild(newBook);

            // Записываем изменения в файл
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT, "yes"); // Отступы для красивого форматирования
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filename));
            transformer.transform(source, result);

            System.out.println("Новая книга успешно добавлена в файл " + filename);
        } catch (ParserConfigurationException | org.xml.sax.SAXException | TransformerException | java.io.IOException e) {
            e.printStackTrace();
        }
    }
}

//2.	Добавьте возможность записывать новые книги в XML-файл.
//        Например, пользователь может ввести данные о новой книге,
//а программа добавит новый элемент <book> в XML-файл.




