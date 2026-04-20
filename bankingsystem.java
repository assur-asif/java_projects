import java.util.Scanner;
public class bankingsystem
{

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {  
        boolean isrunning=true;
        double balance=0;
        int choice;
      while(isrunning)
      {
       System.out.println("********************");
       System.out.println("Banking System");
       System.out.println("1. Balance");
       System.out.println("2. Deposit");
       System.out.println("3. Withdraw");
       System.out.println("4.Exit");

       System.out.print("Choose your option (1-4): ");
       choice =scanner.nextInt();

       switch(choice)
       {
        case 1 -> showBalance (balance);
        case 2 -> balance +=deposit();
        case 3 -> balance-=withdraw(balance);
        case 4 ->isrunning=false;
        default -> System.out.println("Invalid");
       }   
      }
      System.out.println("\n");
      System.out.println("************");
      System.out.println("Thank You");
      System.out.println("************");
      System.out.println("\n");

    } 
    static void showBalance(double balance)
      {
        System.out.println("************");
        System.out.printf("$%.2f\n",balance);
        System.out.println("************");
      }
      static double deposit()
      {
        System.out.println("Enter the amount to deposit: ");
        double amount=scanner.nextDouble();
        
        if(amount<0)
        {
            System.out.println("cant be negative");
            return 0;
        }
        else 
        {
            return amount;
        }
        
      }
      static double withdraw(double balance)
        {
            System.out.println("Enter amount to withdraw:");
            double amount=scanner.nextDouble();
            if(amount<0)
            {
                System.out.println("cant be negative");
                return 0;
            }
            else if(amount>balance)
            {
                System.out.println("Insufficient balance");
                return 0;
            }
            else
            {
                return amount;
            }
        }
}
