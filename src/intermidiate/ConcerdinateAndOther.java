package intermidiate;

public class ConcerdinateAndOther 
{
     public static void main(String args[])
     {
    	 addWords();
    	 replace();
    	 trim();
     }
     public static void addWords()
     {
    	 String s1="Arun ";
    	 String s2="Prasanth";
    	 System.out.println(s1+s2);
    	 System.out.println(">>>.........>>>");
    	 System.out.println(s1.concat(s2));
     }
     public static void replace()
     {
    	 String s1="Arun ";
    	 String s2="Prasanth";
    	 System.out.println(s1.replace('A','V'));
    	 System.out.println(s2.toUpperCase());
      }
     public static void trim()
     {
    	 String s1="     Arun      ";
    	 //String s2="   Prasanth    ";
    	 System.out.println(s1.trim());
    
     }
}
