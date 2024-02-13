import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentManagementSystem {

    private List<Student> students;
    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    // Method to add a student
    public void addStudent(Student s) {
        students.add(s);
    }

    // Method to remove a student
    public void removeStudent(int rollNumber) {
        boolean removed = false;
        for (Iterator<Student> iterator = students.iterator(); iterator.hasNext();) {
            Student student = iterator.next();
            if (student.getRollNumber() == rollNumber) {
                iterator.remove();
                removed = true;
                break;
            }
        }
        if (removed) {
            System.out.println("Student Removed Successfully");
        } else {
            System.out.println("Student with Roll Number " + rollNumber + " not found");
        }
    }

    // Method to search for a student by roll number
    public Student searchStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {

                return student;
            }
        }
        return null;
    }
        public void displayAllStudents() {
            System.out.println("List of Students:");
            for (Student student : students) {
                System.out.println("Name: " + student.getName() + ", Roll Number: " + student.getRollNumber() + ", Grade: " + student.getGrade());
            }
}

}
