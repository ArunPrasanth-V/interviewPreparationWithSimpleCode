package intermidiate;

import java.util.Scanner;

public class CompreTwoWords 
{
	public static void main(String args[])
    {
  	    
  	   Scanner sc=new Scanner(System.in);
  	   System.out.println("Enter the word1 ");
 	   String word1=sc.nextLine();
       System.out.println("Enetr the word2");
 	   String word2=sc.next();
 	   if(word1.compareTo(word2)>0)
 	   {
 		   System.out.println("word1 is greater");
 	   }
 	   if(word1.compareTo(word2)<0)
 	   {
 		   System.out.println("word2 is greater");
 	   }
 	   if(word1.compareTo(word2)==0)
 	   {
 		   System.out.println("The two word Equal");
 	   }

    

	sc.close();
}
}