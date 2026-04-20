import java.util.*;

public class CGPACalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        String[] sub = {"CIT-111","CIT-112","MATH-111","CCE-112","CHEMISTRY-111",
                        "CHEMISTRY-112","PHYSICS-111","PHYSICS-112","EEE-111","EEE-112","OCP"};

        double[] credit = {3.00,1.5,3.00,0.75,2.00,0.75,2.00,0.75,3.00,0.75,0.75};

        int[] mark = new int[11];
        String[] grade = new String[11];
        double[] grade_point = new double[11];
        double[] point = new double[11];

        double total_point = 0;
        double total_credit = 0;

        System.out.print("ENTER STUDENT NAME: ");
        name = sc.nextLine();

        for(int i = 0; i < 11; i++) {
            System.out.print("Marks in " + sub[i] + ": ");
            mark[i] = sc.nextInt();

            if(mark[i] >= 80) {
                grade[i] = "A+";
                grade_point[i] = 4.00;
            }
            else if(mark[i] >= 75) {
                grade[i] = "A";
                grade_point[i] = 3.75;
            }
            else if(mark[i] >= 70) {
                grade[i] = "A-";
                grade_point[i] = 3.50;
            }
            else if(mark[i] >= 65) {
                grade[i] = "B+";
                grade_point[i] = 3.25;
            }
            else if(mark[i] >= 60) {
                grade[i] = "B";
                grade_point[i] = 3.00;
            }
            else if(mark[i] >= 55) {
                grade[i] = "B-";
                grade_point[i] = 2.75;
            }
            else if(mark[i] >= 50) {
                grade[i] = "C+";
                grade_point[i] = 2.50;
            }
            else if(mark[i] >= 45) {
                grade[i] = "C";
                grade_point[i] = 2.25;
            }
            else if(mark[i] >= 40) {
                grade[i] = "D";
                grade_point[i] = 2.00;
            }
            else {
                grade[i] = "F";
                grade_point[i] = 0.0;
            }

            point[i] = grade_point[i] * credit[i];
            total_point += point[i];
            total_credit += credit[i];
        }

        double cgpa = total_point / total_credit;

        System.out.println("\n-----Result----\n");
        System.out.println("Student Name: " + name + "\n");

        System.out.printf("CGPA: %.2f\n\n", cgpa);

        boolean fail = false;

        for(int i = 0; i < 11; i++) {
            if(grade[i].equals("F")) {   // IMPORTANT in Java
                fail = true;
                break;
            }
        }

        if(fail) {
            System.out.println("Final Result: Fail\n");
        } else {
            System.out.println("Final Result: Passed\n");
        }

        System.out.println("This program is made by Ali Hosen Asif");
        System.out.println("CSE, PSTU-_-...");
        
        sc.close();
    }
}