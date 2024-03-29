/*

Let's play a game on an array! You're standing at index 0 of an n-element array named game. From some index i,
you can perform one of the following moves:

Move One Backward: If cell i-1 exists and contains a zero, you can walk back to cell .
Move Forward:

If cell i+1 contains a zero, you can walk to cell i+1.
If cell i+leap contains a zero, you can jump to cell i+leap.

If you're standing on a cell which and in your next move you can either walk one forward or one leap forward and 
jump out of array you win!

Outputs YES if there is a path otherwise outputs NO


*/


import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        int index = 0;
        ArrayList<Integer> added = new ArrayList<Integer>();


        if(game[index+1] == 0)
            added.add(index+1);
        if(index-1>=0 && game[index-1] == 0)
            added.add(index-1);
        if(index+leap<game.length && game[index+leap] == 0)
            added.add(index+leap);
        if(leap >= game.length)
            return true;


        int bufferLength = 0;
        while(true)
        {
            int count = 0;
            bufferLength = added.size();
            while(count < added.size())
            {
                if((added.get(count) + leap > game.length - 1) || (added.get(count) + 1 > game.length-1))
                    return true;
                if(game[added.get(count) + 1] == 0)
                {
                    if(!added.contains(added.get(count) + 1))
                        added.add(added.get(count) + 1);
                }
                if(added.get(count)-1>=0 && game[added.get(count) - 1] == 0)
                {
                    if(!added.contains(added.get(count) - 1))
                        added.add(added.get(count) - 1);
                }
                if(game[added.get(count) + leap] == 0)
                {
                    if(!added.contains(added.get(count) + leap))
                        added.add(added.get(count) + leap);
                }

                count ++;

            }
            if(bufferLength == added.size()) // meaning added didnt change in length so no new items were added
                return false;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
