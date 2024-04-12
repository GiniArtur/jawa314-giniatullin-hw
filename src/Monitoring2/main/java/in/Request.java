package Monitoring2.main.java.in;

import java.util.Arrays;

/**
 * Класс, в котором мы реализуем запрос на сервер
 * маппинг - адрес "ручки" на сервере, которая активирует конкретный нужный нам функуионал
 * isAuth - флаг аутентификации
 * тело- массив, в котором в каждой строке по 2 значения-
 * ключ и его значение- параметр запроса и значение, которое мы хотим передать для обработки на сервер
 * */
public class Request {
    private final String mapping;
    private final boolean isAuth;
    private final String[][] body = new String[5][2];        // *тело запроса *   здесь body[0][0]="username", - body[0][1] - *имя*
                                                             //                   здесь body[1][0]="password", - body[1][1] - *пароль*
    public Request(String mapping, boolean isAuth) {      // передается строковое представление */login */register */ что то еще
        this.mapping = mapping;
        this.isAuth = isAuth;
    }

    public String getMapping() {
        return mapping;
    }

    public boolean isAuth() {
        return isAuth;
    }

    public String[][] getBody() {
        return body;
    }

    /**
     * метод поиска значения по ключу в теле запроса
     * */
    public String getValueByKey(String key) {
        for (int i = 0; i < body.length; i++) {
            if (body[i][0].equals(key)) {
                return body[i][1];
            }
        }
        return "";
    }

    @Override
    public String toString() {
        return "Request{" +
                "mapping='" + mapping + '\'' +
                ", isAuth=" + isAuth +
                ", body=" + Arrays.toString(body) +
                '}';
    }
}
