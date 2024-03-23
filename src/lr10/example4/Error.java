package lr10.example4;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;

public class Error {
    private static final int MAX_RETRY = 3; // Максимальное количество попыток подключения

    public static void main(String[] args) {
        int retryCount = 0;

        while (retryCount < MAX_RETRY) {
            try {
                Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();

                Elements newsParent = doc
                        .select("body > table > tbody > tr > td > div > table > " +
                                "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                                "tr > td:nth-child(1)");

                for (int i = 3; i < 20; i++) {
                    if (!(i % 2 == 0)) {
                        List<Node> nodes = newsParent.get(0).childNodes();
                        System.out.println("Тема : " +
                                ((Element) nodes.get(i))
                                        .getElementsByClass("blocktitle")
                                        .get(0).childNodes().get(0));

                        System.out.println("Дата : " +
                                ((Element) nodes.get(i))
                                        .getElementsByClass("blockdate")
                                        .get(0).childNodes().get(0) +
                                "\n");
                    }
                }

                // Если данные были успешно получены, выходим из цикла
                break;
            } catch (IOException e) {
                retryCount++;
                System.err.println("Ошибка при подключении к сайту. Попытка переподключения: " + retryCount);
                // Если достигнуто максимальное количество попыток, выводим сообщение об ошибке и выходим из цикла
                if (retryCount == MAX_RETRY) {
                    System.err.println("Не удалось подключиться к сайту после " + MAX_RETRY + " попыток.");
                }
            }
        }
    }
}

