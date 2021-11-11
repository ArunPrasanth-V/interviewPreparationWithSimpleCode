package normalCodes;

import java.io.*;
import java.util.*;
public class FileReader 
{
    public static void main(String args[]) throws IOException
    {
        //String fileContent="";
    	File file =new File("C:\\\\Users\\\\ADMIN\\\\Desktop\\\\LOOP and there Function.txt");
    	Scanner sc =new Scanner(file);
    	
    	while(sc.hasNextLine())
    	{
    	    System.out.println(sc.nextLine());
    	}
    	
    	sc.close();
    }
}