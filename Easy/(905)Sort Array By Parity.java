class Solution {

    /**************Implace************************/

        public int[] sortArrayByParity(int[] A) 
        {
            
            for(int i=0,j=0;i<A.length;i++)
            {
                if (A[i] % 2 == 0) 
                {
                    swap(A, i, j++);
                }
            }
            return A;
        }
    
        public void swap(int[] A, int i, int j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }


    /***********Extra Space****************/

    //     public int[] sortArrayByParity(int[] A) {
    //         int res[]=new int[A.length];
    //         int start=0;
    //         int end=A.length-1;
    //         for(int i=0;i<A.length;i++)
    //         {
    //             if(A[i]%2==0)
    //             {
    //               res[start]=A[i]; 
    //               start++;
    //             }
    //             else
    //             {
    //               res[end]=A[i];
    //                end--; 
    //             }
    //         }
    //         return res;

    //     }
}
