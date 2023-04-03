package javaprogrammes;

import java.util.Scanner;

/**
 * Rewrite the student mark sheet programme (From java-homework-week3
 * programmes) using if else and while loop.
 */
public class Program2MarkSheet {
    static String studentName, result, grade;//store variables
    static int mathM, englishM, scienceM, total, rollno;//store variables
    static float percentage;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printTheMarkSheet();
    }

    public static void studentDetails() {
        System.out.println("What is the students name?     ");
        studentName = scanner.next();//store students name
        System.out.println("What is the students roll number?");
        rollno = scanner.nextInt();//store roll number
    }

    public static void subjectMarks() {

        System.out.println("Please enter the Maths mark value?");
        mathM = scanner.nextInt();
        while (mathM < 0 || mathM > 100) {//to check if marks in between 0 to 100
            System.out.println("Invalid input, marks should be between 0 to 100");
            System.out.println("Please re enter mark  ");
            mathM = scanner.nextInt();
        }
        System.out.println("Please enter the Science mark value?");
        scienceM = scanner.nextInt();
        while (scienceM < 0 || scienceM > 100) {
            System.out.println("Invalid input, marks should be between 0 to 100");
            System.out.println("Please re enter mark  ");
            scienceM = scanner.nextInt();
        }
        System.out.println("Please enter the English mark value?");
        englishM = scanner.nextInt();
        while (englishM < 0 || englishM > 100) {
            System.out.println("Invalid input, marks should be between 0 to 100");
            System.out.println("Please re enter mark  ");
            englishM = scanner.nextInt();
            scanner.close();
        }
    }

    public static void calculation() {
        subjectMarks();
        total = mathM + scienceM + englishM;
        System.out.println("Total marks: " + total);
        percentage = total / 3f;
        System.out.println("Percentage: " + percentage);

        if (percentage >= 35 && mathM >= 35 && scienceM >= 35 && englishM >= 35) {//if else method for pass or fail
            result = "PASS";
        } else {
            result = " FAIL ";
        }

        if (percentage >= 80) {//nested if else
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage > 50) {
            grade = "B";
        } else if (percentage > 35) {
            grade = "C";
        }

    }

    public static void printTheMarkSheet() {
        studentDetails();
        calculation();
        System.out.println("|                  Mark Sheet            |");
        System.out.println("|________________________________________|");
        System.out.println("| Name               :" + studentName + "|");
        System.out.println("| Roll No            :" + rollno + "|");
        System.out.println("|________________________________________|");
        System.out.println("| Subjects           :    Marks          |");
        System.out.println("|________________________________________|");
        System.out.println("| Math              :" + mathM + "|");
        System.out.println("| Science           :" + scienceM + "|");
        System.out.println("| English           :" + englishM + "|");
        System.out.println("|________________________________________|");
        System.out.println("| Total             :" + total + "|");
        System.out.println("|________________________________________|");
        System.out.println("| Percentage        :" + percentage + "|");
        System.out.println("| Result            :" + result + "|");
        System.out.println("| Grade             :" + grade + "|");
        System.out.println("|_______________________________________ | ");

    }
}
