//Problem:
//https://leetcode.com/problems/decompress-run-length-encoded-list

class Solution {
    public int[] decompressRLElist(int[] nums) {


        //calculation the size of result array
        int len = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            len += nums[i];
        }
        int res[] = new int[len];

        int freq = 0;
        int val = 0;
        int j = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            freq = nums[2 * i];
            val = nums[2 * i + 1];

            while (freq-- > 0) 
                res[j++] = val;
                
        }

        return res;



    }
}
