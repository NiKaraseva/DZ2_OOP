import java.util.ArrayList;
import java.util.List;

public class Bookshelf {

    private List<Book> books = new ArrayList<>();
    private int maxCapacity;

    /**
     * 2 конструктора
     */

    public Bookshelf(int maxCapacity, List<Book> books) {
        this.maxCapacity = maxCapacity;
        this.books = books;
    }

    public Bookshelf(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * Метод по количеству книг на полке
     */
    public int getSize(){
        return books.size();
    }

    /**
     * Метод по добавлению книг
     */
    public void addBooks(Book book){
        if (books.size() <= maxCapacity - 1) {
            books.add(book);

        }
        else {
            System.out.println("На полке не осталось свободного места");
        }
    }

    /**
     * Методы по удалению книг (по названию и автору)
     */
    public void removeBooksByName(String name) throws Exception {
        for (Book book: books) {
            if (book.getName().equals(name)){
                books.remove(book);
                System.out.println("Книга взята с полки");
            }
        }
        throw new Exception("Такая книга не найдена");
    }

    public void removeBooksByAuthor(String author) throws Exception {
        for (Book book: books) {
            if (book.getAuthor().equals(author)){
                books.remove(book);
                System.out.println("Книга взята с полки");
            }
        }
        throw new Exception("Такая книга не найдена");
    }

    /**
     * Методы поиска книг (по названию и автору)
     */
    public Book getBookByName(String name) throws Exception {
        for (Book book: books) {
            if (book.getName().equals(name)){
                return book;
            }
        }
        throw new Exception("Такая книга не найдена");
    }

    public Book getBookByAuthor(String author) throws Exception {
        for (Book book: books) {
            if (book.getName().equals(author)){
                return book;
            }
        }
        throw new Exception("Такая книга не найдена");
    }

    @Override
    public String toString() {
        return "Bookshelf{" +
                "books=" + books +
                ", maxCapacity=" + maxCapacity +
                '}';
    }
}
