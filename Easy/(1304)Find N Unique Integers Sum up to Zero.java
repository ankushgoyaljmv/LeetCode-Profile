//Problem:
//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
class Solution {
    public int[] sumZero(int n) {

        int[] arr = new int[n];

        int start;
        int end = n - 1;
        if (n % 2 == 0)
            start = 0;

        else {
            arr[0] = 0;
            start = 1;
        }
        for (int i = start; i <=n / 2; i++) {
            //it was given integers should be unique
            arr[i] = i+1;
            arr[end] = -i-1;
            end--;
        }


        return arr;
    }
}
