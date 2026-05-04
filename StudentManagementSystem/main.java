package StudentManagementSystem;

import java.util.Scanner;

public class main 
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        Services student=new Services();

        while(true)
        {
            System.out.println("\nStudnet Management System Menu");
            System.out.println("1. Add Student");
            System.out.println("2. Show All");
            System.out.println("3. Search");
            System.out.println("4. Remove");
            System.out.println("5. Exit");

            System.out.print("Choose: ");
            int ch = sc.nextInt();
            System.out.println();
            if (ch == 1) 
                {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();   
                    student.addstudent(id, name);
                } 
            else if (ch == 2) 
                {
                    student.showall();
                } 
            else if (ch == 3) 
                {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    student.search(id);
                } 
            else if (ch == 4) 
                {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    student.remove(id);
                } 
            else if (ch == 5) 
                {
                    break;
                } 
            else 
                {
                    System.out.println("Invalid");
                }
        }
    }
}

