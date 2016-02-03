/* 
Stephan Reyes
BoolaBoola Java Program
Write a program that has three boolean variables to each of which the 
value of true or false is randomly assigned. Then, at random, combine the 
three variables with random choices of && and || and stores the result. 
For example, one might have the expression true && false || true 
(there are 32 possible expressions, so I will not list all the 
possibilities). The program should then present the expression to the 
user and ask the user to state the result of of the expression. 
*/
import java.util.Scanner;

public class BoolaBoola
{
    
public static void main(String[]args)
    {
        boolean v1 = true;// a value to be assigned true or false but set as true by default
        boolean v2 = true;// a value to be assigned true or false but set as true by default
        boolean v3 = true;// a value to be assigned true or false but set as true by default
        boolean ans = true;// a value to be express the result of the random expression but set as true by default
        boolean p; // a value to compare the response of the user to the answer of the random expression
        int random1 = (int)(Math.random()*2);// randomly chooses between 0 and 1
        int random2 = (int)(Math.random()*2);// randomly chooses between 0 and 1
        int random3 = (int)(Math.random()*2);// randomly chooses between 0 and 1
        int random4 = (int)(Math.random()*2);// randomly chooses between 0 and 1
        int random5 = (int)(Math.random()*2);// randomly chooses between 0 and 1
        int random6 = (int)(Math.random()*2);// randomly chooses between 0 and 1
        String q = "null";// a string for the question that is assigned "null" by default
        String x;// string x for && or ||
        String a;// string a for && or ||
        switch (random1)
        {
            case 0: v1 = true;// sets boolean v1 as true if random = 0
            break;
            case 1: v1= false;// sets boolean v1 as false if random = 1
            break;
        }
        switch (random3)
        {
            case 0: v2= true;// sets boolean v2 as true if random = 0
            break;
            case 1: v2= false;// sets boolean v2 as false if random = 1
            break;
        }
        switch (random5)
        {
            case 0: v3= true;// sets boolean v3 as true if random = 0
            break;
            case 1: v3 = false;// sets boolean v3 as false if random = 1
            break;
        } 
        switch(random2)// random2 sets all the ||'s and &&'s and then prints out the question and checks to see if the response is correct
        {
            case 0: 
                    a = new String("||");
                switch(random4)
                {
                    case 0:
                        x = new String("||");
                        q = ("Does "+ v1 + " " + a + " " + v2 + " " + x + v3 + " have the value true(t/T) or false(f/F)?: ");
                       ans = v1 || v2 || v3;
                      break;
                 
                    case 1: 
                         x = new String("&&");
                         q = ("Does "+ v1 + " " + a + " " + v2 + " " + x + v3 + " have the value true(t/T) or false(f/F)?: ");
                         ans = v1 || v2 && v3;
                        break;
                }
                break;

               case 1:
                  a = new String("&&");
                  switch(random6)
                {
                    case 0:
                        x = new String("||");
                    
                   q = ("Does "+ v1 + " " + a + " " + v2 + " " + x + v3 + " have the value true(t/T) or false(f/F)?: ");
                 ans = v1 && v2 || v3;
                 break;
                 
                 case 1:
                      x = new String("&&");
                    
                  q = ("Does "+ v1 + " " + a + " " + v2 + " " + x + v3 + " have the value true(t/T) or false(f/F)?: ");
                 ans = v1 && v2 && v3;
                 break;
                     
                }
                break;
        }
                
                Scanner input = new Scanner(System.in);//declares an instance of the Scanner object and constructs an instance of the Scanner class that was declared
                System.out.print(q);
                if (input.next().equals("true"))
                {
                    p = true;
                }
                else
                {
                    p = false;
                }
                
                if (p = ans)
                {
                    System.out.println("Correct");
                }
                else
                {
                    System.out.println("Wrong; try again");
                }
        }
}
        
       