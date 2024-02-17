package lr8.task1.Example7;

import java.io.*;

public class Buf_RW_3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        BufferedWriter out = null;
        try {
            br = new BufferedReader(new FileReader("C:\\MyFile1.txt"), 1024);
            out = new BufferedWriter(new FileWriter("C:\\MyFile2.txt"));

            int lineCount = 0;
            String s;

            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ":" + s);
                out.write(s);
                out.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!");
        }
        finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}

// Пример 7. Чтение из одного файла и запись в другой файл данных построчно с использованием буфера
