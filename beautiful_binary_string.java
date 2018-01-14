/*

Alice has a binary string, , of length . She thinks a binary string is beautiful if and only if it doesn't contain the substring .

In one step, Alice can change a  to a  (or vice-versa). Count and print the minimum number of steps needed to make Alice see the string as beautiful.

Input Format

The first line contains an integer,  (the length of binary string ). 
The second line contains a single binary string, , of length .

Constraints


Each character in .
Output Format

Print the minimum number of steps needed to make the string beautiful.

Sample Input 0

7
0101010
Sample Output 0

2
Sample Input 1

5
01100
Sample Output 1

0
Sample Input 2

10
0100101010
Sample Output 2

3


*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int beautifulBinaryString(String b) {
        // Complete this function
        StringBuilder sb = new StringBuilder(b);
        int count_value=0; // counter to keep the number of bits to change.
        //System.out.println(b.substring(0,3));
        for(int i=0;i<b.length()-2;i++)
        {
            if(b.substring(i,i+3).equals("010"))
            {
                //System.out.println("Inside if , value = " +i);
                sb.setCharAt(i+2, '1'); 
                b = sb.toString();
                count_value++;
            }
        }
        return count_value;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String b = in.next();
        int result = beautifulBinaryString(b);
        System.out.println(result);
        in.close();
    }
}


