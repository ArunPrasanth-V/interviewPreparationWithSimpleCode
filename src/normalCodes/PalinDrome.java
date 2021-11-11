package normalCodes;
import java.util.Scanner;
/* The PalinDrome are 12321,121,1234321.....
 *  I Learned this Program From SimpleSnippets YouTube Chennal...... 
 * 
 * 121 -> 121 left to right & right to left are same....
 * 
 * Here while loop is used to reavese the Number...
 * after the while loop the rev no. will be calculated  We use temp WE cannot use the num because in mathmatical we change the num value so, we use the temp to
 * store temprary variable if the temp is == to rev then it is palindrome...
 * 
 */
public class PalinDrome
{
   public static void main(String args[])  //I Love When main method is sort..
   {
	   //it bring oops concepts when the all are object. . . . :)
	   PalinDrome call=new PalinDrome(); //using the constructor to call that method 
	   
	   }
   PalinDrome()
   {
	   Scanner sc=new Scanner(System.in);
		  int num;//you can also use scanner 
		  System.out.println("Enter The Number");
		  num=sc.nextInt();
		  int rev=0;
		  int temp=num;
		  {
		  while(num>0)
		  {
			rev=rev*10 ;
			rev=rev+num % 10;
			num=num/10;
		  }
		  if(rev==temp)
		  {
			  System.out.println("Palindrome");
		  }
		  else
		  {
			  System.out.println("Not a Palindrome");
		  }
		  sc.close();
	   }
   }
}
/*
 * num=121
 * rev=0
 * temp=121
 * 
 * check the condition if num is greater then zero or not ....it is greater then zero...
 * 
 * step1
 * rev=0->(rev=rev*10)
 * rev=0+1=1->(rev=rev+num%10) ***121%10=1 in integer***....it will tramcate that fractional part..
 * num=121/10=12.1 -> (num=num/10)
 * 
 *  step2(it will check the num is greater then zero it's true then it will repeat the same stuff..)
 *  rev=1*10=10->(rev=rev*10) ..(the rev current value is 10)
 *  rev=10+2=12->(rev=rev+num%10)
 *  num=1->(num=num/10)
 *  
 *  step3
 *  rev=120->(rev=rev*10)
 *  rev= 120+1=121-> (rev=rev+num%10)it will got the reverse number...
 *  num=0.->(num=num/10)
 *  
 */
