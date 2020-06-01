//Problem:
//https://leetcode.com/problems/monotonic-array/solution/

//An array is monotonic if it is monotone increasing, or monotone decreasing. Since a <= b and b <= c implies a <= c, we only need to check adjacent elements to determine if the array is monotone increasing (or decreasing, respectively). We can check each of these properties in one pass.

//To check whether an array A is monotone increasing, we'll check A[i] <= A[i+1] for all i. The check for monotone decreasing is similar.

class Solution {
    public boolean isMonotonic(int[] A) {
        boolean res1 = true;
         boolean res2 = true;
        
        //sinlge pass
        
        for (int i = 0; i < A.length - 1; ++i) 
        {
            if (A[i] > A[i+1])
                res1 = false;
            if (A[i] < A[i+1])
                res2 = false;
        }

//         for (int i = 0; i < A.length - 1; i++)
//         {   
//             if (A[i] > A[i + 1]) {
//                 res1 = false;
//                 break;
//             }
//         }  

       
//         for (int i = 0; i < A.length - 1; ++i)
//         {
//             if (A[i] < A[i + 1]) {
//                 res2 = false;
//                 break;
//             }
//     }

    return res1||res2;
}
}