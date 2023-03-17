/*
Given a number S. Check whether it is divisble by 11 or not.

Example 1:

Input:
S = 76945
Output: 1
Explanation: The number is divisible by 11
as 76945 % 11 = 0.

â€‹Example 2:

Input: 
S = 12
Output: 0
Explanation: The number is not divisible
by 11 as 12 % 11 = 1.

Your Task:
You don't need to read input or print anything. Your task is to complete the function divisibleBy11() which takes the number in the form of string S as input and returns 1 if the number is divisible by 11. Else, it returns 0.


Expected Time Complexity: O(Log S) where S is the input number.
Expected Auxiliary Space: O(1). 


Constraints:
1<=S<=101000+5
*/

//Code

//User function Template for Java
//import java.lang.*;
class Sol
{
    int divisibleBy11 (String S)
    {
        // Your Code Here
       /* long n=Long.parseLong(S);
        if(((new BigInteger(S)).mod(11))==0)*/
        int e=0,o=0;
        for(int i=0;i<S.length();i++)
        {
            if(i%2==0)
            {
                e+=(S.charAt(i)-'0');
            }
            else
            {
               o+=(S.charAt(i)-'0'); 
            }
        }
        int n=o-e;
        if(n%11==0)
        return 1;
        else
        return 0;
    }
}
