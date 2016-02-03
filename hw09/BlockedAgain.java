import java.util.Scanner;
public class BlockedAgain
{
    public static int checkInt()
    {
        Scanner input = new Scanner(System.in);// Scanner 
        while (!input.hasNextInt())// checks to see if it's an in and if makes the user input something again
        {
            System.out.println("You didn't enter an int; try again: ");
            input.next();
        }
        return input.nextInt();
    }
    
    public static int checkRange(int c)// checks to see if the input is witin range and if not makes the user input it again
    {
       int choice = c;
       while (choice > 9 || choice < 1)
       {
           System.out.println("You didn't enter an in within the range [1,9]; try again: ");
           choice = checkInt();
       }
       return choice;
    }
    
    public static int getInt()//makes the user input a value and then checks to make sure it's acceptable by calling on other methods
    {
        int a;
        int b;
        System.out.print("Enter and integer between 1 and 9, inclusive: ");
        a = checkInt();
        b = checkRange(a);
        return b;
    }
     
    public static void line(int x)// sets up the pyramid shape
    {
        for (int rows = 0; rows < x; rows++)// makes rows equal to 0 and continuously increments it until it's equal to x
        {
            for (int space = 0; space < 9-x; space++)// makes space equal to 0 and continuously increments until it's equal to sets - x
            {
                System.out.print(" ");// prints the spacing
            }
            for (int counter = 0; counter < ((2*x)-1); counter++)// makes counter equal to 0 and continuously increments until counter is equal to 2*x - 1
            {
                System.out.print(x);// prints out the #
            }
            System.out.println();// prints out a space 
        }
        for (int rows = 0; rows < 9-x; rows++)// prints out spacing of lines 
        {
            System.out.print(" ");
        }
        for (int counter = 0; counter < ((2*x)-1); counter++)
        {
            System.out.print("-");
        }
            System.out.println(" ");
    }
    
    public static void block(int y)//makes the each block of numbers by recalling other methods also
    {
        for (int groups = 1; groups < y + 1; groups++)
        {
            line(groups);
        }
    }
    
    public static void allBlocks(int z)// makes the shape
    {
        block(z);
    }
    
    public static void main(String []s)
    {
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt(); 
        allBlocks(m);
    }
}
