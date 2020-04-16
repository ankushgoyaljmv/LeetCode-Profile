//Problem:
//https://leetcode.com/problems/number-complement/
class Solution {
    public int findComplement(int num) 
    {
        if(num==0) 
            return 1;
        if(num==1)
            return 0;
        
        int res = 0;
        int mul = 1;
        while(num != 0)
        {
            int dig=num%2;
            //Keep extracting LSB and XOR with 1 to flip. Add it to res 
            res+= mul * ((dig) ^ 1);
            mul *= 2;
            num /= 2;
        }
        return res;
    }

}
