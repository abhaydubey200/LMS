package utils;

import managers.BookManager;
import managers.StudentManager;
import models.Book;
import models.Student;
import java.io.*;
import java.util.LinkedList;

public class FileManager {
    private static final String BOOKS_FILE = "books.dat";
    private static final String STUDENTS_FILE = "students.dat";

    public static void saveBooks(BookManager bookManager) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(BOOKS_FILE))) {
            oos.writeObject(bookManager.getBooks());
        } catch (IOException e) {
            System.out.println("Error saving books: " + e.getMessage());
        }
    }

    public static BookManager loadBooks() {
        BookManager bookManager = new BookManager();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(BOOKS_FILE))) {
            LinkedList<Book> books = (LinkedList<Book>) ois.readObject();
            for (Book book : books) {
                bookManager.addBook(book);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading books: " + e.getMessage());
        }
        return bookManager;
    }

    public static void saveStudents(StudentManager studentManager) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(STUDENTS_FILE))) {
            oos.writeObject(studentManager.getStudents());
        } catch (IOException e) {
            System.out.println("Error saving students: " + e.getMessage());
        }
    }

    public static StudentManager loadStudents() {
        StudentManager studentManager = new StudentManager();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(STUDENTS_FILE))) {
            LinkedList<Student> students = (LinkedList<Student>) ois.readObject();
            for (Student student : students) {
                studentManager.addStudent(student);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading students: " + e.getMessage());
        }
        return studentManager;
    }
}
