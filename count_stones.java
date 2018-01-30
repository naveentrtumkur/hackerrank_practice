/*

Two players (numbered  and ) are playing a game with  stones. Player  always plays first, and the two players move in alternating turns. The game's rules are as follows:

In a single move, a player can remove either , , or  stones from the game board.
If a player is unable to make a move, that player loses the game.
Given the number of stones, find and print the name of the winner (i.e.,  or ) on a new line. Each player plays optimally, meaning they will not make a move that causes them to lose the game if some better, winning move exists.

*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String gameOfStones(int n) {
        // Complete this function
        if(n%7 ==0 || n%7 ==1)
            return "Second";
        else
            return "First";
        }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            String result = gameOfStones(n);
            System.out.println(result);
        }
        in.close();
    }
}


