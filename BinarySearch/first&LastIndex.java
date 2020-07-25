//Problem : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
class Solution {
    
    
    
    //*************BINARY SEARCH***********
    
     public int[] searchRange(int[] nums, int target){
         
         if( nums.length == 0) return new int[] { -1 , -1};
         int low = 0;
         int hi = nums.length - 1;
         int first = -1;
         int last =  -1 ;
         
         // first Index
         while( low <= hi){
             
             int mid = low + ( hi - low )/2 ;
             
             if( nums[mid] == target ){
                 
                 first = mid; // mark potential answer
                 hi = mid - 1; // check again in the first half        
             }
             else if( nums[mid] < target){
                 low = mid + 1;
             }
             
             else{
                 // larger arr[mid] > target
                 hi = mid - 1;
             }
         }
         
         low = 0;
         hi = nums.length - 1;
         
         // last index
         while( low <= hi){
             
             int mid = low + ( hi - low )/2 ;
             
             if( nums[mid] == target ){
                 
                 last = mid; // mark potential answer
                 low = mid + 1; // check again in the second half        
             }
             else if( nums[mid] < target){
                 low = mid + 1;
             }
             
             else{
                 // larger arr[mid] > target
                 hi = mid - 1;
             }
         }
         
         return new int[] { first , last};
     
     }
    
    /****************  LINEAR SEARCH *******8
    public int[] searchRange(int[] nums, int target) {
        
       // if( nums.length == 0 ) return null;
        
        int res[] =  { - 1 , -1};
        
        for( int i = 0 ; i < nums.length ; i++){
            
            if( nums[i] == target){
                res[0] = i;
                break;
            }
        }
        
        for( int j = nums.length - 1 ; j >= 0 ; j--){
            if( nums[j] == target){
                res[1] = j;
                break;
            }
        }
        
        return res;
    }
    */
    
}