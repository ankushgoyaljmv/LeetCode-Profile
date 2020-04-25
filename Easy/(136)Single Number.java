///Problem:
//https://leetcode.com/problems/single-number/

public class Solution {

    public int singleNumber(int[] nums) {
        int result = 0;
        
        //initially we are assuming the second number as 0

        /*
          a^0=a
          a^a=0
          a^b^a=(a^a)^b=0^b=b
        */
        for (int ele: nums) {
            result = result ^ ele;
        }
        return result;
    }
}
