

/*
Geeks Island is represented by an N * M matrix mat. 
The island is touched by the Indian Ocean from the top and left edges and the Arabian Sea from the right and bottom edges.
Each element of the matrix represents the height of the cell.

Due to the rainy season, the island receives a lot of rainfall,
and the water can flow in four directions(up, down, left, or right) from one cell to another one with height equal or lower.

You need to find the number of cells from where water can flow to both the Indian Ocean and the Arabian Sea.

Example 1:

Input:
N = 5, M = 5
mat[][] = {{1, 3, 3, 2, 4},
           {4, 5, 6, 4, 4},
               {2, 4, 5, 3, 1},
               {6, 7, 1, 4, 5},
               {6, 1, 1, 3, 4}}
Output:
8
Explanation:
Indian    ~   ~   ~   ~   ~
Ocean  ~  1   3   3   2  (4) *
       ~  4   5  (6) (4) (4) *
       ~  2   4  (5)  3   1  *
       ~ (6) (7)  1   4   5  *
       ~ (6)  1   1   3   4  *           
          *   *   *   *   * Arabian Sea
Water can flow to both ocean and sea from the cells
denoted by parantheses.

Example 2:

Input:
N = 3, M = 2
mat[][] = {{1, 1, 1},
               {1, 1, 1}}
Output:
6 
Explanation:
Water can flow from all cells.
Your Task:

Your task is to complete the function water_flow() which takes an integer array mat,
integer N and integer M as the input parameter and returns an integer, 
denoting the number of cells from which water can to both ocean and sea.

Constraints:

1 <= N, M <= 10^3
1 <= mat[i][j] <= 10^6


*/

 //{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			String [] str = br.readLine().trim().split(" ");
			int N = Integer.parseInt(str[0]);
			int M = Integer.parseInt(str[1]);
			int [][] mat = new int[N][M];
			for(int i = 0; i < N; i++) {
				str = br.readLine().trim().split(" ");
				for(int j = 0; j < M; j++) {
					mat[i][j] = Integer.parseInt(str[j]);
				}
			}
			Solution obj = new Solution();
			System.out.println(obj.water_flow(mat, N, M));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
	int water_flow(int [][] mat, int N, int M)

int dx[] = {0, 0, -1, 1};
int dy[] = { -1, 1, 0, 0};
int n, m;

void call(int x, int y, vector<vector<int>>&mat, vector<vector<int>> &vis) {
    vis[x][y] = 1;

    for (int i = 0; i < 4; i++) {
        int xx = x + dx[i];
        int yy = y + dy[i];
        if (xx >= 0 && yy >= 0 && xx < n && yy < m && vis[xx][yy] == 0 && mat[x][y] <= mat[xx][yy]) {
            call(xx, yy, mat, vis);
        }
    }
}


int water_flow(vector<vector<int>> &mat, int a, int b) {
    // Write your code here.
    n = a; m = b;

    vector<vector<int>> vis(n, vector<int>(m, 0));
    vector<vector<int>> vis2(n, vector<int>(m, 0));

    for (int i = 0; i < n; i++) {
        if (vis[i][0] == 0) call(i, 0, mat, vis );
        if (vis2[i][m - 1] == 0) call(i, m - 1, mat, vis2);
    }
    for (int j = 0; j < m; j++) {
        if (vis[0][j] == 0) call(0, j, mat, vis);
        if (vis2[n - 1][j] == 0) call(n - 1, j, mat, vis2);
    }


    int ans = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (vis[i][j] && vis2[i][j]) ans++;
        }
    }
    return ans;    
	}
}
