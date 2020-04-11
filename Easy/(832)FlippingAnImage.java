//Problem:
//https://leetcode.com/problems/flipping-an-image/submissions
class Solution {
    public int[][] flipAndInvertImage(int[][] A)  
    {
         if (A == null || A.length == 0) return A;
        int row=A.length;
        int col=A[0].length;
        int p1=0;
        int p2= col-1;
        
        for(int i=0; i<row;i++)
        {
            for(int j=0;j<col/2;j++)
            {
               int temp = A[i][p1];
                A[i][p1]=A[i][p2];
                A[i][p2]=temp;
                 p1++;
                 p2--;  
              }
            p1=0;
            p2=col-1;
            
            }
        
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               A[i][j]=(A[i][j]==0) ? 1 :0;
            }
        }
        return A;
        
        
    }
}