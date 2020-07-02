class Solution {
    public int arrangeCoins(int n) {
        
        int k = 1;
        int count = 0 ;
        
        while(n > 0){
            
            if( n >= k){
                count++;
            } 
            n = n - k;
            k++;
            
        }
        
        return count;
        
    }
}
