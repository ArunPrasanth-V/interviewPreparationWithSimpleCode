package normalCodes;

import java.util.Random;

public class TwoDArray 
{
	public static void main(String args[])
	{
	    int[][] latteryTicket = {{2,3,4},   //type 1
	    		                {54,32,33},
	                            {44,43,33}};
	    
	    int [][]latteryTicket2 =new int[3][3];
	     latteryTicket2[0][0]=2;             //type 2
	     latteryTicket2[0][1]=3;       //we Also use type 2 but is store manually
	     latteryTicket2[0][2]=4;        
	     latteryTicket2[1][0]=54;
	     latteryTicket2[1][1]=32;       //[row][column]
	     latteryTicket2[1][2]=33;       //YOu remember That is array --ray->row FIRST..next COLUMN
	     latteryTicket2[2][0]=44;
	     latteryTicket2[2][1]=43;
	     latteryTicket2[2][2]=33;
	     Random rc =new Random();
           int cpuPos=rc.nextInt(9);
           System.out.println(cpuPos);
         System.out.println("__________________");
         for(int i=0;i<3;i++)
	             {
        	
	            	for (int j=0;j<3;j++)
	            	{
	            		System.out.print(latteryTicket2[i][j]);
	            	}
	            	System.out.println();
	             }
	}
}
