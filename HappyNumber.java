/*
leet Code Easy Questions Question number 202
Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example:

Input: 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
*/
public class HappyNumber {
    public boolean isHappy(int n) {
        int sum;
        int stop=0;
        int count=0;
        boolean result=false;
        while(stop==0){
            sum=0;
            while(n>0){
                int val1= n%10;
                sum=sum+(val1*val1);
                n=n/10;
            }
            if(sum==1){
                stop=1;
                result=true;
            }
            else{
                stop=0;
                n=sum;
                if(count==100){
                    return result;
                }
                count++;
            }
        }
        return result;
    }
}
