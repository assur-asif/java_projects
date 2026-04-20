
import java.util.Scanner;

public class Calendar 
{   
    //determine if it is a leap year
    //method 1
    public static boolean isLeap(int year)
    {
        return(year%4==0 && year%100 !=0) || (year%400==0);   
    }
    //check days in months and the leap yeaar condition 
    //method 2
    public static int getDays(int month, int year)
    {   
        switch(month)
        {
            case 1: return 31;
            case 2: return (isLeap(year)?29:28);
            case 3: return 31;
            case 4: return 30;
            case 5: return 31;
            case 6: return 30;
            case 7: return 31;
            case 8: return 31;
            case 9: return 30;
            case 10: return 31;
            case 11: return 30;
            case 12: return 31;
        }
        return 0;
    }
    //get monthsname
    //method 3
    public static String getMonthName(int month)
    {
        String[] months={"January","February","March","April","May","June","July",
            "August","September","October","November","December"};
            return months[month-1];
    }
    //first day of the year
    //method 4
    public static int getFirstDay(int year)
    {   
        //Sunday==0
        int day=1;
        for(int i=1900;i<year;i++)
        {
            day+=isLeap(i)?366:365;
        }
        return day%7;
    }
      //main method to print the final calendar
    public static void printCalendar(int year)
    {
        int firstDay=getFirstDay(year);
        for(int month=1;month<=12;month++)
        {
            int days=getDays(month, year);
            
            System.out.println("    "+ getMonthName(month) + " "+ year);
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            //print days
            for (int day = 1; day <= days; day++) {
                System.out.printf("%3d ", day);

                if ((day + firstDay) % 7 == 0) {
                    System.out.println();
                }
            }
             System.out.println();
             System.out.println();
            firstDay = (firstDay + days) % 7;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year=sc.nextInt();
        printCalendar(year);

    }  
}
