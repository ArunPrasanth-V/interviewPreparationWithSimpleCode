package intermidiate;

import java.util.Scanner;

public class MaxAndMinArray 
{
   public static void main(String args[])
   {
	   maxMin();   
   }
   public static void maxMin()
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array :");
	
    int size=sc.nextInt();//5
    if(size<=0)
    {
    	System.out.println("invaild number");
    	System.exit(0);
    }
	System.out.println("Enter the num You want to enter :");
     int arr[]=new int[size];
     for(int i=0;i<size;i++)
     {
    	 arr[i]=sc.nextInt();
     }
     
    //Minimum value
     int min=arr[0];
     int max=arr[0];
    for(int i=0;i<size;i++)
     
     {
    	 if(min>arr[i])
    	 {
    		 min=arr[i];
    	 }
    	 if(max<arr[i])
    	 {
    		 max=arr[i];
    		 
    	 }
     }
     System.out.println("The min element  "+min);
     System.out.println("The max element  "+max);
    
sc.close();
}
}
