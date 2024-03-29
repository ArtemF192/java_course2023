package lr8.task1.Example10;

import java.io.*;

public class Buf_RW_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("C:\\My\\MyFile1.txt"), "cp1251"));

            out = new PrintWriter("C:\\My\\MyFile2.txt", "cp1251");

            int lineCount = 0;
            String s;

            while ((s = br.readLine()) != null) {
                lineCount++;
                out.println(lineCount + ":" + s);
            }


        } catch (IOException e) {
            System.out.println("Ошибка!!!");
        }
        finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}

//Пример 10. Выполнить чтение из одного файла и запись в другой
//файл с использованием класса PrintWriter.
