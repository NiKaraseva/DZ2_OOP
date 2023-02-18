public class Book {
    String name;
    String author;


    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public String getName(){
        return name;
    }

    public void setName(String nameSet) {
        this.name = nameSet;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String authorSet) {
        this.author = authorSet;
    }

}


