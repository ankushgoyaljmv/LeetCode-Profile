class Solution {
    
    
    
    /* USING EXTRA MEMORY : FREQUENCY COUNTER METHOD: 
    
    public int findDuplicate(int[] nums) {

        int freq[] = new int[nums.length];
        for (int ele: nums) {
            
            freq[ele]++;
        }
        for (int f = 0; f < freq.length; f++) {
            if (freq[f] > 1) 
                return f;
        }
            return -1;

    } */
    
    
    /* USING SORTING METHOD 
     public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                return nums[i];
            }
        }

        return -1;
    }
    */
}