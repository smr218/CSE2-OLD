/* 
Stephan Reyes
Array Arithmetic Program
*/
public class ArrayMath{

  public static void main(String [] args)
  {
    double x[]={2.3, 3, 4, -2.1, 82, 23},
    y[]={2.3, 3, 4, -2.1, 82, 23},
    z[]={2.3, 13, 14},
    w[]={2.3, 13, 14, 12},
    v[],
    u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+ " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+ " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+ " == "+display(z));
  }

  public static String display(double [] x)
  {
    String out="{";
    for(int j=0;j<x.length;j++)
    {
      if(j>0)
      {
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }

  public static boolean equals(double x[], double y[])
  {
      if(x.length==y.length)
      {
          for(int i=0; i<x.length; i++ )
          {
              if(x[i]!=y[i])
              {
                return false;
              }
          }
          return true;
      }
      else
      {
        return false;
      }
  }
  
  public static double[] addArrays(double x[], double y[])
  {
    if(x.length>y.length)
    {
      double v[]=new double[x.length];
      int j;
      for(j=0; j<y.length; j++)
      {
        v[j]=x[j]+y[j];
      }
      for(int k=j; k<v.length; k++)
      {
        v[k]=x[k];
      }
      return v;
    }
    else
    {
      double v[]=new double[y.length];
      int j;
      for( j=0; j<x.length; j++)
      {
        v[j]=x[j]+y[j];
      }
      for(int k=j; k<v.length; k++)
      {
        v[k]=y[k];
      }
      return v;
     }
  }
}