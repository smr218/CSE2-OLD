/* 
Stephan Reyes
Methods Program
In the program below I call on three different overloaded versions of getInput(). 
(Overloaded methods are two or more methods that have the same name but that take different
numbers or types of parameters). You should add the definitions of the methods so that the 
program would produce the output (for the corresponding input) shown below the program. 
Calls like getInput(scan,”dEf”) should force the user to enter a string from the keyboard that
is exactly one character long and that is one of the characters in the string “dEf”, and it 
should return the character entered. Calls like getInput(scan,”abc”,7) should try to force the
user to enter a string that consists of exactly one character and is one of the characters in
the string “abc”, and it should return the character entered, but it should give up and return 
the character ‘ ‘ if the user fails to enter one of the required characters after 7 attempts.
Calls like getInput(scan,”Prompt: “,”059”) should use the string “Prompt: “, should force the
user to enter a string with exactly one character that is one of the characters in the string
“059”, and should return the character entered.  The phrase “force the user” means that the 
program should repeatedly prompt the user until the user enters the correct input. The output
of your program should be very much the same as the illustrative output below.
*/
import java.util.Scanner;
public class HW8
{
    public static char getInput(Scanner scan, String CompareTo)
    {
        while (true)//makes the loop infinite
        {
        String x = scan.next();//tells the user to input a value 
        while (x.length() > 1)// if the length of the inputed value is greater than 1, tell the user and then prompts them to re-enter a value
        {
            System.out.println("You should enter exactly one character ");
            x = scan.next();
        }
    
        int counter = 0;
        char y = x.charAt(0);// checks the first character of the string
        while (counter < CompareTo.length())// while the counter is less than the length of the string it increases the counter after checking if the input is equal to the first char of the string and does so for the following characters
            {
             if (y == CompareTo.charAt(counter)) 
            {
                return y;
            }
            counter++;
            }
            System.out.println("you did not enter a character int the list " + CompareTo);// if the input is neither of the characters in the string then it prompts the user to enter a new input
        }
    }
    
    public static char getInput(Scanner scan, String CompareTo2, int numberOfTries)
    { 
        String x = scan.next();// tells the user to input a value
        int counter2 = 1;
        while (counter2 < numberOfTries)// while the counter is less than the number of tries available continues on with code until it reaches the number of tries, then it tells the user they have failed and moves on
        {
            counter2++;
            int counter = 0;
            while (counter < CompareTo2.length())// tests to see what the input is, similar to first getInput
            {
            char y = x.charAt(0);
            if (y == CompareTo2.charAt(counter)) 
            {
                return y;
            }
            counter++;
            }
            System.out.println("you did not enter a character int the list " + CompareTo2);
            x = scan.next();
        }
        System.out.println("You failed more than " +numberOfTries + " times");
        return ' ';// returns only the allowed numbers they failed ^ print statement above
    }
  
    public static char getInput(Scanner scan, String CompareTo3, String CompareTo4)
    {
        while (true)// makes the loop infinite
        {
        System.out.println(CompareTo3);// prints out the string CompareTo3
        System.out.print("Enter one of: " + CompareTo4 + " - ");// prints out the string CompareTo4
        String x = scan.next();
        while (x.length() > 1)// if the length of the inputed value is greater than 1, tell the user and then prompts them to re-enter a value
        {
            System.out.println("You should enter exactly one character ");
            System.out.println(CompareTo3);// prints out CompareTo3, since this code loops and thus wouldn't have printed CompareTo3 since it's before the loop
            System.out.print("Enter one of: " + CompareTo4 + " - ");// prints out CompareTo4, since this code loops and thus wouldn't printed CompareTo4 since it's before the loop
            x = scan.next();
        }
        int counter = 0;
        char y = x.charAt(0);//checks the first character of the string
        while (counter < CompareTo4.length())// while the counter is less than the length of the string it increases the counter after checking if the input is equal to the first char of the string and does so for the following characters
            {
             if (y == CompareTo4.charAt(counter)) 
            {
                return y;
            }
            counter++;
            }
            
            System.out.println("You did not enter an acceptable character");
        }
    }
    public static void main(String []arg)
    {
	    char input;// character
	    Scanner scan=new Scanner(System.in);// makes a scanner
	    System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");// tells the user to enter C or c
	    input=getInput(scan,"Cc");// user input calls getInput with a scan and 1 string
	    System.out.println("You entered '"+input+"'");// prints out
	    System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");// tells the user to enter y or Y or N or n
	    input=getInput(scan,"yYnN",5); //user input calls getInput with a scan, 1 string, and gives up after 5 attempts
	    if(input!=' ')// if it doesn't fail prints out input
	        {
   	        System.out.println("You entered '"+input+"'");
	        }
	    input=getInput(scan,"Choose a digit.","0123456789");// user input calls getInput with 1 scan, and 2 strings
	    System.out.println("You entered '"+input+"'");// prints out the input
    }

}
