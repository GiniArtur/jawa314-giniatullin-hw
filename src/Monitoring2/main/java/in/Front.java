package Monitoring2.main.java.in;
import Monitoring2.main.java.out.api.API;
import Monitoring2.main.java.out.api.Response;

import java.util.Scanner;

/**
 * Класс, который реализует функционал интернет-сайта с личным кабинетом.
 * Цепочка выззова методов копирует навигацию по импровизированному сайту
 * В поле класса кладем сущность API, которая будет отвечать на наши запросы   * Api - со стороны пользователя!!!!!*
 * Храним, в качестве "cookie" флаг аутентификации
 * */

public class Front {
    private API api = new API();
    private boolean isAuth = false;
    private final Scanner scanner = new Scanner(System.in);
    private final String NEW_PAGE = "\n*****************************************************************\n" +
            "*****************************************************************\n" +
            "*****************************************************************\n";

    /**
     * отрисовка домашней страницы
     * */
    public void start() {
        System.out.println(NEW_PAGE);
        System.out.println("Вы на домашней странице сервиса подачи счетчиков ЖКХ");
        signInUp();
    }

    /**
     * отрисовка домашней страницы с разветвлением на выход / регистрацию / аутентификацию
     * */
    private void signInUp() {
        System.out.print("Войти / зарегистрироваться / выход? (1 / 2 / 0) : ");
        try {
            int action = Integer.parseInt(scanner.nextLine());
            switch (action) {
                case 1 -> signIn();
                case 2 -> signUp();
                case 0 -> logout();
                default -> signInUp();
            }
        } catch (Exception e) {
            System.out.println("некорректный ввод!!!");
            signInUp();
        }
    }

    /**
     * отрисовка страницы аутентификации
     * */
    private void signIn() {
        System.out.println(NEW_PAGE);
        Request request = new Request("/login", isAuth);
        System.out.println("Вы находитесь на странице авторизации...");
        completeAuthRegRequest(request);                               //
        if (api.response(request).isAuth()) {
            isAuth = true;
            personalAccount();
        } else {
            signInUp();
        }
    }

    /**
     * отрисовка страницы аутентификации
     * */
    private void signUp() {
        System.out.println(NEW_PAGE);
        Request request = new Request("/register", isAuth);
        System.out.println("Вы находитесь на странице регистрации...");
        completeAuthRegRequest(request);
        String[][] body = api.response(request).getBody();
        if(body[0][0].equals("error")) {
            if (body[0][1].equals("уже залогинен")) {
                System.out.println("отрисуем аккаунт");
            } else {
                System.out.println("Пользователь с таким логином уже зарегистрирован!");
                signInUp();
            }
        } else {
            signIn();
        }
    }

    private void completeAuthRegRequest(Request request) {         //Вносим имя и пароль
        System.out.print("Введите логин: ");
        request.getBody()[0][0] = "username";
        request.getBody()[0][1] = scanner.nextLine();
        System.out.print("Введите пароль: ");
        request.getBody()[1][0] = "password";
        request.getBody()[1][1] = scanner.nextLine();
    }

    private void personalAccount() {
        System.out.println(NEW_PAGE);
        System.out.print("""
                Вы находитесь в личном кабинете
                Что Вы хотите сделать?
                - Просмотр актуальных показаний счетчиков - 1
                - Подать свежие показания - 2
                - Получить показания за конкретный месяц - 3
                - Получить историю подачи показаний - 4
                - Для выхода - 0
                Ваш вариант: \s""");
        try {
            int action = Integer.parseInt(scanner.nextLine());
            switch (action) {
                case 0 -> logout();
                case 1 -> actual();
                case 2 -> add();
                case 3 -> System.out.println("Получить показания за конкретный месяц");       // Доделать метод!!!!
                case 4 -> System.out.println("Получить историю подачи показаний");            // Доделать метод!!!!
                default -> personalAccount();
            }
        } catch (Exception e) {
            System.out.println(NEW_PAGE);
            System.out.println(">>>некорректный ввод<<<");
            personalAccount();                                    //После ввода значений выкидывает в *основное меню*
        }
    }

    private void logout() {
        isAuth = false;
    }

    private void actual() {
        System.out.println(NEW_PAGE);
        Request request = new Request("/actual",  isAuth);
        Response response = api.response(request);
        System.out.println("Последние поданные показания: ");
        System.out.println("актуальное показание-" + response.getBody()[0][0]);
        System.out.println(response.getBody()[0][1]);
        personalAccount();                                         //После ввода значений выкидывает в *основное меню*
    }

    private void add() {
        Request request = new Request("/add", true);
        System.out.println(NEW_PAGE);
        try {
            System.out.print("Введите тип счетчика: 1 - гв, любое другое число - хв: ");
            request.getBody()[0][0] = "type";
            request.getBody()[0][1] = Integer.parseInt(scanner.nextLine()) == 1 ? "true" : "false";  //Записываем логическое значение
            System.out.print("Введите показания: ");
            request.getBody()[1][0] = "measuring";
            request.getBody()[1][1] = String.valueOf(Integer.parseInt(scanner.nextLine()));
            Response response = api.response(request);
            System.out.println(response);
            if (response.getBody()[0][1].equals("true")) {
                System.out.println("Ваши показания приняты");
            } else {
                System.out.println("Вы ввели неверные данные или уже подавали показания в этом месяце!");
                personalAccount();
            }
        } catch (Exception e) {
            System.out.println("Вы ввели неверные данные");
            add();                                                          // Если не то ввели запускаем метод add()
        }

    }
}
