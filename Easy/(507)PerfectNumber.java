//Problem:507
//https://leetcode.com/problems/perfect-number

class Solution {
    public boolean checkPerfectNumber(int n) 
    {
        base Case:
        //Number Can be Negative
        if(n<=0)
            return false;
    
        int res=0;
        for(int div=1;div<=n/2;div++)
        {
             
            if(n%div==0)
            {
             res=res+div;   
            }
            
        }
              return n==res;
        
    }
}
