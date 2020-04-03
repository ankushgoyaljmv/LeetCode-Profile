//Problem:371
//https://leetcode.com/problems/sum-of-two-integers

class Solution {
    //using ++/-- operator
// public int getSum(int a, int b) 
// {

//         if (b > 0)
//         {
//             while (b > 0)
//             {
//                 b--;
//                 a++;
//             }
//         }
//         else
//             { 
//             while (b < 0)
//             {
//                 b++;
//                 a--;}
//             }
    
//     return a;
    

// }
     //using XOR Operator for sum and and operator for carry(Adder)
    public int getSum(int a, int b) 
 {
    if (b == 0)
           return a;
    else
           return getSum(a ^ b, (a & b) <<1);
    }
}
