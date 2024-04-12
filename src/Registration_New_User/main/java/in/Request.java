package Registration_New_User.main.java.in;

import java.util.Arrays;


/**
 * Класс, в котором мы реализуем запрос на сервер
 * маппинг - адрес "ручки" на сервере, которая активирует конкретный нужный нам функуионал
 * isAuth - флаг аутентификации
 * тело- массив, в котором в каждой строке по 2 значения-
 * ключ и его значение- параметр запроса и значение, которое мы хотим передать для обработки на сервер
 * */
public class Request {                    //Запрос
    private final String mapping;     //mapping - технология, помогающая связывать таблицы в базе данных с объектами в Java-приложениях
    private final boolean isAuth;
    private final String[][] body = new String[5][2];

    public Request(String mapping, boolean isAuth) {
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
