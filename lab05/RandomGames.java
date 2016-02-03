/* 
Stephan Reyes
Random Games Program

*/
import java.util.Scanner;

public class RandomGames
{
    
public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card- ");
        String answer = input.next();
        int roulette = (int)(Math.random()*38);
        int roll1 = (int)(Math.random()*6)+1;
        int roll2 = (int)(Math.random()*6)+1;
        int rolltotal = (roll1 + roll2);
        int suit = (int)(Math.random()*4)+1;
        int card = (int)(Math.random()*14)+1;
        switch (answer.length())
        {
            case 1: 
                switch (answer)
                {
                    case "R":   
                    case "r":  
                        switch (roulette)
                        {
                            case 37: System.out.println("Roulette: 00");
                            break;
                            default: System.out.println("Roulette: " + roulette);
                            break;
                        }
                    break;
                    case "C": 
                    case "c": System.out.println("Craps: " + roll1 + "+" + roll2 + "=" + rolltotal);
                    break;
                    case "P": 
                    case "p": 
                    switch(card)
                    {
                        case 11:
                            switch(suit)
                            {
                                case 1: System.out.println("Jack of Hearts");
                                break;
                                case 2: System.out.println("Jack of Spades");
                                break;
                                case 3: System.out.println("Jack of Diamonds");
                                break;
                                case 4: System.out.println("Jack of Clubs");
                                break;
                            }
                            break;
                        case 12: 
                            switch(suit)
                            {
                                case 1: System.out.println("Queen of Hearts");
                                break;
                                case 2: System.out.println("Queen of Spades");
                                break;
                                case 3: System.out.println("Queen of Diamonds");
                                break;
                                case 4: System.out.println("Queen of Clubs");
                                break;
                            }
                            break;
                        case 13: 
                            switch(suit)
                            {
                                case 1: System.out.println("King of Hearts");
                                break;
                                case 2: System.out.println("King of Spades");
                                break;
                                case 3: System.out.println("King of Diamonds");
                                break;
                                case 4: System.out.println("King of Clubs");
                                break;
                            }
                            break;
                        case 1: 
                            switch(suit)
                            {
                                case 1: System.out.println("Ace of Hearts");
                                break;
                                case 2: System.out.println("Ace of Spades");
                                break;
                                case 3: System.out.println("Ace of Diamonds");
                                break;
                                case 4: System.out.println("Ace of Clubs");
                                break;
                            }
                            break;
                        default: 
                            switch(suit)
                            {
                                case 1: System.out.println(card + " of Hearts");
                                break;
                                case 2: System.out.println(card + " of Spades");
                                break;
                                case 3: System.out.println(card + " of Diamonds");
                                break;
                                case 4: System.out.println(card + " of Clubs");
                                break;
                            }
                            break;
                }
                break;
                default: System.out.println("You didn't respond correctly");
                break;
            }
            break;
        default: System.out.println(answer + " A single character is expected");
        break;
        }
    }
}
