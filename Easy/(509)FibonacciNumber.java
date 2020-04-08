//Problem:
//https://leetcode.com/problems/fibonacci-number

class Solution {
    //Iterative Code:
    public int fib(int N) {
        
        
        int a=0;
        int b=1;
      
         for(int i=1;i<=N;i++)
         {
              int c=a+b;
              a=b;
              b=c;             
         }
        return a;
        
    }
}

   //Recursive Code

    // public static int fib(int n) {
    //     if (n==0 || n==1)
    //         return n;
    //     else
    //         return fib(n-1)+fib(n-2);
    // }
