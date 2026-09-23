# DISCOUNT7 - Rating 135

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Cake Discount

You buy $N$ cakes from Chef's bakery. Normally, each cake costs $100$ rupees.

However, Chef has a special discount offer. If you buy at least $5$ cakes, then you get a $15$ percent discount on all your bought cakes, i.e. each cake costs only $85$ rupees.

Find the cost, in rupees, that you paid for the $N$ cakes.

### Input Format
- The first and only line contains $1$ integer $N$.
### Output Format

Output the cost of buying $N$ cakes.

### Constraints
- $1 \le N \le 10$
### Sample 1:
Input
Output

```
4

```

```
400

```

### Explanation:

There is no discount since you bought $4$ cakes, and so you pay the whole $100$ rupees for each of them.

### Sample 2:
Input
Output

```
5

```

```
425

```

### Explanation:

Since you bought $5$ cakes, the discount is applied and each cake costs only $85$ rupees.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T14:21:34.588Z  

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
		int x = sc.nextInt();
        int cake = 100;
        int ans =0;
		if(x<=4){
		    ans = x*cake;
		} else ans = (x*85);
		
		System.out.println(ans);
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DISCOUNT7)