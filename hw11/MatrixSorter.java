public class MatrixSorter
{
    public static int [][][] buildMat3d()
    {
        int size = 0;
        int size2 = 0;
        int [][][] array = new int [3][][];
        for (int a=0; a <3; a++)
        {
            size = 3+2*a;
            array[a]=new int [size][];
            for (int b = 0; b < size; b++)
            {
                size2 = a+b+1;
                array[a][b]=new int [size2];
                for (int c = 0; c < size2; c++)
                {
                    int x = (int)(Math.random()*99)+1;
                    array[a][b][c] = x;
                }
            }
        }
        return array;
    }
    public static void show(int[][][]x)
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3+2+i; j++)
            {
                for(int k = 0; k < i+j+1; k++)
                {
                    System.out.print(x[i][j][k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static int findMin(int[][][] y)
    {
        int min= Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3+2+i; j++)
            {
                for(int k = 0; k < i+j+1; k++)
                {
                    if (y[i][j][k]< min)
                    {
                        min = y[i][j][k];
                    }
                }
            }
        }
        return min;
    }
    public static void sort(int[][]z)
    {
        int answer = 0;
        for (int a = 0; a < z.length; a++)
        {
            for (int b = 1; b < z[a].length; b++)
            {
                for(int c = 0; c < z[a].length; c++)
                {
                    if (z[a][b] < z[a][c])
                    {
                        answer = z[a][b];
                        z[a][b]  = z[a][c];
                        z[a][c] = answer;
                    }
                }
            }
        }
    }
    public static void main(String arg[])
    {
        int mat3d[][][];
        mat3d=buildMat3d();
        show(mat3d);
        System.out.println("The smallest entry in the 3D matrix is "+ findMin(mat3d));
        System.out.println("After sorting the 3rd matrix we get");
        sort(mat3d[2]);
        show(mat3d);
    }
}
