import java.util.Random;
import java.util.Scanner;
class game
{
    private int ranNUm;
    private int attempts;
    private Scanner input;

    public game()
    {
        ranNUm=(int)(Math.random()*100)+1;
        input=new Scanner(System.in);
        attempts=0;
    }
    public game(int maxrange)
    {
        ranNUm=(int)(Math.random()*maxrange)+1;
        input=new Scanner(System.in);
        attempts=0;
    }
    public void startgame()
    {
        System.out.println("Welcome to Guess Game");
        System.out.println("Guess Number");
        while(true)
        {   
            System.out.println("Enter Your guess: ");
            int guess=input.nextInt();
            attempts++;
            int des=guessnum(guess);
            if(des==-1)
                {
                    System.out.println("Too low");
                } 
            else if(des==1)
                {
                    System.out.println("Too high");
                } 
            else
                {
                    System.out.println("You are correct!!");
                    System.out.println("You won the game at "+ attempts+" attempts");
                    break;   
                } 
        }   
    }
    private int guessnum(int guess)
        {
            if(guess<ranNUm) return -1;
            else if(guess>ranNUm) return 1;
            else return 0;
        }
}
public class GuessGame 
{
    static Random rn=new Random();
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("This is a Random Number Guess Game");
        System.out.println("Choose your difficulty");
        System.out.println("1. Easy(1-50)");
        System.out.println("2. Medium(51-75)");
        System.out.println("3. Hard(76-100)");
        System.out.println("Enter Difficulty");
        int choice=sc.nextInt();
        
        game player;

        if(choice==1)
        {
            player=new game(50);
        }
        else if(choice==2)
        {
            player=new game(75);
        }
        else if(choice==3)
        {
            player=new game(100);
        }
        else
            {
                System.out.println("Invalid choice");
                return;
            } 

        player.startgame();
    }
}
