//Problem:
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
		List<Boolean> ans = new ArrayList<Boolean>();
        
        int max = Integer.MIN_VALUE;
        
        for(int n : candies) 
        {    
            max = Math.max(max,n);// efficient way of finding max
        }
        
        for(int n : candies) 
        {
            ans.add(n+extraCandies >= max);// automatically deicde wether it was true or alse
        }
        
        return ans;
    }
}