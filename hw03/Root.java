/*
Stephan Reyes
Root program 
This program prompts the user to enter a double 
and then prints out a crude estimate of the cube root of 
the number and the value of this crude guess when cubed. 
It first guesses the cube root as x/3, then it improves that guess
with the formula (guess*guess*guess+x)/(3*guess*guess) and improves
it further with the formule (2guess*guess*guess+x)/(3*guess*guess) four more times.
*/
import java.util.Scanner; //imports Scanner in order to have the user type their values

public class Root
{
    public static void main(String[] args)
    {
        Scanner myScanner; //declares an instance of the Scanner object
        myScanner = new Scanner( System.in ); //constructs an instance of the Scanner class that was declared
        System.out.print("Enter a value for x: "); //tells the user to enter a value they want cube rooted
        double x = myScanner.nextDouble();//allows user to select the vaule they want cube rooted
        double guess = x/3;// first crude guess of what the cube root of the value is
        double guess1 = (guess*guess*guess+x)/(3*guess*guess);// improved crude guess 1 of what the cube root of the value is
        double guess2 = (2*guess1*guess1*guess1+x)/(3*guess1*guess1);// improved crude guess 2 of what the cube root of the value is
        double guess3 = (2*guess2*guess2*guess2+x)/(3*guess2*guess2);// improved crude guess 3 of what the cube root of the value is
        double guess4 = (2*guess3*guess3*guess3+x)/(3*guess3*guess3);// improved crude guess 4 of what the cube root of the value is
        double guess5 = (2*guess4*guess4*guess4+x)/(3*guess4*guess4);// final crude guess 5 of what the cube root of the value is
        System.out.println("Cube Root is: " + guess5); // prints out crude guess of the cube root
    }
}