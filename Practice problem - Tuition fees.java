import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
	    Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
            // Accept 2 integers inputs
        	int x = read.nextInt();
        	int y = read.nextInt();
        	
            int result=x*y;
		    System.out.println(result);
		}
	}
