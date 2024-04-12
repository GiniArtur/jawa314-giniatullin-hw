package Recyrs;

public class RecursTask7 {                             //Java314 Гиниятуллин_АФ
    public static boolean recurs(String s) {           // Todo Дано предложение, состоящее только из строчных латинских букв.
        char firstChar;                                 //TODO Проверьте, являются ли слова в предложении палиндромом. Выведите YES или NO.
        char lastChar;
        int size = s.length();
        String subString;

        if (size <= 1) {                                // Если строка из одного символа или пустая строка
            return true;
        } else {
            firstChar = s.toCharArray()[0];             //  Сравниваем первый и последний символ строки,
            lastChar = s.toCharArray()[size - 1];
            subString = s.substring(1, size - 1);       // Убираем первый и последний символ
            return firstChar == lastChar && recurs(subString);    // Должны совпасть перый и последний символы
        }
    }

    public static void main(String[] args) {
        // вызов рекурсивной функции
        if (recurs("radar")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

