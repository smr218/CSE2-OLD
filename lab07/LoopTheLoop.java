/* 
Stephan Reyes
LoopTheLoop Program

*/
import java.util.Scanner;

public class LoopTheLoop
{
    public static void main(String[]args)
    {
        
        while(true)
        {
            int nStars = 10;
            int stars = 0;
            Scanner input = new Scanner (System.in);
            System.out.print("Enter an int between 1 and 15: ");
            boolean check = input.hasNextInt();
            if (check)
            {
            nStars = input.nextInt();
                if (nStars < 0 || nStars > 15)
                {
                    System.out.println("You didn't enter an int within the range");
                }
                else 
                {
                    while (nStars > stars)
                    {
                    System.out.print("*");  // prints out 10 stars on one line
                    stars++;
                    }
                    System.out.println();
                    int counter = 0;
                    stars = 0;
                    while (counter < nStars)
                    {
                        counter++;
    	                while (counter > stars)
                        {
                            System.out.print("*");  // prints out 10 stars on one line
                            stars++;
                        }
                    stars = 0;
                    System.out.println();
                    }
                }
            }
            else 
            {
                System.out.println("You didn't enter an int");
            }
            System.out.print("Enter y or Y to go again: ");
            String yes = input.next();
            if ((yes.equals("y")) || (yes.equals("Y"))) 
            {
                continue;
            }
            else
            {
                break;
            }
        }
    }
}
        
        
