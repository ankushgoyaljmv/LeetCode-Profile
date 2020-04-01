//Problem:204
//https://leetcode.com/problems/count-primes/
class Solution {
    public int countPrimes(int n) {
        int count = 0;

        int num = 2;
        //Numbers less than n(exclusive)
        while (num < n) {
                  //assuming every number to be prime
                  boolean isprime = true;
            for (int i = 2; i * i <= num; i++) {
                if (num % i ==0) {
                    isprime = false;
                    break;
                }
            }
             if (isprime == true)
                    count++;
                num++;

        }
        return count;
    }
}