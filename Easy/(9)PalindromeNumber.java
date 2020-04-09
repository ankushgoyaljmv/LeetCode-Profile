//Problem 9:
//https://leetcode.com/problems/palindrome-number

class Solution {
    public boolean isPalindrome(int x) {
        
    
        int rev=0;
        int temp=x;
                
        while(x!=0)
        {
            int rem=x%10;
            rev =rev*10+rem;
            x/=10;
            
        }

        if(temp>=0 && temp==rev)
            return true; 
        else
            return false;
       
    }
}
