package normalCodes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingAFile
{
	public static void main(String args[]) throws IOException
    {
        String fileContent="";
    	File file =new File("C:\\\\Users\\\\ADMIN\\\\Desktop\\\\LOOP and there Function.txt");
    	Scanner sc =new Scanner(file);
    	
    	while(sc.hasNextLine())
    	{
    	
    		fileContent=fileContent.concat(sc.nextLine()+"\n");
    	}
    	FileWriter writer=new FileWriter("C:\\\\Users\\\\ADMIN\\\\Desktop\\\\LOOP and there Function.txt");
    	writer.write(fileContent);
    	writer.close();
    	sc.close();
    }
}
