/*
-Stephan Reyes
-IncomeTax Java Program
Write a program that prompts the user to enter an int that 
gives the thousands of dollars of income and then writes out 
the amount of tax on the income, given the following 
(progressive) schedule:  <20, 5%;  >=20 and < 40, 7%; >=40
and < 78, 12%; >=78, 14%.
*/
import java.util.Scanner; //imports Scanner in order to have the user type their values

public class IncomeTax
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in); //declares an instance of the Scanner object and constructs an instance of the Scanner class that was declared
        System.out.print("Enter an int giving the number of thousands- "); // tells the user to enter a value for the integer that will then be converted into thousands
        boolean incomeTax = input.hasNextInt();//allows user to select the vaule they want the integer in thousands to be
        if(input.hasNextInt()) // checks to see if the value inputed was an integer
        {
            int income = input.nextInt(); 
            if (income>=0) // if the value inputed was an integer then checks to see if it is a positive integer
            {
                if (income<20) // if the value inputed by the user is less than 20; then the income tax on the value is equivilant to 5%
                {
                    System.out.println("The tax rate on $" + income*1000 + " is 5%, and the tax is $" + ((int)(income*1000 * .05 *100)/100.0));
                }
                if (income>=20 && income< 40) // if the value inputed by the user is less than 40 and greater than or equal to 20; then the income tax on the value is equivilant to 7%
                {
                    System.out.println("The tax rate on $" + income*1000 + " is 7%, and the tax is $" + ((int)(income*1000 * .07 *100)/100.0));
                }
                if (income>=40 && income< 78) // // if the value inputed by the user is less than 78 and greater than or equal to 40; then the income tax on the value is equivilant to 12%
                {
                    System.out.println("The tax rate on $" + income*1000 + " is 12%, and the tax is $" + ((int)(income*1000 * .12 *100)/100.0));
                }
                if (income>=78) // if the value inputed by the user is greater than or equal to 78; then the income tax on the value is equivilant to 14%
                {
                System.out.println("The tax rate on $" + income*1000 + " is 14%, and the tax is $" + ((int)(income*1000 * .14 *100)/100.0));
                }
            }
            else
            {
                System.out.println("You did not enter a positive integer"); // if the input was not a positive integer; else- let's the user know and terminates the program
                return;
            }
        }
        else
        {
            System.out.println("You did not enter an int"); // if the input was not an integer; else- let's the user know and terminates the program
            return;
        }
    }
}
                    
        