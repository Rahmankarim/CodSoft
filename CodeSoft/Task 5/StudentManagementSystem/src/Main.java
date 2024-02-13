import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem managementSystem = new StudentManagementSystem();

        // Sample usage
        managementSystem.addStudent(new Student("Rahman Karim", 101, "A+"));
        managementSystem.addStudent(new Student("Irfan Karim", 102, "B"));
        managementSystem.addStudent(new Student("Urooj Fatima", 103, "F"));

while(true)
        {
            System.out.println("_______________________________________");
            System.out.println("Menu:");
            System.out.println("1) Add a Student");
            System.out.println("2) Remove a Student");
            System.out.println("3) Search for a student");
            System.out.println("4) Display all Students");
            System.out.println("5) EXIT");
            System.out.println("_______________________________________");
            System.out.print("Enter the required key:");

            int Key = scanner.nextInt();
            if(Key==1)
            {
                System.out.println("To Add a student Enter the following:");
                scanner.nextLine();
                System.out.print("Enter Name:");
                String Name= scanner.nextLine();
                System.out.print("Enter Roll No:");
                int Rollno= scanner.nextInt();
                System.out.print("Enter Grade:");
                scanner.nextLine();
                String Grade = scanner.nextLine();

                managementSystem.addStudent(new Student(Name, Rollno, Grade));

            }
            else if(Key==2)
            {
                System.out.print("Enter Roll number to remove a student:");
                int Rollno= scanner.nextInt();
                managementSystem.removeStudent(Rollno);


            }
            else if(Key==3)
            {


                System.out.print("Enter roll number to search:");
                int rollNumber = scanner.nextInt();
                Student foundStudent = managementSystem.searchStudent(rollNumber);
                if (foundStudent != null) {
                    System.out.println("Student found: " + foundStudent.getName()+", Roll no: "+foundStudent.getRollNumber()+", Grade: "+foundStudent.getGrade());
                } else {
                    System.out.println("Student not found");
                }



            }

            else if(Key==4)
            {
                // Display all students
                managementSystem.displayAllStudents();
            }
            else if(Key==5)
            {
                System.out.println("You have Selected to Exit");
                break;
            }
            else
            {
                System.out.println("You have Entered wrong number try again");
            }


        }

    }}