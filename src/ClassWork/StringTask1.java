package ClassWork;

import java.util.Locale;

public class StringTask1 {     // JAVA314 Giniyatullin   Самостоятельная работа
    public static void main(String[] args) {    //TODO В строке оставить только один экземпляр каждого встречающегося символа.
        String str = "А роза упала на лапу Азора";                                        // результат вернуть
        str = str.replaceAll("[^а-яА-Я]+", "").toLowerCase();
        System.out.println("Строка после первого преобразования : " + str);
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (!res.contains(String.valueOf(str.charAt(i)))) {
                res += String.valueOf(str.charAt(i));
            }
                    }
        System.out.printf("Строка после ВСЕХ преобразований : %s%n", res);
    }
}