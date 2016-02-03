/* 
Stephan Reyes
Arrays
*/
import java.util.Scanner;

public class Arrays
{
    public static void main(String[] args) 
    {
        int numbers[];
        int x = 10;
        numbers = new int [x];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 digits: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int f = input.nextInt();
        int g = input.nextInt();
        int h = input.nextInt();
        int i = input.nextInt();
        int j = input.nextInt();
        numbers[0] = a;
        numbers[1] = b;
        numbers[2] = c;
        numbers[3] = d;
        numbers[4] = e;
        numbers[5] = f;
        numbers[6] = g;
        numbers[7] = h;
        numbers[8] = i;
        numbers[9] = j;
        int y = 0;
        int highest = numbers[0];
        int sum = 0;
        int lowest = numbers[0];
        for (y = 0; y < x; y++)
        {
            if (numbers[y] > highest)
            {
                highest = numbers[y];
            }
            if (numbers[y] < lowest)
            {
                lowest = numbers[y];
            }
            sum+=numbers[y];
        }
        System.out.println("The highest entry is: " + highest);
        System.out.println("The lowest entry is: " + lowest);
        System.out.println("The sum is " + sum);
        int k = 0;
        int l = numbers.length - 1;
        for (y = 0; y < x; y++)
        {
            System.out.print(numbers[y]+ " ");
            if (l >= k)
            {
               System.out.print(numbers[l]);
               l--;
            }
            System.out.println();
        }
    }
}
        