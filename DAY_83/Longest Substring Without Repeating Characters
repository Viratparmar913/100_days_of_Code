/*
Given a string s, find the length of the longest 
substring
 without repeating characters.


Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 10^4

s consists of English letters, digits, symbols and spaces.

*/


import java.io.*;

class GFG {
	public static int longestUniqueSubsttr(String str)
	{
		String test = "";
		int maxLength = -1;

	 
		if (str.isEmpty()) {
			return 0;
		}
 
		else if (str.length() == 1) {
			return 1;
		}
		for (char c : str.toCharArray()) {
			String current = String.valueOf(c);

		 
			if (test.contains(current)) {
				test = test.substring(test.indexOf(current)
									+ 1);
			}
			test = test + String.valueOf(c);
			maxLength = Math.max(test.length(), maxLength);
		}

		return maxLength;
	}

 
	public static void main(String[] args)
	{
		String str = "geeksforgeeks";
		System.out.println("The input string is " + str);

		int len = longestUniqueSubsttr(str);
		System.out.println("The length of the longest "
						+ "non-repeating character "
						+ "substring is " + len);
	}
}
 
