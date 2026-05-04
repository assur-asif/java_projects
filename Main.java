package StudentManagementSystem.ArrayList_Generics;

import java.util.ArrayList;

public class Main 
{
   public static void main(String[] args) 
   {
        // Integar typee  method--1
        //here i use my generic class as Arraylist

      MyArrayList<Integer> res1=new MyArrayList<>();
      res1.setArray(2402038);
      System.out.println("Method-1");
      System.out.println(res1.getArray());
      System.out.println();

    //String Typeee Method--2

       ArrayList<MyArrayList<String>>arr1=new ArrayList<>();
       
       String[] name={"Asif", "Tomal", "Habib", "Emon"};
       System.out.println("Method--2");
       System.out.println("Names: ");
       for (String s: name)
       {
            MyArrayList<String>input1=new MyArrayList<>();
            input1.setArray(s);
            arr1.add(input1);
       }
       for(MyArrayList<String>s:arr1)
       {
           System.out.println(s.getArray());
       }
      System.out.println();

      // calling info class --Method3---
      
      Info info=new Info();
      info.addinfo(1,"Asif");

   }

}
