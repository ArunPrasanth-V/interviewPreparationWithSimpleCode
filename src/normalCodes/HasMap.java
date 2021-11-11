package normalCodes;
import java.util.*;

public class HasMap
{
	public static void main (String args[])
	{
    String sentence ="hey hei hello";
    Scanner sc =new Scanner(sentence);
    ArrayList<String>words=new ArrayList<String>();
    while(sc.hasNext())
    {
    	words.add(sc.next());
    }
    System.out.println(words);
   }
}