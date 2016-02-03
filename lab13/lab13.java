/* 
Stephan Reyes
lab13 Program
*/
public class lab13
{
    public static void main (String args[])
    {
        int i = 0;
        int y = 0;
        int z = 0;
        int counter = 0;
        int x[][] = new int [y][i];
        for (y = 0; y < 5; y ++);
        {
            i = y*3 + 5;
            for (z = 0; z<x[i].length; z++)
            {
                counter = (int)(Math.random()*39);
                x[y][z] = counter;
            }
        }
        java.util.Arrays.sort(x);
        System.out.println(x);
    }
}