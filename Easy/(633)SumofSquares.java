//Problem:
//https://leetcode.com/problems/sum-of-square-numbers

class Solution {
    public boolean judgeSquareSum(int c)
    {
		
		int a =0; 
        int b=(int) Math.sqrt(c);
		while (a <= b)
        {
			 int sum = a * a + b * b;
			if (c == sum)
            {
				return true;
			}
			else if(sum < c)
            {
				a++;
			}
			else 
            {
				b --;
			}
		}
		return false;
	}
}