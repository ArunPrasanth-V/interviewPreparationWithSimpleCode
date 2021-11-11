package intermidiate;

public class FindIndexOfString {

	public static void main(String[] args) 
	{
           String st="aeyamarunhayamarun";
           System.out.println(st.indexOf('m'));//output is 4 because it only gives Starting index....
           System.out.println(st.indexOf('a',6));//output is 10 because it skips first 10 indexes
	}

}
