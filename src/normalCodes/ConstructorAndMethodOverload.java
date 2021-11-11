package normalCodes;
import java.util.*;

public class ConstructorAndMethodOverload//its an example of the constructor overloading
{
	Scanner sc=new Scanner(System.in);
	public String color;
	public char size;
	/*
	 * in this program we will do the Constructor OverLoading &method overloading 
	 * i note one think in the method we use scanner Function but it ask the scanner cls inside 
	 * method
	 */
	
public static void main(String args[])
	{
	ConstructorAndMethodOverload s=new ConstructorAndMethodOverload('M');
	ConstructorAndMethodOverload scm=new ConstructorAndMethodOverload();
		//s.putOn();
		//s.putOff();
	ConstructorAndMethodOverload();
	int a=10,b=15;
	System.out.println (a+b);
	}
   
			ConstructorAndMethodOverload()
			{
				System.out.println("In Constructure enter the A");
				int a=sc.nextInt();
				System.out.println("enter the B");
				int b=sc.nextInt();
				int c=a%b;
			 System.out.println("hey!!"+c);
			}
			ConstructorAndMethodOverload(char ch)
			{
			 System.out.println("AM a NON Perameterized Constructure");
			}


		public static void ConstructorAndMethodOverload()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("AM a Method ");
			System.out.println("enter the A");
			int a=sc.nextInt();
			System.out.println("enter the B");
			int b=sc.nextInt();
			int c=a%b;
		 System.out.println(":{"+c);
			
			
		}
		public static void putOff()
		{
			System.out.println(" Am a method 2");
		}

}	    