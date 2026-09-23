# SHOM - Rating 135

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Missing Shoes

Chef owns several pairs of shoes, unfortunately he has so many that he lost track of them!

Each pair of shoes consists of one left shoe and one right shoe.
Looking at his collection, Chef counts $L$ left shoes and $R$ right shoes.

What's the minimum number of shoes Chef is missing?

### Input Format
- The only line of input will contain two space-separated integers $L$ and $R$ – the number of left shoes and right shoes, respectively.
### Output Format

Output a single integer: the minimum number of shoes Chef is missing.

### Constraints
- $1 \leq L, R \leq 10$
### Sample 1:
Input
Output

```
1 3

```

```
2
```

### Explanation:

There's one left shoe and three right shoes.
The single left shoe can be paired with one right shoe, leaving two unpaired right shoes. So, the answer is $2$.

### Sample 2:
Input
Output

```
5 5

```

```
0
```

### Explanation:

There are an equal number of left and right shoes, so it's possible to pair them all up.

### Sample 3:
Input
Output

```
8 3

```

```
5
```

### Explanation:

There are $8$ left shoes and $3$ right shoes.
Each right shoe can be paired up with one left shoe, which leaves $5$ left shoes unpaired.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T14:16:07.535Z  

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

```

---

[View on CodeChef](https://www.codechef.com/problems/SHOM)