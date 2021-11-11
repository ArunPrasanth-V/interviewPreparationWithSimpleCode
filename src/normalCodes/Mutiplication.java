package normalCodes;

import java.util.Scanner;

public class Mutiplication
{
      public static void main(String arg[])
      {
    	  Scanner sc=new Scanner(System.in);
    	  int table,i=1,n;
    	  System.out.println("enter the table");
          table=sc.nextInt();
          System.out.println("how many time");
          n=sc.nextInt();
        while(i<=n)
          //for(c=1;c<=b;c++)
          {
        	  
        	  System.out.println("2 x "+i+ " = "+table*i);
        	  i++;
          }
        sc.close();
      }
}
