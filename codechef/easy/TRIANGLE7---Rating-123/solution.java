import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans=0;
		if (a+b<180){
		    ans = 180-(a+b);
		} else System.out.println("invalid input");
        System.out.println(ans);
	}
}
