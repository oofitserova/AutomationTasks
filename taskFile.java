import java.io.*;
import java.util.Random;

public class taskFile {
    public static void main(String[] args) {
        String[] texts = {"Привет", "Пока", "Уже виделись"};
        Random random = new Random();
        try {
            //запись байтов в файл
            FileOutputStream f = new FileOutputStream("D:\\test_No.txt", true);
            //OutputStreamWriter является мостом от символьных потоков до потоков байтов
            OutputStreamWriter writer = new OutputStreamWriter(f);
            //записывает текст в поток вывода символов, буферизуя записанные символы
            BufferedWriter out = new BufferedWriter(writer);

        for (int i = 0; i < 1000; i++) {
            int pos = random.nextInt(texts.length);
            if (i % 10 == 0) {
                //Записывает в поток все данные, которые хранятся в буфере
                out.flush();
            } else {
                out.write(texts[pos] + " ");
                out.flush();
            }
        }
    } catch (IOException ex) {
        System.err.println(ex);
    }

   }
}





