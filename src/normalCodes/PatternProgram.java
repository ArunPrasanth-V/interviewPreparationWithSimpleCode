package normalCodes;

import java.util.Scanner;

public class PatternProgram
{
	public static void main(String arg[])
	{
		  Scanner sc=new Scanner(System.in);
	      int i,j,num,v,k;     
	     do
	     {
	      
	      System.out.println("Enter The Number:");
	      num=sc.nextInt();
	      for(i=1;i<=num;i++)
	         {
	            for(k=num-i;k>0;k--)
	              {
	                System.out.print(" ");
	              } 
	            for(j=1;j<=i;j++)
	             {
	               System.out.print("1 ");
	             }
	               System.out.println();
	          }       
	          System.out.println("Press 1 to Continue");
	          v=sc.nextInt();
	     }while(v==1);
	     }
	   
	}