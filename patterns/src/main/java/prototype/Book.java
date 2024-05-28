package prototype;

import java.util.Objects;

public abstract class Book {
    public String bookName;
    public String bookAuthor;

    public Book(Book book) {
        if (book != null){
            this.bookName = book.bookName;
            this.bookAuthor = book.bookAuthor;
        }
    }
    public abstract Book clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) && Objects.equals(bookAuthor, book.bookAuthor);
    }
}
