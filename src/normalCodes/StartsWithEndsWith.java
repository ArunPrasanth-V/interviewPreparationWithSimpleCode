package normalCodes;
public class StartsWithEndsWith 
{
   public static void main(String args[])
   {
	   firstWord();
	   lastWord();
   }
   
   
   public static void firstWord()
   {
   String words[]= {"funk","fuu","cheek","keek"};
	   for(String w:words)//enhanced for loop
	   {
		   if(w.startsWith("fu"));
		   {
			   System.out.println(w+"    start with fu");
		   }
	   }
   }   
   public static void lastWord()
   {
	   String words[]= {"funk","fuu","cheek","keek"};

	   for(String w:words)//enhanced for loop
	   {
		   if(w.endsWith("ek"));
		   {
			   System.out.println(w+"     this words are starts fu");
		   }
	   }  
   }
  
}
