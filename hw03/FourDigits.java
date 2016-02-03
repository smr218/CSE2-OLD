/*
Stephan Reyes
FourDigits program 
This program prompts the user to enter a double and 
then prints out the first four digits to the right of 
the decimal point. It does so by explicitly casting it into an
int twice multiplying the value by 10000 and % by 10000.
*/
import java.util.Scanner; //imports Scanner in order to have the user type their values

public class FourDigits
{
    public static void main(String[] args)
    {
        Scanner myScanner; //declares an instance of the Scanner object
        myScanner = new Scanner(System.in); //constructs an instance of the Scanner class that was declared
        System.out.print("Enter a double and I'll display the four digits to the right: ");//tells the user to enter a double
        double x = myScanner.nextDouble();//allows user to select a value for the double
        int digits = (int) (x*10000)%10000;// explicitly casts the double into and into twice, times it by 10000 and % by 10000
        System.out.println("Four digits to the right are: " + digits);// prints out the four digits to the right of the decimal point
    }
}