package StudentManagementSystem.ArrayList_Generics;

public class MyArrayList<T> 
{
    T set;
   public void setArray(T set)
   {
         this.set=set;
   }   
   public T getArray()
   {
       return this.set;
   }


   public int size() {
    throw new UnsupportedOperationException("Unimplemented method 'size'");
   }
}
