package models;

import java.io.Serializable;

public class Student implements Serializable {
    private String studentID;
    private String name;
    private String issuedBookID;

    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.issuedBookID = null;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public String getIssuedBookID() {
        return issuedBookID;
    }

    public void issueBook(String bookID) {
        this.issuedBookID = bookID;
    }

    public void returnBook() {
        this.issuedBookID = null;
    }

    public boolean hasIssuedBook() {
        return issuedBookID != null;
    }

    @Override
    public String toString() {
        return "StudentID: " + studentID + ", Name: " + name + ", Issued BookID: " + issuedBookID;
    }
}
