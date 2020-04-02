//Problem:204
//https://leetcode.com/problems/count-primes/


class Solution {
    public int countPrimes(int n) {
             //base case: exclusive
        if (n <= 2)
            return 0;

        //already one prime encountered:2
        int count = 1;
        int num = 3;
        
        //Numbers less than n(exclusive)
        
        while (num < n) {
            //assuming every number to be prime
            boolean isprime = true;
            for (int i = 2; i * i <=num; i++) {
                if (num % i == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime == true)
                count++;
            num += 2;

        }
        return count;
    }
}


/**************************************************************************************************/
// class Solution {
//     public int countPrimes(int n) {
//         int count = 0;

//         int num = 2;
//         //Numbers less than n(exclusive)
//         while (num < n) {
//                   //assuming every number to be prime
//                   boolean isprime = true;
//             for (int i = 2; i * i <= num; i++) {
//                 if (num % i ==0) {
//                     isprime = false;
//                     break;
//                 }
//             }
//              if (isprime == true)
//                     count++;
//                 num++;

//         }
//         return count;
//     }
// }
