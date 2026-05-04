package StudentManagementSystem;

import java.util.ArrayList;

public class Services 
{
    ArrayList<Student> student=new ArrayList<>();

     void addstudent(int id, String name)
    {
        student.add(new Student(id, name));
    }

    void showall()
    {
        for(Student s:student)
         {
            System.out.println(s.id + "-" + s.name);
         }
    }

    void search(int id)
    {
        for(Student s: student)
        {
            if(s.id==id)
            {
                System.out.println("Found");
                System.out.println("s.id" + "-" + "s.name");
                return ;
            }
            System.out.println("Not found!!!");
        }
    }

    void remove(int id)
    {
        for(Student s: student)
        {
            if(s.id==id)
            {
                student.remove(s);
                System.out.println("Removed student-> " + s.id +"-"+s.name);
                return ;
            }
            System.out.println("Not found!!!");
        }
    }
}
