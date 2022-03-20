//https://stackoverflow.com/questions/2629649/java-what-are-ioexceptions-in-bufferedreaders-readline-for - зачем throws IOException
//https://javarush.ru/groups/posts/1109-perestala-rabotatjh-konstrukcija-readerreadline - зачем throws IOException

import java.io.*;

public class task02 {
    public static void main (String[] arg) throws IOException {
        String firstString;
        String secondString;

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.print("Введите первую строку: ");
        firstString= bufferedReader.readLine(); //читаем строку с клавиатуры
        System.out.print("Введите вторую строку: ");
        secondString = bufferedReader.readLine(); //читаем строку с клавиатуры
        System.out.println(firstString);
        System.out.println(secondString);
        System.out.println(firstString+secondString);
    }
}
