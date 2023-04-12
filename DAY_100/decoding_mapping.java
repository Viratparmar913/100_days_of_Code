/*

A top secret message containing letters from A-Z is being encoded to numbers using the following mapping:

'A' -> 1
'B' -> 2
...
'Z' -> 26
You are an FBI agent. You have to determine the total number of ways that message can be decoded, 
as the answer can be large return the answer modulo 109 + 7.
Note: An empty digit sequence is considered to have one decoding.
 It may be assumed that the input contains valid digits from 0 to 9 and If there are leading 0s, extra trailing 0s and two or more consecutive 0s then it is an invalid string.

Example 1:

Input: str = "123"
Output: 3
Explanation: "123" can be decoded as "ABC"(123),
"LC"(12 3) and "AW"(1 23).
Example 2:

Input: str = "90"
Output: 0
Explanation: "90" cannot be decoded as it's an invalid string and we cannot decode '0'.


Your Task:
You don't need to read or print anything. Your task is to complete the function CountWays() which takes the string as str as input parameter and returns the total number of ways the string can be decoded modulo 109 + 7.


Expected Time Complexity: O(n)
Expected Space Complexity: O(n) where n  = |str|

Constraints:
1 <= |str| <= 10^4

*/


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.CountWays(str);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends




//User function Template for Java

class Solution
{
    int mod = 1000000007;
    int dp[] ;
    public int CountWays(String str)
    {
        if(str.charAt(0) == '0')return 0;

        dp = new int[10001];
        Arrays.fill(dp,-1);

        int n = str.length();

        return solve(str,n);
    }

    public int solve(String str,int n){

        if(n == 0 || n == 1) return 1;

        if(dp[n]!=-1) return dp[n];
        int cnt = 0;
        if(str.charAt(n-1) > '0')
        cnt = solve(str,n-1);

        if(str.charAt(n-2) == '1' || str.charAt(n-2) == '2' && str.charAt(n-1) < '7')
        cnt = (cnt+solve(str,n-2)%mod)%mod;

        return dp[n] = cnt;

    }
}
