package managers;

import models.Book;
import java.util.Iterator;
import java.util.LinkedList;

public class BookManager {
    private LinkedList<Book> books;

    public BookManager() {
        books = new LinkedList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void removeBook(String bookID) {
        Iterator<Book> it = books.iterator();
        while (it.hasNext()) {
            Book b = it.next();
            if (b.getBookID().equals(bookID)) {
                it.remove();
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public Book searchBook(String bookID) {
        for (Book book : books) {
            if (book.getBookID().equals(bookID)) {
                return book;
            }
        }
        System.out.println("Book not found.");
        return null;
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public LinkedList<Book> getBooks() {
        return books;
    }
}
