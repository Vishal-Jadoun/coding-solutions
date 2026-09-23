# NEWYEAR - Rating 125

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Happy New Year!

Currently, it is $X:00$ hours on December $31^{st}$ and you are wondering how many hours are left till midnight.

For the purposes of this problem, we use a $24$ hour system. So, $X$ can range from $0$ to $23$, and you need to tell the number of hours left till $00:00$ of the next day.

### Input Format
- The first and only line of input contains a single integer $X$.
### Output Format

For each test case, output on a new line the number of hours left till midnight

### Constraints
- $0 \le X \le 23$
### Sample 1:
Input
Output

```
0

```

```
24
```

### Explanation:

Right now, its $\text{00:00}$ or $12$ AM on $31^{st}$ December. That means a whole day, i.e. $24$ hours is left till the new year.

### Sample 2:
Input
Output

```
23

```

```
1
```

### Explanation:

It is $\text{23:00}$ or $11$ PM. Only $1$ hour is left!

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T14:08:30.689Z  

```cpp
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
		int time = 24;
        int ans = time -a;
        System.out.println(ans);

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/NEWYEAR)