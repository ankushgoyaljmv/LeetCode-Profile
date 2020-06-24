//Problem:
//https://leetcode.com/problems/xor-operation-in-an-array/

class Solution {
    
    /*********No EXTRA SPACE************/
    
    public int xorOperation(int n, int start) {
        int xor = 0;
        for(int i = 0; i < n; i++)
            xor ^= start + 2 * i;
        return xor;
    }
    
    
    /***************  USING EXTRA SPACE:  */
//     public int xorOperation(int n, int start) {
        
//         int ar[] = new int[n];
//         int res = 0;
//         for(int i = 0 ; i < n ; i++ ){
//             ar[i] = start + 2*i;
//             res = res ^ ar[i];
            
//         }
        
//         return res;
        
//     }
}