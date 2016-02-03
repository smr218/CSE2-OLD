/* 
Stephan Reyes
Roulette Java Program
I don’t usually go to gambling casinos, but I attended the birthday 
party of a friend at the Mohican Sun, in Connecticut. There I met 
another person attending the party who told me about how he gambles
at roulette. He brings $100 to the table and places a $1 bet on the
same (randomly selected) number for 100 spins of the roulette wheel. 
He claims that he often wins money with this “system.”  For this 
program, use a random number generator (recall Math.random()) to 
simulate this person’s betting on 100 spins, but run the simulation 
1000 times and collect data on the outcome. (As an alternative, you 
could buy a roulette wheel and spin it 100,000 times and record the 
results. Computer scientists prefer to simulate the outcome with a 
computer. Such simulations are called Monte Carlo simulations.)  
Roulette rules for betting on a single number are straightforward: 
There are 38 possible numbers. If my number comes up I am given $36.
For 100 spins, if my number comes up 3 or more times, I walk away w
ith 3x$36=$108 or more. Thus, if my number comes up at least 3 times
I win money; otherwise I lose money. For the 1000 repetitions of the
100-spin simulation, compute the number of times I lose everything 
(my number never comes up), compute the total winnings 
(of all simulations added together), and compute the number of 
times I walked away with a profit in one session of 100 spins of the wheel.
*/

public class Roulette
{
    
public static void main(String[]args)
    {
        int counter1 = 0;//counts for 1000- 100 spins
        int counter2 = 0;//counts for 100 spins
        int wins = 0;//amount of times you won
        int losses = 0;// amount of times you lost
        int profit = 0;// amount of money you lost or made
        int number = (int)(Math.random()*38);//random generate for the number you guess
        System.out.println(number);// prints the number you guess
        while (counter1 <1000)// counts up to 1000 - 100 spins
        {
            if (counter2 == 100) // when counter2 is 100 it drops back to 0
            {
                counter2 = 0;
            }
            while (counter2 < 100)// counts up to 100 spins
            {
                int roulette = (int)(Math.random()*38);// random generated spin for roulette
                counter2++;// counter2 goes up 1
                switch (roulette)
                {
                    case 37: System.out.print(" " + "00");// when it's 37 it prints 00
                    break;
                    default: System.out.print(" " + roulette);// otherwise print out the number
                    break;
                }
            if (number == roulette)// when the number you guess is equal to the number from the spin you win
            {
                wins++;
            }
            }
            counter1++;
        }
        profit = ((wins*36) - 100000);// the amount of money you get is the times you win multiplied by 36 dollars minus the 100000 for every game 
        losses = (100000- wins);
        System.out.println("");// seperates all the results from the final response
        System.out.println(" You made: $" + profit);// tells you how much you won or lost
        System.out.println(" You won a total of: " +  wins + " times out of 100000");// tell you how many times you won
        System.out.println( "You lost " + losses + " times");// tells you how many times you lost
    }
}
        