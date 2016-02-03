/*
-Stephan Reyes
-CourseNumber Java Program
The semester during which a course is offered at Lehigh is 
given by a 6 digit number. The first four digits give the year,
and the last two digits give the semester: 10 spring, 
20 summer 1, 30 summer 2, and 40 fall. Write a program that 
reads in a 6 digit number, makes sure that it adheres to the 
above description, and then prints out the semester and year. 
*/
import java.util.Scanner; //imports Scanner in order to have the user type their values

public class CourseNumber
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in); //declares an instance of the Scanner object and constructs an instance of the Scanner class that was declared
        System.out.print("Enter a six digit number giving the course semester- "); // tells the user to enter a sixdigit value with the course semester at the end
        boolean sixdigits = input.hasNextInt(); //allows user to select the sixdigit value + course semester of their choosing
        if(input.hasNextInt()) // checks to see if the value is an integer
        {
            int digits = input.nextInt();
            if ((digits < 186510) || (digits > 201440))// if the value inputed by the user is less than 186510 or greater than 201440; then the system let's the user know and the prorgam is terminated
            {
                System.out.println("The number was outside the range [186510,201440]");
            }
            else 
            { 
                if (digits % 100 == 10) // if the value inputed is within the given range of 186510 to 201440; then the last two digits of the value are checked and if those digits equal 10, then the coure was offered in the Spring of the year given by the first four digits of the value
                {
                    System.out.println("The course was offered in the Spring semester of " + digits %1000000/100);
                }
                if (digits % 100 == 20) // if the value inputed is within the given range of 186510 to 201440; then the last two digits of the value are checked and if those digits equal 20, then the coure was offered in the Summer 1 of the year given by the first four digits of the value
                {
                    System.out.println("The course was offered in the Summer 1 semester of " + digits %1000000/100);
                }
                if (digits % 100 == 30) // if the value inputed is within the given range of 186510 to 201440; then the last two digits of the value are checked and if those digits equal 10, then the coure was offered in the Summer 2 of the year given by the first four digits of the value
                {
                    System.out.println("The course was offered in the Summer 2 semester of " + digits %1000000/100);
                }
                if (digits % 100 == 40) // if the value inputed is within the given range of 186510 to 201440; then the last two digits of the value are checked and if those digits equal 10, then the coure was offered in the Fall of the year given by the first four digits of the value
                {
                    System.out.println("The course was offered in the Fall semester of " + digits %1000000/100);
                }
                if ((digits % 100 < 10) || ((digits % 100 > 10) && (digits % 100 < 20)) || ((digits % 100 > 20) && (digits % 100 < 30)) || ((digits % 100 > 30) && (digits % 100 < 40)) || (digits % 100 > 40)) // if the value's last two digtis are greater than 40; then the system let's the user know that the last two digits must correspond to a proper course semester
                {
                    System.out.println(digits % 100 + " is not a legitimate semester");
                }
            }
        }
        else
        {
            System.out.println("You did not enter an int"); // if the value was not an integer; else- let's the user know and terminates the program
        }
    }
}