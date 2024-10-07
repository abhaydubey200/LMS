import managers.BookManager;
import managers.StudentManager;
import models.Book;
import models.Student;
import utils.FileManager;

import java.util.Scanner;

public class LibraryManagementSystem {
    private static BookManager bookManager = FileManager.loadBooks();
    private static StudentManager studentManager = FileManager.loadStudents();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display All Books");
            System.out.println("4. Add Student");
            System.out.println("5. Remove Student");
            System.out.println("6. Display All Students");
            System.out.println("7. Issue Book");
            System.out.println("8. Return Book");
            System.out.println("9. Save & Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    removeBook();
                    break;
                case 3:
                    bookManager.displayBooks();
                    break;
                case 4:
                    addStudent();
                    break;
                case 5:
                    removeStudent();
                    break;
                case 6:
                    studentManager.displayStudents();
                    break;
                case 7:
                    issueBook();
                    break;
                case 8:
                    returnBook();
                    break;
                case 9:
                    saveAndExit();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void addBook() {
        System.out.print("Enter Book ID: ");
        String bookID = scanner.nextLine();
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        bookManager.addBook(new Book(bookID, title, author));
    }

    private static void removeBook() {
        System.out.print("Enter Book ID to remove: ");
        String bookID = scanner.nextLine();
        bookManager.removeBook(bookID);
    }

    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        String studentID = scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        studentManager.addStudent(new Student(studentID, name));
    }

    private static void removeStudent() {
        System.out.print("Enter Student ID to remove: ");
        String studentID = scanner.nextLine();
        studentManager.removeStudent(studentID);
    }

    private static void issueBook() {
        System.out.print("Enter Student ID: ");
        String studentID = scanner.nextLine();
        Student student = studentManager.searchStudent(studentID);
        if (student == null || student.hasIssuedBook()) {
            System.out.println("Student not found or already issued a book.");
            return;
        }
        System.out.print("Enter Book ID: ");
        String bookID = scanner.nextLine();
        Book book = bookManager.searchBook(bookID);
        if (book == null || book.isIssued()) {
            System.out.println("Book not found or already issued.");
            return;
        }
        student.issueBook(bookID);
        book.issueBook();
        System.out.println("Book issued successfully.");
    }

    private static void returnBook() {
        System.out.print("Enter Student ID: ");
        String studentID = scanner.nextLine();
        Student student = studentManager.searchStudent(studentID);
        if (student == null || !student.hasIssuedBook()) {
            System.out.println("Student not found or no book issued.");
            return;
        }
        Book book = bookManager.searchBook(student.getIssuedBookID());
        if (book != null) {
            book.returnBook();
        }
        student.returnBook();
        System.out.println("Book returned successfully.");
    }

    private static void saveAndExit() {
        FileManager.saveBooks(bookManager);
        FileManager.saveStudents(studentManager);
        System.out.println("Data saved. Exiting...");
    }
}
