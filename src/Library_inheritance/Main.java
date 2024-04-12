package Library_inheritance;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {                 //Giniyatullin_
        /*
        Пользователь приходит в библиотеку. Называет книгу, которую хочет получить.
        Библиотека ищет нужную книгу. Если она найдена, книга изымается из хранилища.
        Ставится отметка об изъятии, записывается имя пользователя, которому она выдана.
        Пользователь, после прочтения, возвращает книгу в библиотеку. Он устанавливает
        её состояние, как интенсивно он её читал, в каком виде её вернул. Если всё нормально,
        библиотека принимает книгу обратно, ставя отметку в возврате книгу в хранилище и удаляя
        имя пользователя. Если состояние книги не позволяет дальше её хранить, она списывается и
        удаляется из хранилища
         */

        DaoLibrary library = new DaoLibrary();// создаём библиотеку

        // читаем данные из базы данных и заполняем библиотеку
        library.setData(getData());
        library.getAllItem().forEach((item) -> System.out.println(item.toString()));// выводим информацию

        // добавляем новые книги в библиотеку
        System.out.println("получаем новые книги");
        library.AddNewItem(new Books("Java", true, false));
        library.AddNewItem(new Books("Python", true, false));
        library.AddNewItem(new Books("C#", true, false));
        library.AddNewItem(new Books("C++", true, false));
        library.AddNewItem(new Books("Visual Basic", true, false));
        library.getAllItem().forEach((item) -> System.out.println(item.toString()));// выводим информацию

        // создаём пользователя библиотеки
        System.out.println("выдаём книги пользователю");
        DaoUsers user = new DaoUsers("Sergey");
        Books books;
        books = library.getItem("Java");// получаем из библиотеки нужную книгу
        if (books != null) {
            // нужная книга есть в библиотеке
            books.setIssue(true);// устанавливаем флаг того, что данная книга выдана
            books.setUsername(user.getUserName());// отмечаем имя пользователя, взявшего книгу
            user.ReceiveItem(books);// и передана пользователю
        }
        books = library.getItem("C#");// получаем из библиотеки нужную книгу
        if (books != null) {
            // нужная книга есть в библиотеке
            books.setIssue(true);// устанавливаем флаг того, что данная книга выдана
            books.setUsername(user.getUserName());
            user.ReceiveItem(books);// и передана пользователю
        }
        books = library.getItem("Pascal");// получаем из библиотеки нужную книгу
        if (books != null) {
            // нужная книга есть в библиотеке
            books.setIssue(true);// устанавливаем флаг того, что данная книга выдана
            books.setUsername(user.getUserName());
            user.ReceiveItem(books);// и передана пользователю
        }
        System.out.println("Выводим информацию о наличии книг в библиотеке и у пользователя");
        library.getAllItem().forEach((item) -> System.out.println(item.toString()));// выводим информацию
        user.getAllItem().forEach((item) -> System.out.println(item.toString()));

        // пользователь прочитал одну из книг и возвращает её в библиотеку
        System.out.println("Пользователь возвращает прочитанные книги");
        books = user.getItem("Java");
        books.setState(true);
        library.ReceiveItem(books);
        user.RemoveItem(books);// удаляем книгу из списка пользователя
        books = user.getItem("C#");
        books.setState(false);// задаём состояние непригодности книги
        library.ReceiveItem(books);// получаем книгу у пользователя и возвращаем её в хранилище
        user.RemoveItem(books);// удаляем книгу из списка пользователя

        // выведем информацию
        System.out.println("Выводим информацию о наличии книг в библиотеке и у пользователя");
        user.getAllItem().forEach((item) -> System.out.println(item.toString()));
        library.getAllItem().forEach((item) -> System.out.println(item.toString()));// выводим информацию из библиотеки


    }

    /**
     * Получает данные из базы данных (в качестве базы данных выбран обычный файл CSV)
     * CSV файл Library.csv лежит в текущей директории. Если файла ещё нет, он создаётся.
     * Файл имеет формат: 1 - индекс (номер п/п), 2 - название книги, 3 - имя пользователя,
     * 4 - состояние, 5 - выдана она или нет (есть ли в наличии)
     */
    private static Object[][] getData() {
        CSVOperate operate = new CSVOperate(fileName, ";");// объект для чтения данных
        operate.setHeader(false);// укажем, что заголовков нет
        operate.readData();// читаем данные
        Object[][] data = operate.getData();
        for (Object[] data1: data) {
            System.out.println(Arrays.toString(data1));
        }
        return data;
    }

    private static final String fileName = "Library.csv";

}