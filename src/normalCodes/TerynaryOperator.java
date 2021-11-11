package normalCodes;

import java.util.Scanner;

public class TerynaryOperator 
{
	public static void main(String arg[])
	{
		 int a,b;
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the A Number");
	    	a=sc.nextInt();
	    	System.out.println("Enter the B Number");
	    	b=sc.nextInt();
	    	String c=a<b?"B is Grater":"A is Grater";//it says A is <less then B  
	//it will check the condition is true or flase 
	 //if it is true it will excute the first part
	    	//else second part... .
	    	System.out.println(c);
	}

}
