/*Problem
Java’s BigDecimal class can handle arbitrary-precision signed decimal numbers. Let’s test your knowledge of them!

Given an array, s, of n real number strings, sort them in descending order — but wait, there’s more! 
Each number must be printed in the exact same format as it was read from stdin,
meaning that .1 is printed as .1, and 0.1 is printed as 0.1. If two numbers represent numerically equivalent values 
(e.g., .1≡0.1), then they must be listed in the same order as they were received as input).*/
import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
          sc.close();
        //Write your code here
for(int i=0;i<n;i++)
{
    //inserting string values to bigdecimal
    BigDecimal First=new BigDecimal(s[i]);
    int index=i;
    for(int j=i+1;j<n;j++)
    {
        //second BigDecimal to compare the first Bigdecimal
        BigDecimal Second=new BigDecimal(s[j]);
        //comparing if First element is greater that second element
        //if the First element is greater than Second element than compareTo() returns 1
        if(Second.compareTo(First)==1){
            First=Second;
            index=j;
        }
    }
    //temporary variable to store s[i] value
        String temp=s[i];
        s[i]=s[index];
        s[index]=temp;
}
      
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
