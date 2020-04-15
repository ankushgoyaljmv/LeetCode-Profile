//Problem:
//https://leetcode.com/problems/binary-search

class Solution {
    public int search(int[] nums, int target)
    {
      int n=nums.length;
      
        if(n==0)
            return -1;
                   
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
                return mid;
            
            //first half
            else if(target<nums[mid])
                high=mid-1;
            
            //second half
              else
                  low=mid+1;
            
        }
        return -1;
    }
}
