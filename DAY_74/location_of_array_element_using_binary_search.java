
/*
Given a sorted array of size N and an integer K, find the position at which K is present in the array using binary search.

Example 1:

Input:
N = 5
arr[] = {1 2 3 4 5} 
K = 4
Output: 3
Explanation: 4 appears at index 3.

Example 2:

Input:
N = 5
arr[] = {11 22 33 44 55} 
K = 445
Output: -1
Explanation: 445 is not present.

Your Task:  
You dont need to read input or print anything. Complete the function binarysearch() which takes arr[],
N and K as input parameters and returns the index of K in the array. If K is not present in the array, return -1.


Expected Time Complexity: O(LogN)
Expected Auxiliary Space: O(LogN) if solving recursively and O(1) otherwise.


Constraints:

1 <= N <= 10^5
1 <= arr[i] <= 10^6
1 <= K <= 10^6


*/

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}

// } Driver Code Ends



// User function Template for Java

class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int start = 0;
        int end = n - 1;

        while(start<=end){

           int mid =(int) (start + end) / 2;

           if(arr[mid] == k){
               return mid;
           }
           else if(arr[mid] < k){
               start = mid +1;
           }
           else{
               end = mid - 1;
           }

        }
        return -1;
    }
}
