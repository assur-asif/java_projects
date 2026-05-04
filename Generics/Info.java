package StudentManagementSystem.ArrayList_Generics;

import java.util.ArrayList;

public class Info 
{
    protected String name;
    protected int id;

    ArrayList<Info> input=new ArrayList<>();

  public Info(int id, String name)
  {
    this.name=name;
    this.id=id;
  }
  public Info(){}
    void addinfo(int id, String name)
    {
        input.add(new Info(id,name));
        System.out.println("Method-3");
        System.out.println(id +"- "+ name);
    }   

}
