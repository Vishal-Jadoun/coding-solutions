# TRIANGLE7 - Rating 123

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Triangles

It is well known fact in mathematics that the sum of the $3$ angles in a triangle is $180$ degrees.

You had a triangle, but unfortunately you only remember the $1^{st}$ and $2^{nd}$ angles of it, and you have forgotten the $3^{rd}$ one.

Given that the first angle was $A$, and the second was $B$, can you figure out the third one? All angles are integers measured in degrees.

### Input Format
- The first and only line of input contains $2$ integers - $A$ and $B$.
### Output Format

Print a single integer - the measure of the $3^{rd}$ angle (in degrees).

### Constraints
- $1 \le A, B \lt 180$
- $A + B \lt 180$
### Sample 1:
Input
Output

```
60 60

```

```
60

```

### Explanation:

It is an equilateral triangle, and has all angles equal.

### Sample 2:
Input
Output

```
1 1

```

```
178

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T14:06:48.748Z  

```java
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

```

---

[View on CodeChef](https://www.codechef.com/problems/TRIANGLE7)