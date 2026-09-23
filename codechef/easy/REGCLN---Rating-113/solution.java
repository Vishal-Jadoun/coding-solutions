import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();

        int remainder = x%10;
        int ans = (remainder == 0) ? 10 : (10-remainder); 
        System.out.println(ans);

	}
}
