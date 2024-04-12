package StringsMethods;

import java.io.*;
import java.sql.Array;
import java.util.Arrays;

public class StringTask1 {
    public static void main(String[] args) throws IOException {
        int leng1;
        boolean IsIncludes = false;
        int[] indexArray;
        str();
    }

    public static void str() throws IOException {

        String[] myStr;
        String[] ch;
        System.out.println("Введите строку:");
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        myStr = new String[]{bufferedReader.readLine()};
        System.out.println("Вы ввели следующую строку: " + Arrays.toString(myStr));
        System.out.println("Введите любой символ: ");
        ch = new String[]{bufferedReader.readLine()};
        System.out.println("Вы ввели следующий символ: " + Arrays.toString(ch));


    }
}


