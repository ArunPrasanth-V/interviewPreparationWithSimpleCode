package normalCodes;

import java.util.Scanner;

/*
 * fibonacci Series are 0 + 1 + 1 +2 + 3 + 5 + 8 + 13 + 21
 *                       ---^---^-=^^ 
 */
public class FibonacciSeries 
{
    public static void main(String args[])
    {
    	Scanner sc =new Scanner(System.in);
    	int a=0;
    	int b=1;
    	int c,n,m=0;
    	do {
    	          System.out.println("Enter the Number:");
    	          n=sc.nextInt();
    	   for(int i=0;i<n;i++)
    	      {
    		      System.out.print(a+" + " );
    		      c = a+b;
    		      a=b;
    		      b=c;
    		    
               }
    	   System.out.println("\n\nPress 1 to Continue..");
    	   m=sc.nextInt();
    	  
           }while(m==1);
    sc.close();
    }
}
/*initial       step-1          step-2     step-3       step-4     step-5    step-6
 * i             i=0            i=1         i=2         i=3        i=4        i=5
 * c             c=0+1=1        c=1+1 =2    c=1+2=3     c=2+3=5    c=3+5=8    c=5+8=13
 * a=0           a=1            a=1         a=2         a=3        a=5        a=8
 * b=1           b=1            b=2         b=3         b=5        b=8        b=13
 * output
 *       see the a its output 
 * 
 * 
 */
