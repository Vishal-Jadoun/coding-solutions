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
		int c = sc.nextInt();
		
		int score1 = a*3; 
		int score2 = b*1; 
		int score3= c*0;
		
		int total = score1+score2+score3;
		
		System.out.println(total);
	}
}
