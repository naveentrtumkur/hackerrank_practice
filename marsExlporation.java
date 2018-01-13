/*

Sami's spaceship crashed on Mars! She sends  sequential SOS messages to Earth for help.

NASA_Mars_Rover.jpg

Letters in some of the SOS messages are altered by cosmic radiation during transmission. Given the signal received by Earth as a string, , determine how many letters of Sami's SOS have been changed by radiation.

Input Format

There is one line of input: a single string, .

Note: As the original message is just SOS repeated  times, 's length will be a multiple of .

Constraints

will contain only uppercase English letters.
Output Format

Print the number of letters in Sami's message that were altered by cosmic radiation.

Sample Input 0

SOSSPSSQSSOR
Sample Output 0

3
Sample Input 1

SOSSOT
Sample Output 1

1

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int marsExploration(String s) {
        // Complete this function
        // Count of number of letters altered by radiation.
        //The logic is that the order "SOS" needs to be preserved.
        // Even if SOS is changed to SOO then it is an altering of letter.
        int count =0;
        for(int i=0;i<s.length();i++)
        {
            if(i%3 == 0 && s.charAt(i)=='S')
                continue;
            else if(i%3==1 && s.charAt(i)=='O')
                continue;
            else if(i%3==2 && s.charAt(i)=='S')
                continue;
            else
                count++;
        }
        // Return the count of letters that have been altered.
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = marsExploration(s);
        System.out.println(result);
        in.close();
    }
}


