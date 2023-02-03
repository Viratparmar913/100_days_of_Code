/* Java Big Integer
In this problem you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like long integer.
Use the power of Java's BigInteger class and solve this problem.
Input Format
There will be two lines containing two numbers, a and b. The numbers are non-negative and can have maximum 200 digits.
Output Format
Output two lines. The first line should contain a+b, and the second line should contain a×b. Don't print any leading zeros.
*/
import java.math.*;
import java.util.Scanner;
public class Solution {
   public static void main(String []args){
       Scanner input = new Scanner(System.in);
       String s1,s2;
       s1=input.nextLine();
       s2=input.nextLine();
       input.close();
       System.out.println(new BigInteger(s1).add(new BigInteger(s2)));
       System.out.println(new BigInteger(s1).multiply(new BigInteger(s2)));
   }
}
