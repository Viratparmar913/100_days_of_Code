/*HomePlaying With CharactersPlaying With Characters - Hackerrank Solution
Playing With Characters - Hackerrank Solution
Rahul PawarMay 16, 2020
Playing With Characters - Hackerrank Solution :

Welcome back Guys!!

In this post we will look at the Playing With Characters Hackerrank problem.
This is an easy problem in C which makes us play with characters and how to take string
input in C programing Language.
Lets get Started...

Video Explation Of this problem...

Problem Statement for Hackerrank Problem -Playing With Characters:

Objective

This challenge will help you to learn how to take a character, a string and a sentence as input in C.

To take a single character ch as input, you can use scanf("%c", &ch ); and printf("%c", ch) writes a character specified by the argument char to stdout

char ch;
scanf("%c", &ch);
printf("%c", ch);
This piece of code prints the character ch.

You can take a string as input in C using scanf(“%s”, s). But, it accepts string only until it finds the first space.

In order to take a line as input, you can use scanf("%[^\n]%*c", s); where  is defined as char s[MAX_LEN] where  is the maximum size of MAX_LEN. Here, [] is the scanset character. ^\n stands for taking input until a newline isn't encountered. Then, with this %*c, it reads the newline character and here, the used * indicates that this newline character is discarded.

Note: After inputting the character and the string, inputting the sentence by the above mentioned statement won't work. This is because, at the end of each line, a new line character (\n) is present. So, the statement: scanf("%[^\n]%*c", s); will not work because the last statement will read a newline character from the previous line. This can be handled in a variety of ways and one of them being: scanf("\n"); before the last statement.

Task

You have to print the character,ch, in the first line. Then print s in next line. In the last line print the sentence,sen .

Input Format

First, take a character,ch  as input.
Then take the string,s  as input.
Lastly, take the sentence  as input.

Output Format

Print three lines of output. The first line prints the character, .
The second line prints the string, .
The third line prints the sentence,sen .

Sample Input 0

C
Language
Welcome To C!!

Sample Output 0

C
Language
Welcome To C!!

Solution Code for Hackerrank Problem -Playing With Characters:

As mentioned in the problem statement, we need to input a character, a string without spaces and a sentence and print each of them in a new line.
To input a character, , the statement is: scanf("%c", &ch);.
To input a string, , the statement is: scanf("%s", s);.
To input a sentence, , the statement is: scanf("%[^\n]%*c", sen);.
In the code below, we have declared , as char s[20], here it represents that the string s, can hold a maximum of 20 characters.
NOTE though required size is 20 i have declared it to size 100 and used only one variable for string and sentence.

*/

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
char ch,s[100] ;
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    scanf("%c",&ch);
    printf("%c\n",ch);
    scanf("%s",s);
    printf("%s\n",s);
    scanf("\n");//to avoid new line character as input to next string
    scanf("%[^\n]%*c", s);
    // or gets(s); can be used
   printf("%s",s);
    return 0;
    
}
