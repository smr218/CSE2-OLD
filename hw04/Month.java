/*
-Stephan Reyes
-Month Java Program
Write a program that prompts the user to enter an integer for 
the month (1 for January, 2 for February, etc.)  and then
displays the number of days in the month).  If the number 2 is
entered (February) the user is then asked to enter the year. 
Make sure that the user enters an integer for the month and 
that the integer is in the required range. Similarly, if the 
year is requested, ensure that an int is entered, and that the
int is positive.
*/
import java.util.Scanner; //imports Scanner in order to have the user type their values

public class Month
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in); //declares an instance of the Scanner object and constructs an instance of the Scanner class that was declared
        System.out.print("Enter an int giving the number of the month (1-12): "); //tells the user to enter a value for a month between 1 and 12
        boolean integer = input.hasNextInt(); //allows user to select the vaule they want the month to be
        if(input.hasNextInt()) //checks if an integer has been put in by the user
        {
            int month = input.nextInt(); 
            if (month <= 12 && month >= 1)              //if the user did put in a integer; checks to see if that integer is greater than 0
            {
                if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) // if the integer is either of these values then the program will tell you that month has 31 days
                {
                    System.out.println("The month has 31 days");
                }
                if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) // if the integer is either of these values then the program will tell you that month has 30 days
                {
                System.out.println("The month has 30 days");
                }
                if ( month == 2)
                {
                    System.out.print("Enter an int giving the year: " );
                    int year = input.nextInt();
                        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                        {
                            System.out.println("The month has 29 days");
                        }
                        else 
                        {
                            System.out.println("The month has 28 days");
                        }
                }
            }
            else// if the integer placed in was not between 1 and 12; else- let's the user know and terminates the program
            {
                System.out.println("Not an integer between 1 and 12");
                return;
            }
        }
        else // if the input was not an integer; else- let's the user know and terminates the program
        {
            System.out.println("Not an integer");
            return;
        }
    }
}
        
        