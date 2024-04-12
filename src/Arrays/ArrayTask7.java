package Arrays;

import java.util.Scanner;

public class ArrayTask7 {                              // TODO Java314_Гиниятуллин_Массивы_задача7
    public static void main(String[] args) {
        String[] myArray = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
                "Sunday"};
        int[] lengths;
        lengths = new int[7];
        int temp = myArray[0].length();
        int j = 0;
        for (int i = 0; i < myArray.length; i++) {
            lengths[i] = myArray[i].length();
            if (lengths[i] > temp) {
                temp = lengths[i];
                j = i;
            }
        }
        System.out.println("Самая длинная строка массива: "+myArray[j]);
    }
}


