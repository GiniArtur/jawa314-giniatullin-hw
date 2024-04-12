package Library_inheritance;

public class Books {
    private int index;
    private final String bookName;
    private String username = null;
    private boolean state;        // Состояние книги
    private boolean issue;// статус книги - выдана ли она в библиотеке или нет


    /**
     * Возвращает флаг наличия книги в библиотеке
     *
     * @return true - если книга в библиотеке, иначе false
     */
    public boolean isIssue() {
        return issue;
    } // Выпущена книга или нет Issue- отдана

    /**
     * Устанавливает флаг наличия книги в библиотеке
     *
     * @param issue - true, если книга в библиотеке, иначе false
     */
    public void setIssue(boolean issue) {
        this.issue = issue;
    } //Устанавливает в родительском классе параметр как выдано


    public Books(String bookName, boolean state, boolean issue) {      // конструктор
        this.bookName = bookName;
        this.state = state;
        this.issue = issue;
    }

    public Books(int index, String bookName, String username, boolean state, boolean issue) { // переопределяем конструктор

        this.bookName = bookName;
        this.state = state;
        this.issue = issue;
        this.username = username;
        this.index = index;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isState() {
        return state;
    }       // Возвращает состояние книги

    public void setState(boolean state) {
        this.state = state;
    }  //Устанавливаем состояние книги

    public int getIndex() {
        return index;
    }                      //Возвращает индекс

    public String getBookName() {
        return bookName;
    }             //Возвращает название книги

    public void setIndex(int index) {
        this.index = index;
    }       //Устанавливает индекс киниги

    @Override
    public String toString() {
        return "Books{" +
                "index=" + index +
                ", bookName='" + bookName + '\'' +
                ", issue='" + issue + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
