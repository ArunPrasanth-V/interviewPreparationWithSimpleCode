package normalCodes;
import java.util.Scanner;

public class AlpabetPattern
{
	public static void main(String args[])
    {
   	Scanner sc=new Scanner(System.in);
   	char ch,chr,c1;
   	int i;
   	
   	do
   	{
   		System.out.println("enter the char you want to print(capital)");
      	c1=sc.next().charAt(0);
		
       	for(ch='A';ch<=c1;ch++)
		    	{
		    		for(chr='A';chr<=ch;chr++)   //note plz enter the capital letter
				    	{
				    		System.out.print(chr);
				    	}
		    		System.out.println();
		    	} 
		    	System.out.println("press one to continue");
		    	i=sc.nextInt();
   	}while(i==1);
    

    }
}
