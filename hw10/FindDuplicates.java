import java.util.Scanner;
public class FindDuplicates
{
     public static String listArray(int num[])
    {
        String out="{";
        for(int j=0;j<num.length;j++)
        {
            if(j>0)
            {
                out+=", ";
            }
            out+=num[j];
        }
        out+="} ";
        return out;
    }
    
    public static boolean hasDups(int dup[])
    {
        int a = 1;
        for(int x=0;x<dup.length;x++)
        {
            while (a < dup.length )
            {
                if (dup[x]==dup[a])
                {
                    return true;
                }
                if (dup[x]!=dup[a])
                {
                    a++;
                }
            }
        }
        return false;
    }
    public static boolean exactlyOneDup(int exdup[])
    {
        int a = 1;
        int b = 0;
        for(int x=0;x<exdup.length - 1;x++)
        {
            while (a < exdup.length)
            {
                if (exdup[x]==exdup[a])
                {
                    b++;
                    a++;
                }
                if (exdup[x]!=exdup[a])
                {
                    a++;
                }
            }
            a = a - (exdup.length - (x+ 2));
            if (b > 1)
            {
                return false;
            }
            if (b == 0)
            {
                return false;
            }
        }
       return true; 
    }
    public static void main(String [] arg)
    {
        Scanner scan=new Scanner(System.in);
        int num[]=new int[10];
        String answer="";
        do
        {
            System.out.print("Enter 10 ints- ");
            for(int j=0;j<10;j++)
            {
                num[j]=scan.nextInt();
            }
            String out="The array ";
            out+=listArray(num); //return a string of the form "{2, 3, -9}"   
            if(hasDups(num))
            {
                out+="has ";
            }
            else
            {
                out+="does not have ";
            }
            out+="duplicates.";
            System.out.println(out);
            out="The array ";
            out+=listArray(num);    
            if(exactlyOneDup(num))
            {
                out+="has ";
            }
            else
            {
                out+="does not have ";
            }
            out+="exactly one duplicate.";
            System.out.println(out);
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer=scan.next();
        }
        while(answer.equals("Y") || answer.equals("y"));
    }
}
