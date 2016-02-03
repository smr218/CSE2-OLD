/* 
Stephan Reyes
NumberStack Program

*/
import java.util.Scanner;

public class NumberStack
{
    public static void main(String[] args) 
    {
        int rows = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an int between 1 and 9: ");
        boolean check = input.hasNextInt();
        int columns = 0;
        int counter = 0;
        int sets = input.nextInt();
        int space = 0;
        /*
if (check) // checks to see if input is an integer 
{
    if (sets < 0 || sets > 9) // checks to see the integer is within the range and if not it tells the user
    {
        System.out.println("You didn't enter an int within the range");
    }
    columns = 0;
        do 
        {
            columns++;
            rows = 0;
            do 
            {
                rows++;
                space = 0;
                do 
                {
                    space++;
                    System.out.print(" ");// prints the spacing
                }
                while (space < sets - columns);
                counter = 0;
                do
                {
                    counter++;
                    System.out.print(columns);// prints out the # 
                }
                while (counter < ((2*columns)-1));
                System.out.println(" ");// prints out a space 
            }
            while (rows < columns);
            counter = 0;
            do 
            {
                counter++;
                rows = 0;
                do
                {
                    rows++;
                    System.out.print(" ");
                }
                while (rows < sets-columns);
                counter = 0;
                do 
                {
                    counter++;
                    System.out.print("-");
                }
                while (counter < ((2*columns)-1));
                System.out.println();
            }
            while (counter < ((2*columns)-1));
        }
        while (columns < sets);
}
else 
{
    System.out.println("You did not enter an integer between 1 and 9");
}
*/
        
        if (check) //checks to see if input is an integer
        {
            if (sets < 1 || sets > 9) // checks to see the integer is within the range and if not it tells the user
            {
                System.out.println("You didn't enter an int within the range");
            }
            for (columns = 1; columns < sets+1; columns++)// makes columns equal to 1 and continuously increments it until it's equal to sets+1
            {
                for (rows = 0; rows < columns; rows++)// makes rows equal to 0 and continuously increments it until it's equal to columns
                {
                    for (space = 0; space < sets-columns; space++)// makes space equal to 0 and continuously increments until it's equal to sets - columns
                    {
                        System.out.print(" ");// prints the spacing
                    }
                    for (counter = 0; counter < ((2*columns)-1); counter++)// makes counter equal to 0 and continuously increments until counter is equal to 2*columns - 1
                    {
                        System.out.print(columns);// prints out the #
                    }
                    System.out.println(" ");// prints out a space 
                }
                    for (counter = 0; counter < ((2*columns)-1); counter++)// prints out the spacing and # of -
                    {
                        for (rows = 0; rows < sets-columns; rows++)
                        {
                            System.out.print(" ");
                        }
                        for (counter = 0; counter < ((2*columns)-1); counter++)
                        {
                            System.out.print("-");
                        }
                        System.out.println();
                    }
                    
            }
            
        }
        else 
        {
            System.out.println("You did not enter an int");
        }
       
/*   
        if (check) //checks to see if input is an integer
        {
            if (sets < 0 || sets > 9) // checks to see the integer is within the range and if not it tells the user
            {
                System.out.println("You didn't enter an int within the range");
            }
            columns = 0;// makes columns equal to 1 and continuously increments it until it's equal to sets
            while (columns < sets) 
            {
                columns++;
                rows = 0;// makes rows equal to 0 and continuously increments it until it's equal to columns
                while (rows < columns) 
                {
                    rows++;
                    space = 0;// makes space equal to 0 and continuously increments until it's equal to sets - columns
                    while (space < sets- columns)
                    {
                        space++;
                        System.out.print(" ");
                    }
                    counter = 0;// makes counter equal to 0 and continuously increments until counter is equal to 2*columns - 1
                    while (counter < ((2 * columns) - 1)) 
                    {
                        counter++;
                        System.out.print(columns);// prints numbers
                    }
                    System.out.println(" ");// prints a space
                }
                counter = 0;// prints out the spacing and # of -
                while (counter < ((2 * columns) - 1)) 
                {
                    counter++;
                    rows = 0;
                    while (rows < sets - columns) 
                    {
                        rows++;
                        System.out.print(" "); 
                    }
                    counter = 0;
                    while (counter < ((2 * columns) - 1)) 
                    {
                        counter++;
                        System.out.print("-");
                    }
                    System.out.println();
                }
            }
        }
        else 
        {
            System.out.println("You didn't enter an int");
        }
*/

}
}