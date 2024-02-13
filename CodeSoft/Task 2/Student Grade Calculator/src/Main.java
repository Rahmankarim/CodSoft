import java.util.Scanner;

public class Main {

    public int totalMarks(int M, int E, int S, int CS, int SS) {
        int totalMarks = M + E + S + CS + SS;
        return totalMarks;
    }

    public float averagePercentage(int TM, int T) {
        float AP = (TM / (float) T) * 100; // Ensure floating-point division
        return AP;
    }

    public String grade(float AP) {
        if (AP >= 90) {
            return "A";
        } else if (AP >= 80) {
            return "B";
        } else if (AP >= 70) {
            return "C";
        } else if (AP >= 60) {
            return "D";
        } else if (AP >= 50) {
            return "E";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean choose = true;

        while (choose) {
            System.out.println("\n\tEnter Your Marks in the following Subjects out of 100:\n");
            System.out.print("\tMathematics:");
            int math = input.nextInt();
            System.out.print("\tEnglish:");
            int Eng = input.nextInt();
            System.out.print("\tScience:");
            int Sci = input.nextInt();
            System.out.print("\tComputer-Science:");
            int CS = input.nextInt();
            System.out.print("\tSocial-Sciences:");
            int SS = input.nextInt();

            // Validation for marks greater than 100
            while (math > 100 || Eng > 100 || Sci > 100 || CS > 100 || SS > 100) {
                System.out.println("\n\tYou have Entered marks Greater then 100 so try again");
                System.out.println("-------------------------------------------");

                System.out.println("\n\tEnter Your Marks in the following Subjects out of 100:\n");
                System.out.print("\tMathematics:");
                math = input.nextInt();
                System.out.print("\tEnglish:");
                Eng = input.nextInt();
                System.out.print("\tScience:");
                Sci = input.nextInt();
                System.out.print("\tComputer-Science:");
                CS = input.nextInt();
                System.out.print("\tSocial-Sciences:");
                SS = input.nextInt();
            }

            int TSMarks = 500;

            Main M = new Main();

            int TM = M.totalMarks(math, Eng, Sci, CS, SS);
            float AP = M.averagePercentage(TM, TSMarks);
            String Grade = M.grade(AP);

            System.out.println();
            System.out.println("-------------------------------------------");
            System.out.println("\tTotal Marks: " + TM);
            System.out.println("\tAverage Percentage: " + String.format("%.2f", AP) + " %");
            System.out.println("\tGrade: " + Grade);
            System.out.println("-------------------------------------------");
            System.out.println("\n\tIf You Want to Check Again Enter 1 else press any key");

            int Check = input.nextInt();
            if (Check != 1) {
                choose = false;
            }


        }
        input.close();
    }
}
