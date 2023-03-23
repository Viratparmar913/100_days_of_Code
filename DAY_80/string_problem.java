
/*
Given a string S consisting only of opening and closing parenthesis 'ie '('  and ')', 
find out the length of the longest valid(well-formed) parentheses substring.
NOTE: Length of the smallest valid substring ( ) is 2.

Example 1:

Input: S = "(()("
Output: 2
Explanation: The longest valid 
substring is "()". Length = 2.
Example 2:

Input: S = "()(())("
Output: 6
Explanation: The longest valid 
substring is "()(())". Length = 6.

Your Task:  
You dont need to read input or print anything. Complete the function findMaxLen() which takes S as input parameter and returns the maxlength.


Expected Time Complexity:O(n)
Expected Auxiliary Space: O(1)   


Constraints:
1 <= |S| <= 10^5

*/

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.findMaxLen(S));
        }
    }
}


// } Driver Code Ends



//User function Template for Java
class Solution {
    static int findMaxLen(String str) {
        int n = str.length();
        Stack<Integer> st = new Stack<>();

        st.add(-1);

        int ans = 0;

        for(int i=0; i<n; i++)
        {
            char ch = str.charAt(i);

            if(ch == '(')
            {
                st.add(i);
            }
            else 
            {
                st.pop();

                if(st.isEmpty())
                {
                    st.add(i);
                }

                else 
                    ans = Math.max(ans, i - st.peek());
            }
        }

        return ans;

    }
}
