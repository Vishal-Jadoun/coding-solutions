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
        int cake = 100;
        int ans =0;
		if(x<=4){
		    ans = x*cake;
		} else ans = (x*85);
		
		System.out.println(ans);
	}
}
