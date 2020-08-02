https://leetcode.com/problems/find-pivot-index/


class Solution {
    public int pivotIndex(int[] nums) {
	int sum = 0 ;
	
	int prefixSum = 0;
        // overall sum
        
	for( int i = 0 ; i < nums.length ; i++){
		sum += nums[i];
	}
	
	// Prefix Sum : sum of all elements before that element excluding that element
        // Suffix Sum = sum of all elements after that element , excluding that eleemnt : sum - pref - arr[i]
	for( int i = 0 ; i < nums.length ; i++){
        
        int suffixSum = sum - prefixSum - nums[i];
        if( prefixSum == suffixSum){
            return i;
        }
        
        prefixSum += nums[i];
    
    } 
		return -1;	
        
    }
}