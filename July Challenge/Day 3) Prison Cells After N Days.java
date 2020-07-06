class Solution {
     public static int[] prisonAfterNDays(int[] cells, int N) {
        
         if ( N == 0 ) {
             return cells;
         }
         
         if(N % 14 == 0){
             N = 14;
         }
         else{
             N = N % 14;
         }
        
        while (N > 0) {
            
             int temp[] = new int[8];
             // zeroth index is always 0
            for (int i = 1; i < 7; i++)
                
                if (cells[i - 1] == cells[i + 1]){
                    temp[i] = 1;
                }
                    
                else{
                    temp[i] = 0;
                }
                    
            cells = temp;
            N--;
        }

        return cells;
    }
}
