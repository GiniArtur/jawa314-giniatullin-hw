package Library_inheritance;

import java.util.List;

public interface DaoBookImpl {                                /**  //data access object (DAO) - абстрактный интерфейс к
                                                                                                какому-либо типу базы данных или механизму хранения.
     * Получение книги библиотекой или пользователем
     * @param book экземпляр класса Book
     */
    default void ReceiveItem(Books book){}                     //Получить, принять  элемент    абстрактнй метод

    /**
     * Добавляет новую книгу в бибилиотеку
     * @param book книга для добавления
     */
    default void AddNewItem(Books book){}                      //

    /**
     * Удаляет книгу из библиотеки
     * @param book книга, которую нужно удалить
     */
    default void RemoveItem(Books book){}

    /**
     * Возвращает перечень всех книг в библиотеке
     */
    default List<Books> getAllItem() {
        return null;
    }

    /**
     * Возвращает элемент по его порядковому номеру в коллекции
     * @param index порядковый номер элемента
     * @return элемент с указанным порядковым номером
     */
    default Books getItem(int index) {
        return null;
    }

    default Books getItem(String name){
        return null;
    }

    /**
     * Возвращает количество элементов
     * @return количество элементов
     */
    default int getCount() {
        return 0;
    }                 //count - подсчет
}
