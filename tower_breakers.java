/*

Two players (numbered  and ) are playing a game of Tower Breakers! The rules of the game are as follows:

Player  always moves first, and both players always play optimally.
Initially there are  towers, where each tower is of height .
The players move in alternating turns. In each turn, a player can choose a tower of height  and reduce its height to , where  and  evenly divides .
If the current player is unable to make any move, they lose the game.
Given the values of  and , can you determine who will win? If the first player wins, print ; otherwise, print .

*/

import java.util.*;

public class Solution {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            if( n%2==0 || m==1)
                {
                    System.out.println("2");
            }
        else
            System.out.println("1");
    }
}
%}
