//Problem:1281
//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer

class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int prod=1;
        while(n!=0)
        {
           int dig=n%10;
            prod*=dig;
            sum+=dig;
            n/=10;
        }
        
        return (prod-sum);
        
        
    }
}