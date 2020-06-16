class Solution {
    
    // one pass solution using swapping with 2 pointers
    // the idea is if we encounter a zero then we swap at the first part of array
    // If we get a 2 then we swap it in the last part of arrat
    // if we get 1 then we will let it be
    
    public void sortColors(int nums[])
    {
        int start =  0; // for zeros
        int end = nums.length-1; // for twos
        int index = 0;// current eleemnt tracker 
        
        while(index <= end)
        {
            if(nums[index] == 0)
            {
                swap(nums, index , start);
                 start++;   
                  index++;
            }
            else if (nums[index] == 1)
            {
                index++;
            }
            
            else// if i find a 2
            {
                swap(nums , index , end);
                end--;
//NOTE We cannot increment i after each swap, because the new color 2 is swapped with could be 0 as in the case of [1,2,0] -> [1,0,2] which hence would require another swap operation to get the correct result.
            }
        }
    }
    
    public void swap(int nums[] , int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    
    
   /*  2 Pass algorithm: Dutch national flag problem by Edsger Dijkstra
   
      # Counting Sort : It is a implace sorting algorithm
    public void sortColors(int[] nums) {
        
       int c1=0;
       int c3=0;
       int c2=0;
        
        for(int i = 0; i < nums.length; i++ )
        {
            if(nums[i] == 0 )
                c1++;
            
            else if( nums[i] == 1)
                c2++;
            
            else
                c3++;
        }
        
        for(int i = 0; i< nums.length;i++)
        {
            if(i < c1)
                nums[i] = 0;
            
            else if(i >= c1 && i < c1+c2)
                nums[i] = 1;
            
            else
                nums[i] = 2;
        }
        
    }
    */
    
    
}