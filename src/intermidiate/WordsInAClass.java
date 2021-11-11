package intermidiate;

public class WordsInAClass 
{

}
class Eagle extends WordsInAClass
{
	public void sing()
	{
		System.out.println("sings!..!");
	}
	public static void main(String args[])
	{
		Eagle e=new Eagle();
		System.out.println(e instanceof WordsInAClass);
	}
}
