package managers;

import models.Student;
import java.util.Iterator;
import java.util.LinkedList;

public class StudentManager {
    private LinkedList<Student> students;

    public StudentManager() {
        students = new LinkedList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void removeStudent(String studentID) {
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.getStudentID().equals(studentID)) {
                it.remove();
                System.out.println("Student removed successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public Student searchStudent(String studentID) {
        for (Student student : students) {
            if (student.getStudentID().equals(studentID)) {
                return student;
            }
        }
        System.out.println("Student not found.");
        return null;
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public LinkedList<Student> getStudents() {
        return students;
    }
}
