/*A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.

Given an integer n, return true if n is a perfect number, otherwise return false.
Example 1:

Input: num = 28
Output: true
Explanation: 28 = 1 + 2 + 4 + 7 + 14
1, 2, 4, 7, and 14 are all divisors of 28. */

public class Perfect_number {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        for(int i=1;i<=(num/2);i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            return true;
        }
        return false;
    }
}
