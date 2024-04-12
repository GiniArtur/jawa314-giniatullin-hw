package Registration_New_User.main.java.in;

import Registration_New_User.main.java.in.Request;
import Registration_New_User.main.java.out.api.API;

import java.util.Scanner;

/**
 * Класс, который реализует функционал интернет-сайта с личным кабинетом.
 * Цепочка выззова методов копирует навигацию по импровизированному сайту
 * В поле класса кладем сущность API, которая будет отвечать на наши запросы
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
                case 2 -> signRegAuth();
                case 0 -> {}
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
        Request request = new Request("/login", false);
        System.out.println("Вы находитесь на странице авторизации...");
        System.out.print("Введите логин: ");
        request.getBody()[0][0] = "username";
        request.getBody()[0][1] = scanner.nextLine();
        System.out.print("Введите пароль: ");
        request.getBody()[1][0] = "password";
        request.getBody()[1][1] = scanner.nextLine();

        if (api.response(request).isAuth()) {
            System.out.println("на страницу персонального аккаунта");
        } else {
            signInUp();
        }

    }
    /**
     * Отрисовка страницы регистрации
     */
    private void signRegAuth() {
        System.out.println(NEW_PAGE);
        Request request = new Request("/register", false);
        System.out.println("Вы находитесь на странице регистрации...");
        System.out.print("Введите логин: ");
        request.getBody()[0][0] = "username";
        request.getBody()[0][1] = scanner.nextLine();
        System.out.print("Введите пароль: ");
        request.getBody()[1][0] = "password";
        request.getBody()[1][1] = scanner.nextLine();

        if (api.response(request).isAuth()) {
            System.out.println("Регистрация прошла успешно.\nДобро пожаловать на страницу персонального аккаунта");
            System.out.println("User " + api.getCurrentUser().getUsername());
            homePage();
        } else {
            signInUp();
        }

    }
    private void homePage() {
        System.out.println(NEW_PAGE);
        System.out.print("Внести показания / удалить аккаунт/ выход? (1 / 2/ 0) : ");
        try {
            int action = Integer.parseInt(scanner.nextLine());
            switch (action) {
                case 1 -> {}
                case 2 -> {
                    Request request = new Request("/remove", true);
                    request.getBody()[0][0] = "username";
                    request.getBody()[0][1] = api.getCurrentUser().getUsername();
                    request.getBody()[1][0] = "password";
                    request.getBody()[1][1] = api.getCurrentUser().getPassword();
                    if (api.response(request).isAuth()) {
                        System.out.println("Удаление аккаунта успешно.");
                        System.out.println(NEW_PAGE);
                        signInUp();
                    } else {
                        homePage();
                    }
                }
                case 0 -> {
                    System.out.println(NEW_PAGE);
                    signInUp();}
                default -> homePage();
            }
        } catch (Exception e) {
            System.out.println("некорректный ввод!!!");
            homePage();
        }
    }
}
