/*
-Stephan Reyes
-Time Padding Program
Write a program that has the user enter an positive integer 
giving the number of seconds that have passed during the day 
and then displays the time in conventional form.
*/
import java.util.Scanner; //imports Scanner in order to have the user type their values

public class TimePadding
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in); //declares an instance of the Scanner object and constructs an instance of the Scanner class that was declared
        System.out.print("Enter the time in seconds: "); //tells the user to enter a value for time in seconds
        boolean integer = input.hasNextInt(); //allows user to select the vaule they want the time to be
        if(input.hasNextInt()) //checks if an integer has been put in by the user
        {
            int time = input.nextInt(); 
            if (time >= 0)              //if the user did put in a integer; checks to see if that integer is positive
            {
                if ((time >= 0) && (time < 60)) // if integer is between 0 and 60; this if statement displays that integer
                {
                    int timeseconds1 = time/10;
                    int timeseconds2 = time%10;
                    System.out.println(" The time is 00:00:"+ timeseconds1 + timeseconds2 );
                }
                if ((time >= 60) && (time < 600)) // if the integer is between 60 and 600; this if statement displays that number of minutes < 10 and the seconds along with it
                {
                    int timeminutes1 = time%60/60;
                    int timeminutes2 = time/60;
                    int timeseconds1 = time%60/10%10;
                    int timeseconds2 = time%60%10;
                    System.out.println(" The time is 00:" + timeminutes1 + timeminutes2 + ":" + timeseconds1 + timeseconds2);
                }
                if ((time >= 600) && (time < 3600)) // if the integer is between 600 and 3600; this if statement displays that number of minutes < 60 and the seconds along wiht it
                {
                    int timeminutes = time/60;
                    int timeseconds1 = time%60/10%10;
                    int timeseconds2 = time%60%10;
                    System.out.println(" The time is 00:" + timeminutes + ":" + timeseconds1 + timeseconds2 );
                }
                 if (time >= 3600) // if the integer is over 3600; this if statement displays that number in hours, minutes and seconds
                {
                    int timehours = time/3600;
                    int timeminutes = time%3600/60;
                    int timeseconds1 = time%60/10%10;
                    int timeseconds2 = time%60%10;
                    if ( timeminutes < 10) // if the minutes in this if statement is less than 10; this if statement simply displays a 0 before the value for minutes
                    {
                        System.out.println("The time is " + timehours + ":0" + timeminutes + ":" + timeseconds1 + timeseconds2);
                        return;
                    }
                    System.out.println(" The time is " + timehours + ":" + timeminutes + ":" + timeseconds1 + timeseconds2);
                }
            }
            else // if the integer placed in was not greater than 0; else let's the user know and terminates the program
            {
                System.out.println("Not a positive integer");
                return;
            }
        }
        else // if the input was not an integer; else let's the user know and terminates the program
        {
            System.out.println("Not an integer");
            return;
        }
    }
}
        
        