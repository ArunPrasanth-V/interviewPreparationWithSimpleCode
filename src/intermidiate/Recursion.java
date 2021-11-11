package intermidiate;

public class Recursion
{
    public static void main(String args[])
    {
    	System.out.println(fact(9));
    }
    public static long fact(long n)
    {
    	if(n<=1)
    	{
    		return 1;
    	}
    	else
    	{
    		return n*fact(n-1);
    	}
    }
}

/*
 *5!=120
 *5.4! (5!)=120
 *4.3! (4!)=24
 *3.2! (3!)=6
 *2.1! (2!)=2
 *1!   (1!)=1 
 */
