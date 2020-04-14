//Problem:1351
//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix
class Solution

{
    /***************Using Binary Search*******************/

    public int countNegatives(int[][] grid) 
    {
        int count = 0;
        // taking one row at a time
        for (int[] row: grid) {
            count += binary(row);
        }
        return count;
    }

    int binary(int[] row) {
        int start = 0, end = row.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (row[mid] < 0)
                end = mid;
            else
                start = mid + 1;
        }
        return row.length - start;
    }





    //************Optimised version 1:*************************//   
    //     public int countNegatives(int[][] grid) 
    //     {
    //          int end=grid[0].length-1;
    //         int count=0;

    //         for(int i=0;i<grid.length;i++)
    //         {
    //             int temp=end;
    //             for(int j=end; j>=0; j--)
    //             {
    //                 if(grid[i][j]<0)
    //                     count++;

    //                 else break;
    //             }
    //         }
    //         return count;

    //     }




    //************************8Brute Force****************************8
    //     public int countNegatives(int[][] grid) 
    //     {
    //         int count=0;
    //         for(int i=0;i<grid.length;i++)
    //         {
    //             for(int j=0;j<grid[0].length;j++)
    //             {
    //                 if(grid[i][j]<0)
    //                     count++;
    //             }
    //         }
    //         return count;

    //     }
}
