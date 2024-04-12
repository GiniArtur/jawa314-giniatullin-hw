package Examples;

import java.util.Arrays;

public class Java314GiniyatullinLoop2 {   // ToDo Проверка на палиндром Java 314 Гиниятуллин
    public static void main(String[] args) {
            char[] myEnum1 = {'r', ' ', '0',  ' ',  'r'};
                int arrayLength = myEnum1.length;
                char[] myEnum2 = new char[arrayLength];
        System.out.println("Длина  первого массива = " + arrayLength);
        boolean IsTrue = false;
        int i;
        System.out.println("Второй массив = ");
        for (i = 0; i < arrayLength; i++){
        myEnum2 [arrayLength - 1 - i] = myEnum1 [i];
        }
        for (i = 0; i < arrayLength; i++){
            System.out.println(myEnum2[i] );
        }
        if(Arrays.equals(myEnum1, myEnum2))
            System.out.println("Statement  is true");
        else
            System.out.println("Statement is false");


           }
}
