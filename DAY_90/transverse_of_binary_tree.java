
/*
Given a Binary Tree. Find the Zig-Zag Level Order Traversal of the Binary Tree.


Example 1:

Input:
        1
      /   \
     2     3
    / \   /  \
   4   5 6    7
Output:
1 3 2 4 5 6 7
Example 2:

Input:
           7
        /     \
       9       7
     /  \     /   
    8    8   6     
   /  \
  10   9 
Output:
7 7 9 8 8 6 9 10 


Your Task:
You don't need to read input or print anything. Your task is to complete the function zigZagTraversal() 
which takes the root node of the Binary Tree as its input and returns a list containing the node values as they appear in the Zig-Zag Level-Order Traversal of the Tree.



Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).



Constraints:
1 <= N <= 10^4

*/



import java.util.*;
import java.util.HashMap;
import java.io.*;

    class Node
    {
        int data;
        Node left,right;
        Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
    }

public class GFG2
{
    static Node buildTree(String str){

        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>(); 

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while(queue.size()>0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if(!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if(i >= ip.length)
                break;

            currVal = ip[i];

            // If the right child is not null
            if(!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

	public static void inorder(Node root)
	{
	    if(root==null)
	    return;
	    inorder(root.left);
	    System.out.print(root.data);
	    inorder(root.right);
	}
     /* Drier program to test above functions */
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        int t=Integer.parseInt(br.readLine());

	        while(t > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
        	    GFG g = new GFG();

			    ArrayList<Integer> res = g.zigZagTraversal(root) ;
			    for (int i = 0; i < res.size (); i++)
			        System.out.print (res.get (i) + " ");
			    System. out. println();  

                t--;

        }
	}
}
// } Driver Code Ends


//User function Template for Java



//User function Template for Java

/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/

class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();

        if(root==null)return ans;
        q.add(root);

        boolean flag=false;

        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> temp= new ArrayList<>();
            while(size>0){
                Node curr=q.remove();
                temp.add(curr.data);
                size--;
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
            }
            if(flag){
                Collections.reverse(temp);
                ans.addAll(temp);
            }else{

                ans.addAll(temp);
            }
            flag=!flag;
        }
        return ans;
	}
}
