/* 
Stephan Reyes
Burger King Java Program
Write a program that prompts the user 
to enter a choice of a burger, a soda, or fries. 
Then the program prompts the users for details of their choices. 
*/
import java.util.Scanner;

public class BurgerKing
{
    
public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in); //declares an instance of the Scanner object and constructs an instance of the Scanner class that was declared
        System.out.print("Enter a letter to indicate a choice of Burger (B or b), Soda (S or s), Fries (F or f), (A or a) for all: ");//tells the user to enter a choice between the three options
        String answer = input.next();//allows user to select the choice they want
        switch (answer.length())// checks to see if what they entered is a string of length 1
        {
            case 1: //string of length 1
                switch (answer)
                {
                    case "B":   
                    case "b":   System.out.print("C or c for cheese, N or n for none of the above: ");// if the enter B or b, asks the user to choose from two other choices
                    String cheese = input.next();// allows user to select their two other choices once they've ordered a burger
                            switch (cheese.length())// checks if what the entered is a string of length 1
                            { 
                                case 1:
                                    switch (cheese)
                                    {
                                        case "C":
                                        case "c":   
                                            System.out.println("You ordered a burger with cheese");// if they enter C or c; tells the user they ordered a cheeseburger
                                        break;
                                        case "N":
                                        case "n":
                                            System.out.println("You ordered a plain burger");// if they enter N or n; tells the user they ordered a plain burger
                                        break;
                                        default: System.out.println("You didn't respond correctly");// if they don't respond with the given characters; tells the user they didn't respond correctly and terminates the program
                                        break;
                                    }
                                break;
                            default: System.out.println(answer + " A single character is expected");// tells the user that they have to only put a string of length 1
                            break;
                            }
                    break;
                    case "S":   
                    case "s":   System.out.print("Do you want Pepsi (p or P), Coke (c or C), Sprite (s or S), or Mountain Dew (M or m): ");// if the enter S or s, asks the user to choose from four other choices
                                String soda = input.next();// allows user to select their four other choices once they've ordered a soda
                            switch (soda.length())// checks if what the entered is a string of length 1
                            { 
                                case 1:
                                    switch (soda)
                                    {
                                        case "P":
                                        case "p":   
                                            System.out.println("You ordered a Pepsi");// if they enter P or p; tells the user they ordered a Pepsi
                                        break;
                                        case "C":
                                        case "c":
                                            System.out.println("You ordered a Coke");// if they enter C or c; tells the user they ordered a Coke
                                        break;
                                        case "S":
                                        case "s":   
                                            System.out.println("You ordered a Sprite");// if they enter S or s; tells the user they ordered a cheeseburger
                                        break;
                                        case "M":
                                        case "m":   
                                            System.out.println("You ordered a Mountain Dew");// if they enter M or m; tells the user they ordered a cheeseburger
                                        break;
                                        default: System.out.println("You didn't respond correctly");// if they don't respond with the given characters; tells the user they didn't respond correctly and terminates the program
                                        break;
                                    }
                                break;
                            default: System.out.println(answer + " A single character is expected");// tells the user that they have to only put a string of length 1
                            break;
                            }
                    break;
                    case "F":   
                    case "f":   System.out.print("Do you want a large or small order of fries (l,L,s, or S): ");// if the enter F or f, asks the user to choose from two other choices
                                String fries = input.next();// allows user to select their two other choices once they've ordered a soda
                            switch (fries.length())// checks if what the entered is a string of length 1
                            { 
                                case 1:
                                    switch (fries)
                                    {
                                        case "L":
                                        case "l":   
                                            System.out.println("You ordered large fries");// if they enter L or l; tells the user they ordered a Large Fries
                                        break;
                                        case "S":
                                        case "s":
                                            System.out.println("You ordered small fries");// if they enter S or s; tells the user they ordered a Small Fries
                                        break;
                                        default: System.out.println("You didn't respond correctly");// if they don't respond with the given characters; tells the user they didn't respond correctly and terminates the program
                                        break;
                                    }
                                break;
                            default: System.out.println(answer + " A single character is expected");// tells the user that they have to only put a string of length 1
                            break;
                            }
                    break;
                    case "A":
                    case "a":   System.out.println("You ordered all the options");// if the enter A or a, asks the user a series of questions from the questions asked from B/b, S/s, and F/f
                                System.out.print("Do you want Pepsi (p or P), Coke (c or C), Sprite (s or S), or Mountain Dew (M or m): ");
                                String drink = input.next();
                            switch (drink.length())
                            { 
                                case 1:
                                    switch (drink)
                                    {
                                        case "P":
                                        case "p":   
                                        System.out.println("You ordered a Pepsi");
                                        break;
                                        case "C":
                                        case "c":
                                            System.out.println("You ordered a Coke");
                                        break;
                                        case "S":
                                        case "s":   
                                            System.out.println("You ordered a Sprite");
                                        break;
                                        case "M":
                                        case "m":   
                                            System.out.println("You ordered a Mountain Dew");
                                        break;
                                        default: System.out.println("You didn't respond correctly");
                                        break;
                                    }
                                break;
                            default: System.out.println(answer + " A single character is expected");
                            break;
                            }
                                System.out.print("C or c for cheese, N or n for none of the above: ");
                                String queso = input.next();
                            switch (queso.length())
                            { 
                                case 1:
                                    switch (queso)
                                    {
                                        case "C":
                                        case "c":   
                                            System.out.println("You ordered a burger with cheese");
                                        break;
                                        case "N":
                                        case "n":
                                            System.out.println("You ordered a plain burger");
                                        break;
                                        default: System.out.println("You didn't respond correctly");
                                        break;
                                    }
                                break;
                            default: System.out.println(answer + " A single character is expected");
                            break;
                            }
                                System.out.print("Do you want a large or small order of fries (l,L,s, or S): ");
                                String fry = input.next();
                            switch (fry.length())
                            { 
                                case 1:
                                    switch (fry)
                                    {
                                        case "L":
                                        case "l":   
                                            System.out.println("You ordered large fries");
                                        break;
                                        case "S":
                                        case "s":
                                            System.out.println("You ordered small fries");
                                        break;
                                        default: System.out.println("You didn't respond correctly");
                                        break;
                                    }
                                break;
                            default: System.out.println(answer + " A single character is expected");
                            break;
                            }
                            break;
                default: System.out.println("You didn't respond correctly");// if they don't respond with the given characters; tells the user they didn't respond correctly and terminates the program
                break;
            }
            break;
        default: System.out.println(answer + " A single character is expected");// tells the user that they have to only put a string of length 1
        break;
        }
    }
}
