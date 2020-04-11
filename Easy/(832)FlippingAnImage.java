//Problem:
//https://leetcode.com/problems/flipping-an-image/submissions

//*********Optimized Code***********************//

class Solution {
    public int[][] flipAndInvertImage(int[][] A) 
    {
        if (A == null || A.length == 0) 
            return A;
        
        int row=A.length;
        int col=A[0].length;
        for (int i = 0; i <row ;i++)
        {
            //Selecting A row
            reverse(A[i],0,col-1);
            invert(A[i]);
        }
        return A;
    }
    
    public void reverse(int[] A,int p1,int p2) 
    {
        while (p1 < p2) 
        {
          int temp = A[p2];
          A[p2] = A[p1]; 
          A[p1] = temp;
            p1++;
            p2--;
        }
           
    }
    
    public void invert(int[] a) {
        for (int i = 0; i < a.length; ++i) {
            a[i] = a[i] == 0 ? 1 : 0;
        }
    }
        
    }
//*********UnOptimized Code***********************//

// class Solution {
//     public int[][] flipAndInvertImage(int[][] A)  
//     {
//          if (A == null || A.length == 0) return A;
//         int row=A.length;
//         int col=A[0].length;
//         int p1=0;
//         int p2= col-1;
        
//         for(int i=0; i<row;i++)
//         {
//             for(int j=0;j<col/2;j++)
//             {
//                int temp = A[i][p1];
//                 A[i][p1]=A[i][p2];
//                 A[i][p2]=temp;
//                  p1++;
//                  p2--;  
//               }
//             p1=0;
//             p2=col-1;
            
//             }
        
        
//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                A[i][j]=(A[i][j]==0) ? 1 :0;
//             }
//         }
//         return A;
        
        
//     }
// }
