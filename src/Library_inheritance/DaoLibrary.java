package Library_inheritance;
import java.util.ArrayList;
import java.util.List;

public class DaoLibrary implements DaoBookImpl {
    private final List<Books> bookList;// список для хранения всех книг в библиотеке

    public DaoLibrary() {
        bookList = new ArrayList<>();
    }

    /**
     * Добавляет книгу, возвращённую пользователем, обратно в список библиотеки,
     * если её состояние удовлетворительное
     * @param book экземпляр класса Book
     */
    @Override
    public void ReceiveItem(Books book) {
                                   // проверяем состояние книги
        if (book.isState()) {
                                   // если состояние удовлетворительное, ставим отметку о её возвращении в хранилище
            for (Books item : bookList) {
                // ищем книгу в библиотечном хранилище
                if (item.getBookName().equalsIgnoreCase(book.getBookName())) {
                    item.setUsername(null);// удаляем имя пользователя
                    item.setIssue(false);// ставим отметку о возвращении в хранилище (не выдана)
                    break;
                }
            }
        } else {
            bookList.remove(book);// удаляем книгу из библиотеки
        }
    }

    /**
     * @param book книга для добавления
     */
    @Override
    public void AddNewItem(Books book) {

        if (bookList.isEmpty()) {
            // если список ещё не содержит книг, то первая книга будет иметь индекс 0
            book.setIndex(0);
        } else {
            // иначе получаем индекс последней книги в массиве и увеличиваем его на 1
            int index = bookList.get(bookList.size() - 1).getIndex() + 1;
            book.setIndex(index);// задаём индекс книги
        }
        bookList.add(book);// добавляем в массив
    }

    /**
     * @param book книга, которую нужно удалить
     */
    @Override
    public void RemoveItem(Books book) {
        bookList.remove(book);
    }

    /**
     * @param name название книги
     * @return книга по указанному названию
     */
    private Books findItem(String name) {
        // выполняем поиск по названию книги
        Books book = null;
        for (Books item : bookList) {
            if (item.getBookName().equalsIgnoreCase(name)) {
                // если названия совпадают
                book = item;
                break;
            }
        }
        return book;
    }

    /**
     * @return bookList - список всех книг в библиотеке
     */
    @Override
    public List<Books> getAllItem() {
        return bookList;
    }

    /**
     * @param index порядковый номер элемента
     * @return элемент с указанным порядковым номером
     */
    @Override
    public Books getItem(int index) {
        return bookList.get(index);
    }

    @Override
    public Books getItem(String name) {
        Books books = findItem(name);// нашли книгу
        if (books != null && !books.isIssue()) {
            return books;
        } else {
            return null;
        }
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

    /**
     * Получает данные из базы данных
     * @param data массив данных
     */
    public void setData(Object[][] data) {
        if (data != null) {
            // если данные получены, добавляем их в библиотеку
            for (Object[] data1 : data) {
                Books books = new Books(Integer.parseInt((String) data1[0]), (String)data1[1], (String)data1[2],
                        (Integer.parseInt((String) data1[3]) == 1),
                        (Integer.parseInt((String) data1[4]) == 1));
                bookList.add(books);
            }
        }
    }
}
