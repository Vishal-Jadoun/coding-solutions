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
		int y = sc.nextInt();
		int ans = 0;
		if (x>y){
		    ans = x-y;
		} else if (y>x){
		    ans=y-x;
		} else ans=0;
		
		System.out.println(ans);
		    
	}
}
