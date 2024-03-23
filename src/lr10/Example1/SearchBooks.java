package lr10.Example1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.Scanner;

public class SearchBooks {
    public static void main(String[] args) {
        String filename = "src/lr10/Example1/example.xml";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите критерий поиска:");
        System.out.println("1. По автору");
        System.out.println("2. По году издания");
        int choice = scanner.nextInt();
        scanner.nextLine(); // очистка буфера

        switch (choice) {
            case 1:
                System.out.println("Введите автора:");
                String author = scanner.nextLine();
                searchBooksByAuthor(filename, author);
                break;
            case 2:
                System.out.println("Введите год издания:");
                int year = scanner.nextInt();
                searchBooksByYear(filename, year);
                break;
            default:
                System.out.println("Некорректный выбор.");
        }
    }

    private static void searchBooksByAuthor(String filename, String author) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(filename);
            Element root = doc.getDocumentElement();
            NodeList bookList = root.getElementsByTagName("book");

            System.out.println("Список книг автора '" + author + "':");

            for (int i = 0; i < bookList.getLength(); i++) {
                Element book = (Element) bookList.item(i);
                Element authorElement = (Element) book.getElementsByTagName("author").item(0);
                String authorName = authorElement.getTextContent();

                if (authorName.equalsIgnoreCase(author)) {
                    Element titleElement = (Element) book.getElementsByTagName("title").item(0);
                    String title = titleElement.getTextContent();
                    System.out.println("- " + title);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void searchBooksByYear(String filename, int year) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(filename);
            Element root = doc.getDocumentElement();
            NodeList bookList = root.getElementsByTagName("book");

            System.out.println("Список книг, изданных в " + year + " году:");

            for (int i = 0; i < bookList.getLength(); i++) {
                Element book = (Element) bookList.item(i);
                Element yearElement = (Element) book.getElementsByTagName("year").item(0);
                int bookYear = Integer.parseInt(yearElement.getTextContent());

                if (bookYear == year) {
                    Element titleElement = (Element) book.getElementsByTagName("title").item(0);
                    String title = titleElement.getTextContent();
                    System.out.println("- " + title);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

//3.	Добавьте возможность поиска книг по автору или году издания.
//        Например, пользователь может ввести автора или год издания,
//а программа выведет список книг, удовлетворяющих этому критерию поиска.
