/* 
Stephan Reyes
Big Mac Again Program
This program uses the Scanner class to obtain from users
how many Big Macs they want and whether they want an order
of fries. It then prints out the total cost of the meal. 
Big Macs still cost $2.22 each,  and an order of fries costs $2.15.
*/
import java.util.Scanner;

public class BigMacAgain
{
    
public static void main(String[]args)
    {
        double bigMac$ = 2.22; 
        double fries$ = 2.15;
        
        Scanner input= new Scanner(System.in); 
        System.out.print("Enter the number of BigMacs: ");
        boolean bigMacs = input.hasNextInt();
        if(input.hasNextInt())
        {
            int nBigMacs = input.nextInt();
            if (nBigMacs>=0)
            {
                System.out.println("You ordered " + nBigMacs + " Big Macs for a cost of $" + ((int)(nBigMacs * bigMac$*100)/100.0));
                System.out.print("Do you want an order of fries (Y/y/N/n)?");
                String answer = input.next();
                if (answer.equals("Y") || answer.equals("y") || answer.equals("N") || answer.equals("n"))
                {
                    if (answer.equals("Y") || answer.equals("y"))
                    {
                        System.out.println("You ordered fries at a cost of $2.15");
                        System.out.println("Total Cost: $ " + (((int)(nBigMacs * bigMac$ *100)/100.0) + (int)(fries$*100)/100.0));
                    }
                    if (answer.equals("N") || answer.equals("n"))
                    {
                        System.out.println("Total Cost: $ " + ((int)(nBigMacs * bigMac$*100)/100.0));
                    }
                }
                else 
                {
                    System.out.println("You did not respond properly");
                    return;
                }
            }
            else
            {
                System.out.println("You did not enter a positive integer");
                return;
            }
        }
        else 
        {
            System.out.println("You did not enter an int");
            return;
        }
    }
}