//problem:
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits

class Solution {
    public int findNumbers(int[] ar) {
        int count=0;
        int ctr=0;
        for(int ele:ar)
        {    
            while(ele!=0)
            {
                ele/=10;
                count++;
            }
            if(count%2==0)
                ctr++;
            count=0;
        }
        return ctr;
        
        
        
    }
}