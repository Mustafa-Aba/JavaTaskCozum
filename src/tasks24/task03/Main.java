package tasks24.task03;

public class Main {

    /* TODO
        Book class'ı verilmiştir.
        İki tane attributes oluşturunuz.
        bookName ve authorName (String ile)
        Book class'ını kapsülleyin. (Encapsulate)
        Main class'ın içine object  oluşturun ve sonucu yazdırınız.

    todo  "Book name is BOOKNAME and Author is AUTHORNAME"
     */
    public static void main(String[] args) {

        Book book = new Book("Yevgeni Onegin","Alexander Puskin");

        System.out.println(book);

    }


}

class Book {
    private String bookName;
    private String authorName;

    public Book() {
    }

    public Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    @Override
    public String toString() {
        return "Book: {" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
