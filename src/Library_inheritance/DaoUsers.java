package Library_inheritance;


import java.util.ArrayList;
import java.util.List;

public class DaoUsers implements DaoBookImpl {
    private final String userName;// имя пользователя
    private final List<Books> bookList;// список для хранения всех книг
    public DaoUsers(String userName) {
        this.userName = userName;
        bookList = new ArrayList<>();// инициализируем список книг у пользователя
    }

    /**
     * Возвращает имя пользователя в библиотеке
     * @return имя пользователя
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Добавляет книгу, полученную в библиотеке в список пользователя
     * @param book книга, полученная в библиотеке
     */
    @Override
    public void ReceiveItem(Books book) {
        bookList.add(book);// добавляем книгу в список
    }

    /**
     * Возвращает перечень всех книг в библиотеке
     */
    @Override
    public List<Books> getAllItem() {
        return bookList;
    }

    @Override
    public Books getItem(String name) {
        // выполняем поиск по названию книги
        Books book = null;
        for (Books item : bookList) {
            if (item.getBookName().equalsIgnoreCase(name)) {
                book = item;
                break;
            }
        }
        return book;
    }

    /**
     * Удаляет книгу из библиотеки
     *
     * @param book книга, которую нужно удалить
     */
    @Override
    public void RemoveItem(Books book) {
        bookList.remove(book);
    }

    /**
     * Возвращает количество элементов
     *
     * @return количество элементов
     */
    @Override
    public int getCount() {
        return bookList.size();
    }
}
