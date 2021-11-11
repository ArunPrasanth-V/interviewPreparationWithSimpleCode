package normalCodes;

import java.util.Scanner;

public class BiggestOfThreeNumber
{
   public static void main(String arg[])
   {
	   Scanner sc=new Scanner(System.in);
	   int a,b,c;
	   int d;
	do          
	   {
	   
	   System.out.println("Enter A value");
	   a=sc.nextInt();
	   System.out.println("Enter B value");
	   b=sc.nextInt();
	   System.out.println("Enter C value");
	   c=sc.nextInt();
	   
	
	     if(a>b && a>c)
	          {
	    	  System.out.println("a is greater") ; 
	          }
	     else if(b>a && b>c)
	          {
	    	  System.out.println("b is greater");
	          }
	     else
	          {
	    	     System.out.println("c1 is greater");
	          }
	         System.out.println("Press 1 to Continue");
	         d=sc.nextInt();
       }while(d==1);
     sc.close();
   }
}
