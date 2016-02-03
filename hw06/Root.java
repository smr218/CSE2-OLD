/* 
Stephan Reyes
Root Java Program
The bisection method is a very simple way to compute the square root
of a number. Start by setting low to 0 and high to 1+x. Obviously 
the square root lies between low (whose square is less than the 
square root of x) and high (whose square is larger than the square 
root of x, which is not necessarily true, by the way, for high=x). 
Now take the middle of the interval [low, high] and call it middle. 
If the square of middle is greater than x, then change high to 
middle; otherwise change low to middle. At this point the square 
root is still between low and high, but the distance between low and
high has been halved. Repeat this process until the difference 
between high and low is less than some small multiple of 1+x, say 
0.0000001*(1+x). Then the square root is very close to both low and
high. For example, to find the square root of 2, start with [0,3]
(0*0<2 and 3*3 > 2). The middle is 1.5. 1.5*1.5=2.25>2, so the new 
interval is [0,2.25]. Now the middle is 1.125. 1.125*1.125<2, so 
the new interval is [1.125,2.25]. And so on. Write a Java program 
that forces the user to enter a double that is greater than 0, uses
the above algorithm to compute the square root of the number, and 
then prints it out. Use 0.0000001 as the “tolerance” for stopping 
the loop that computes the square root. 
*/
import java.util.Scanner;
public class Root
{
public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in); //declares an instance of the Scanner object and constructs an instance of the Scanner class that was declared
        System.out.print("Choose a double:");//tells the user to enter a choice between the three options
        boolean thedouble = input.hasNextDouble();//allows user to select the choice they want
        if (input.hasNextDouble())//checks to see if the value is a double
        {
            double x = input.nextDouble();// makes the value represent a double
            if (x > 0)// checks to see if the double is greater than 0
            {
                double high = (x+1);// sets a value for the high double by taking the double + 1
                double low = 0;// default makes the double 0
                double middle = ((high + low)/2);// takes the average of the high and low values
                double middlesquared = (middle * middle);// squares the value of middle
                double tolerance = .0000001;// constant value for the difference bewteen what high and low must not be less than
                System.out.println("[" + low + "," + high + "]");// prints out high and low in bracket form
                while ( (high-low) > tolerance)// if high - low is less than the tolerance then it jumps out of the while loop
                {
                    middle = ((high + low)/2);// takes the average of high + low again
                    middlesquared = (middle * middle);// squares the middle value again
                    if (middlesquared > x) // checks to see if the middle squared value is greater than the original x value
                    {
                       high = middle;// if it is greater than the middle value is now the new high value
                       System.out.println("[" + low + "," + high + "]");// prints out the new high and low value
                    }
                    else// if the middle squared isn't greater than the original x then the middle becomes the new low and prints out the new high and low value
                    {
                       low = middle;
                       System.out.println("[" + low + "," + high + "]");
                    }
                }
                middle = ((high + low)/2);// checks to see what the middle value is one final time to then print out what the square root of x is
                System.out.println("Square Root: " + middle);
            }
            else 
            {
                System.out.println("Not an positive double");// if the original input wasn't positive; let's the user know
            }
        }
        else
        {
            System.out.println("You didn't enter a double");// if the original input wasn't a double; let's the user know
        }
    }
}