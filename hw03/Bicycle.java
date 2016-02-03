/*
-Stephan Reyes
-Bicycle Java Program
This program prompts the user to enter two digits, 
the first giving the number of seconds of a bike trip and
the second giving the number of counts on a cyclometer of that trip.
After it prints the converted distance traveled in miles and minutes.
Finally it prints out the average miles per hour. 
*/
import java.util.Scanner; //imports Scanner in order to have the user type their values

public class Bicycle
{
    public static void main(String[] args)
    {
        Scanner myScanner; //declares an instance of the Scanner object
        myScanner = new Scanner( System.in ); //constructs an instance of the Scanner class that was declared
        System.out.print("Enter the number of seconds: ");//tells the user to choose a value for seconds
        int seconds = myScanner.nextInt();//allows user to select a value for seconds
        System.out.print("Enter the number of counts: ");// tell the user to choose a value for counts
        int counts = myScanner.nextInt();//allows user to selecr a value for counts
        double wheelDiameter=27.0,// Diameter of the front wheel
        PI=3.14159,// pi's value
        feetPerMile=5280,// conversion rate of how many feet are in a mile
        inchesPerFoot=12,// conversion rate of how many inches are in a foot
        secondsPerMinute=60,// conversion rate of how many seconds are in a minute
        minutesPerHour=60; // conversion rate of how many minutes are in an hour
        double totalDistance;// variable for the totaldistance
        totalDistance= ((int) (counts*wheelDiameter*PI/inchesPerFoot/feetPerMile *100)/100.0);//calculates how many miles the bike trip was total
        double MPH= (totalDistance/(seconds/secondsPerMinute/minutesPerHour));// divides the miles by hours
        System.out.println("The distance was "+totalDistance+" miles and took "+ (seconds/secondsPerMinute) + " minutes");
        System.out.println("The average MPH was " + (int) (MPH*100)/100.0);
    }
}