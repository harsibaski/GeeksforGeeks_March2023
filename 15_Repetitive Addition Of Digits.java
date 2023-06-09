/*
Given a non-negative integer N, repeatedly add all its digits until the result has only one digit.

Example 1:

Input:
N = 98

Output:
8

Explanation:
Sum of digit of N = 98  is 9 + 8 = 17
Sum of digit of 17 = 1 + 7 = 8
Since 8 is the single digit number hence it is the 
required answer.
Example 2:

Input:
N = 1

Output:
1

Explanation:
Since 1 is the single-digit number hence it is the 
required answer.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function singleDigit() which takes an integer N as an input parameter and return the single-digit you will get after repeatedly adding the digits of N.

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 1018
*/

//Code

//User function Template for Java
class Solution{
    static int singleDigit(long N){
        // code here
        int sum=0;
        while(N>0||sum>9)
        {
            if(N==0)
            {
                N=sum;
                sum=0;
            }
            sum+=N%10;
            N/=10;
        }
        return sum;
    }
}
