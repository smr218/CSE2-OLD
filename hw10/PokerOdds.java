import java.util.Random;
import java.util.Scanner;
public class PokerOdds
{
    public static void showHands()
    {
        Scanner scan = new Scanner (System.in);
        String answer = "";
        do
        {
            //makes a string of 52 with each part of the string defined
            String deck[] = {"Ace","King","Queen","Jack","10","9","8","7","6","5","4","3","2","Ace","King","Queen","Jack","10","9","8","7","6","5","4","3","2","Ace","King","Queen","Jack","10","9","8","7","6","5","4","3","2","Ace","King","Queen","Jack","10","9","8","7","6","5","4","3","2"};
            String hand[] = new String [5]; 
            String Clubs = "Clubs: ";//intial print line for clubs
            String Diamonds = "Diamonds: ";//initial print line for diamonds
            String Hearts = "Hearts: ";//initial print line for hearts
            String Spades = "Spades: ";//initial print line for spades
            int counter = 0;
            for(int x = 0; x < hand.length; x++)// as long as this is less than the length of hand, continues then increments 
            {
                counter = 0;
                do// makes a random int and checks to see if it's string is -1 and if it is then in creates another random int and if it isn't then it assigns that value to a card # and type
                {
                    int random = (int)(Math.random()*52);
                    if (deck[random] != "-1")
                    {
                        hand[x]=deck[random];
                        deck[random]= "-1";
                        counter++;
                    if (random >=0 && random<= 12)
                    {
                        Clubs = Clubs + " " + hand[x];
                    }
                    if (random >=13 && random<= 25)
                    {
                        Diamonds = Diamonds + " " + hand[x];
                    }
                    if (random >=26 && random<= 38)
                    {
                        Hearts = Hearts + " " + hand[x];
                    }
                    if (random >=39 && random<= 51)
                    {
                        Spades = Spades + " " + hand[x];
                    }
                    }
                }
                while (counter == 0);
            }
            System.out.println(Clubs);
            System.out.println(Diamonds);
            System.out.println(Hearts);
            System.out.println(Spades);
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");// allows the user to get a new hand
            answer=scan.next();
        }
        while(answer.equals("Y") || answer.equals("y"));
    }
    public static void simulateOdds()
    {
        int y = 0;
        String deck[] = {"Ace","King","Queen","Jack","10","9","8","7","6","5","4","3","2","Ace","King","Queen","Jack","10","9","8","7","6","5","4","3","2","Ace","King","Queen","Jack","10","9","8","7","6","5","4","3","2","Ace","King","Queen","Jack","10","9","8","7","6","5","4","3","2"};
        String hand[] = new String [5]; 
        String Clubs = "Clubs: ";//intial print line for clubs
        String Diamonds = "Diamonds: ";//initial print line for diamonds
        String Hearts = "Hearts: ";//initial print line for hearts
        String Spades = "Spades: ";//initial print line for spades
            
        String decks[] = {"Ace","King","Queen","Jack","10","9","8","7","6","5","4","3","2","Ace","King","Queen","Jack","10","9","8","7","6","5","4","3","2","Ace","King","Queen","Jack","10","9","8","7","6","5","4","3","2","Ace","King","Queen","Jack","10","9","8","7","6","5","4","3","2"};
        String hands[] = new String [5]; 
        String Clubs1 = "Clubs: ";//intial print line for clubs
        String Diamonds1 = "Diamonds: ";//initial print line for diamonds
        String Hearts1 = "Hearts: ";//initial print line for hearts
        String Spades1 = "Spades: ";//initial print line for spades
        while (y < 1000)
        {
            int counter1 = 0;
            for(int x = 0; x < hands.length; x++)// as long as this is less than the length of hand, continues then increments 
            {
                counter1 = 0;
                do// makes a random int and checks to see if it's string is -1 and if it is then in creates another random int and if it isn't then it assigns that value to a card # and type
                {
                    int random1 = (int)(Math.random()*52);
                    if (decks[random1] != "-1")
                    {
                        hands[x]=decks[random1];
                        decks[random1]= "-1";
                        counter1++;
                    if (random1 >=0 && random1<= 12)
                    {
                        Clubs1 = Clubs1 + " " + hands[x];
                    }
                    if (random1 >=13 && random1<= 25)
                    {
                        Diamonds1 = Diamonds1 + " " + hands[x];
                    }
                    if (random1 >=26 && random1<= 38)
                    {
                        Hearts1 = Hearts1 + " " + hands[x];
                    }
                    if (random1 >=39 && random1<= 51)
                    {
                        Spades1 = Spades1 + " " + hands[x];
                    }
                    }
                }
                while (counter1 == 0);
            }
            System.out.println(Clubs1);
            System.out.println(Diamonds1);
            System.out.println(Hearts1);
            System.out.println(Spades1);
            
            // is supposed to print out how many times it has repeated but it doesn't...
            for (int n=0; n < 1; n ++)
            {
            int a = 1;
            int b = 0;
            int i = 0;
            int d = 0;
            for(int c=0;c<hands.length-1;c++)
            {
                while (a < hands.length-1)
                {
                    if (hands[c]==hands[a])
                    {
                        b++;
                        a++;
                    }
                    while (a < hands.length-1)
                    {
                    if (hands[c]!=hands[a])
                    {
                        a++;
                    }
                    }
                }
                a = a - (hands.length - (c+ 2));
                if (b > 1)
                {
                    i++;
                }
                if (b == 0)
                {
                    i++;
                }  
                if (b ==1)
                {
                    d++;
                }
            }
                    System.out.println(hands[a] + " "+ d);
        System.out.println(i);
            }
// resets the arrays to original form
            decks = deck;
            hands = hand;
            Clubs1 = Clubs;
            Diamonds1 = Diamonds;
            Hearts1 = Hearts;
            Spades1 = Spades;
            y++;
            
        }
    }
    public static void main(String [] arg)
    {
        showHands();
        simulateOdds();
    }
}
