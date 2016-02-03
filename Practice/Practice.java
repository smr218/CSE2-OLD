import java.util.Scanner;

public class Practice
{
	public static void main(String[] args)
	{
	    /*
        int i;
        int temp = 1;
        for (i = 0; i <4; i++)
        {
            if (i != 0)
            {
                temp = temp*2;
            }
            for (int j = 0; j <i+1; j++)
            {
                for (int k = 0; k<j+1; k++)
                {
                System.out.print(temp);
                }
            System.out.println( );
            }
        }
          */
        int row = 0;
        int column = 5;
        int counter = 0;
        
            while (column > 0)
            {
                while (row < column)
                {
                    System.out.print(column);
                    row++;
                }
                System.out.println();
                column --;
                row = 0;
            }
          /*
            int rows = 1;
            int columns = 0;
            int counter = 1;
            
            while (counter < 9)
            {
                while (rows < counter +1)
                {
                    while (columns < rows)
                    {
                        columns++;
                        System.out.print(rows);
                    }
                    System.out.println();
                    columns = 0;
                    rows++;
                }
                System.out.println();
                counter = counter*2;
            
            }
            */  
        
	}
}