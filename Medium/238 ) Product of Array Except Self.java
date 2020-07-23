//https://leetcode.com/problems/product-of-array-except-self/

class Solution {
    public int[] productExceptSelf(int[] nums) throws ArithmeticException {

        // to store the left product
        int left[] = new int[nums.length];
        //to store the right product
        int right[] = new int[nums.length];

        left[0] = 1 ; // since there is no product here
        right[nums.length - 1 ] = 1;
        
        for (int i = 1 ; i < left.length ; i++) {
    
                left[i] = left[ i - 1 ] * nums[i - 1];
            }
        
        for( int i = nums.length - 2 ; i >= 0 ; i--){
            
            right[i] = right[ i + 1 ] * nums[ i + 1 ];
        }

        for( int i = 0  ; i < nums.length ; i++){
            nums[i] = left[i] * right[i];
        }

        return nums;
    }
}