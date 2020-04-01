//Problem 189:
Array rotate
//https://leetcode.com/problems/rotate-array/


class Solution {
    public void rotate(int[] ar, int k) {
        
          k= k%ar.length;
          if(k==0)
              return;
        
          //full array
          reverse(ar, 0, ar.length-1);
        
         //intital array
          reverse(ar,0,k-1);
        
        //second half
          reverse(ar,k,ar.length-1);
           
    }
    public static void reverse(int ar[],int start,int end)
    {
        while(start<=end)
        {
            int temp=ar[start];
            ar[start]=ar[end];
            ar[end]=temp;
            start++;
            end--;
        }
    }
}