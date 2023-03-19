/*

Given an array Arr[] of size L and a number N, you need to write a program to find if there exists a pair of elements in the array whose difference is N.

Example 1:

Input:
L = 6, N = 78
arr[] = {5, 20, 3, 2, 5, 80}
Output: 1
Explanation: (2, 80) have difference of 78.
Example 2:

Input:
L = 5, N = 45
arr[] = {90, 70, 20, 80, 50}
Output: -1
Explanation: There is no pair with difference of 45.
Your Task:
You need not take input or print anything. Your task is to complete the function findPair() which takes array arr,
size of the array L and N as input parameters and returns True if required pair exists, else return False.

Expected Time Complexity: O(L* Log(L)).
Expected Auxiliary Space: O(1).

Constraints:
1<=L<=10^4 
1<=Arr[i]<=10^5 

0<=N<=10^5

*/


import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int l = sc.nextInt();
            int n = sc.nextInt();

            int arr[] =  new int[l];

            for(int i = 0;i<l;i++)
                arr[i] = sc.nextInt();

            Solution ob = new Solution();

            if(ob.findPair(arr, l, n)==true)
                System.out.println(1);

            else
                System.out.println(-1);    

        }

    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    public boolean findPair(int arr[], int size, int n)
    {
        //code here.
        int max=0;

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(Math.abs(arr[i]-arr[j])==n &&i!=j)

            return true;
            }

        }
         return false;
    }
}

