package normalCodes;

import java.util.Scanner;

public class AddOrEven 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a, b;
		do
		{
			 System.out.println("Enter the no.:");
		     a=sc.nextInt();
             if(a%2==0)
             {
                	 System.out.println("Even Number");
             }
             else
             {
        	        System.out.println("odd Number");
             }
               System.out.println("\nPress 1 to Continue:");
               b=sc.nextInt();
		}while(b==1);
      sc.close();
	}

}
