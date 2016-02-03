/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;
          n/=3;
          k-=7;
    }
          System.out.println( n + "," + k + "," + out);
    if(n*k%12< 12){
      n-=20;
      out+=n;
      System.out.println( n + "," + k + "," + out);
    }
    if(n*n>k){
      n=42;
      out+=n+k;
      System.out.println( n + "," + k + "," + out);
    }
    else {
      n=45;
      out+=n+k;
      System.out.println( n + "," + k + "," + out);
    }
    switch(n+k){
      case 114: 
        System.out.println(n+k);
        n-=11;
        k-=3;
        System.out.println( n + "," + k + "," + out);
        break;
      case 97:
        System.out.println(n+k);
        n-=14;
        k-=2;
        System.out.println( n + "," + k + "," + out);
        break;
      case 98:
        System.out.println(n+k);
        n/=5;
        k/=9;
        System.out.println( n + "," + k + "," + out);
      default:
      System.out.println(n+k);
        n-=3;
        k-=5;
        System.out.println( n + "," + k + "," + out);
    }
     out+=1/n + 1/k;   
  //  System.out.println(out);
  }
}

/*
 * Error report: n + k is equal to 98 and after running through the case statement there
  is no break thus causing it to fall through to the default statement, which makes k 0 and causes the error
 * 
 * 
 * 
 * 
 */
