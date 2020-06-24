//Problem:

//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/


class Solution {
    
    // ******* OPTIMAL SOLUTION:  Finding 2 maximum numbers and return (n1 - 1) * (n2 - 1)
    
     public int maxProduct(int[] nums) { 
     
         int max1 = Integer.MIN_VALUE ;
         int max2 = Integer.MIN_VALUE ;
         
         for(int ele: nums){
             
            if (ele > max1) {
                max2 = max1;
                max1 = ele;
            } else if (ele > max2) {
                max2 = ele;
            }
         }
         
         return (max1-1) * (max2-1) ;
     
     }
    
    
    
    
    
    
    
    
  /* ***************** BRUTE FORCE : FINDING ALL PAIRS*******  
    public int maxProduct(int[] nums) {  
        int n1 = 1;
        int n2 = 1;
        int res = 0  ;
        
        for(int i = 0 ; i < nums.length ; i++){
            
            for(int j = i+1 ; j < nums.length ; j++  ){
                
                n1 = nums[i] - 1;
                n2 = nums[j] - 1;
                res = Math.max( res , n1 * n2 );           
            }
        }
        
        return res;
        
    }
    
    */
}
