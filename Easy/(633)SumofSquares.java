//Problem:
//https://leetcode.com/problems/sum-of-square-numbers

class Solution {
	
	/******************Method 1*****************/
	 public boolean judgeSquareSum(int c)
    {
        if(c==0||c==1)
            return true;
		//Similar to Binary Search
		int a =0; 
        int b=(int) Math.sqrt(c);
		while (a <= b)
        {
			int sum = a * a + b * b;
			if (c == sum)
				return true;
			else if(sum < c)
				a++;
			else 
				b--;
		}
		return false;
	}
		
	/**************Method 2*//////////////////////
	
//     public boolean judgeSquareSum(int c)
//     {
		
// 		int a =0; 
//         int b=(int) Math.sqrt(c);
// 		while (a <= b)
//         {
// 			 int sum = a * a + b * b;
// 			if (c == sum)
//             {
// 				return true;
// 			}
// 			else if(sum < c)
//             {
// 				a++;
// 			}
// 			else 
//             {
// 				b --;
// 			}
// 		}
// 		return false;
// 	}
}
