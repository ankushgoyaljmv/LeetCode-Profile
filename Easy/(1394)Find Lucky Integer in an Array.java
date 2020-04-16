//Problem:
//https://leetcode.com/problems/find-lucky-integer-in-an-array/

class Solution {
    public int findLucky(int[] arr) {
        int freq[] = freqCounter(arr);
        int tempmax = 0;
        int max = 0;
        for (int f = 1; f < freq.length; f++) {
            if (freq[f] == f)
                tempmax = f;

            if (tempmax >= max)
                max = tempmax;
        }
        if (max == 0)
            return -1;
        else
            return max;
    }
    public int[] freqCounter(int[] arr) {
        int[] freq = new int[500];
        for (int i = 0; i < arr.length; i++) {
            int index = arr[i];
            freq[index]++;

        }


        return freq;
    }
}
