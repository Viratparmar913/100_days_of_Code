/*
Given a positive integer N, print count of set bits in it. 

Example 1:

Input:
N = 6
Output:
2
Explanation:
Binary representation is '110' 
So the count of the set bit is 2.
Example 2:

Input:
8
Output:
1
Explanation:
Binary representation is '1000' 
So the count of the set bit is 1.

Your Task:  
You don't need to read input or print anything. Your task is to complete the function setBits()
which takes an Integer N and returns the count of number of set bits.

Expected Time Complexity: O(LogN)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 10^9
*/

//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();

            Solution ob = new Solution();
            int cnt = ob.setBits(N);
            System.out.println(cnt);
        }
    }
}

// } Driver Code Ends

// User function Template for Java
class Solution {
    static int setBits(int N) {
        // code here
        int n=N;
        String res="";

        while(n!=0)
        {
            if(n%2==0)
            {
                res+=0;
            }
            else{
                res+=1;
            }
            n=n/2;
        }

        int count=0;
        for(int i=0;i<res.length();i++)
        {
            if(res.charAt(i)=='1')
            {
                count++;
            }
        }

        return count;
    }
}
