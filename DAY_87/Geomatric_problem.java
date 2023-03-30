/*

Given the A and R i,e first term and common ratio of a GP series. Find the Nth term of the series.

Note: As the answer can be rather large print its modulo 1000000007 (109 + 7).

Example 1:

Input: A = 2, R = 2, N = 4
Output: 16
Explanation: The GP series is 
2, 4, 8, 16, 32,... in which 16 
is th 4th term.
Example 2:

Input: A = 4, R = 3, N = 3
Output: 36
Explanation: The GP series is
4, 12, 36, 108,.. in which 36 is
the 3rd term.


Your Task:
You don't need to read or print anything. Your task is to complete the function Nth_term() 
which takes A, R and N as input parameter ans returns Nth term of the GP series modulo 109 + 7.


Expected Time Complexity: O(log2(N))
Expected Space Complexity: O(1)

Constraints:
1 <= A, R, N <= 1000000

*/


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s1 = br.readLine().trim();
            String[] s2 = s1.split(" ");
            int a = Integer.parseInt(s2[0]);
            int r = Integer.parseInt(s2[1]);
            int n = Integer.parseInt(s2[2]);
            Solution ob = new Solution();
            int ans = ob.Nth_term(a, r, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends



class Solution
{
    static int mod= 1000000007;
    public int Nth_term(int a, int r, int n)
    {
        // code here
        int t = (int)(a*pow(r,n-1)%mod);
        return t%mod;
    }
    static long pow(int x, int b){
        if(b == 0){
            return 1;
        }
        long temp = pow(x,b/2)%mod;
        temp = temp*temp%mod;
        if(b%2 == 0){
            return temp%mod;
        }
        return (x*temp)%mod;
    }
}
