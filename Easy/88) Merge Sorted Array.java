//Problem:
// https://leetcode.com/problems/merge-sorted-array/

class Solution {
    public void merge(int[] large, int m, int[] small, int n) {

        // 3 pointer
        // fill from behind
        int ptr = large.length - 1; //large end
        int s_end = n - 1; // small end
        int f_nz = m - 1; // first non zero element in larger array

        // remeber always use && becoz we want to exit the array as soon one array is finished
        while (f_nz >= 0 && s_end >= 0 && ptr >= 0) {

            if (large[f_nz] >= small[s_end]) {
                large[ptr--] = large[f_nz--];
            } else {
                large[ptr--] = small[s_end--];
            }
        }
        //if larger array is exhausted
        while (s_end >= 0) {
            large[ptr--] = small[s_end--];
        }

        // if smaller array is exhausted
        while (ptr >= 0) {
            large[ptr--] = large[f_nz--];
        }
    }
}