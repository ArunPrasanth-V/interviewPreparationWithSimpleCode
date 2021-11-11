package normalCodes;

import java.util.Scanner;

/*The rules States
 * 
 * "every year that is exactly divisible by 4 is a leap year , except for years that are exactly divisible
 * by 100,but these centurial year are the leap years if they are exactly divisible by 400.."
 * 
 *   to check the condition whether given year is leap year or not 
 *   
 *    if
 *      1.any year that is divisible by 400 is definitely a leap year 
 *      
 *    else if 
 *       2.if is divisible by 4 & non divisible by 100 thenit is a leap year 
 *      
 *     else
 *       3. not-leap year
 * 
 */
public class CheckLeapYear 
{
   public static void main(String arg[])
   {
	   
	 Scanner sc=new Scanner(System.in);
	 int year;
	 int c=0;
	 while(true)
	 {
		 System.out.println("Enter the Year");
		 year= sc.nextInt(); 
	    if(year%400==0)//we want to check for the remainder not cogent 
	       {
		       System.out.println("Leap Year"); 
       	   }
	   else if(year%4==0 && year !=0)
	       {
		        System.out.println("leap Year");
	       }
	   else
	       {
		        System.out.println("Not a Leap Year");
	       }
     
	 
	 
	  
	 }
//55	sc.close();
}
}

