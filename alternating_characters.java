/*

You are given a string containing characters  and  only, your task is to change it into a string such that every two consecutive characters are different. To do this, you are allowed to delete one or more characters in the string.

Your task is to find the minimum number of required deletions.

For example, string  should be changed to  by deleting one character .

Input Format

The first line contains an integer , i.e. the number of test cases. 
The next  lines contain a string .

Constraints



Output Format

For each test case, print the minimum number of deletions required in a new line.

Sample Input

5
AAAA
BBBBB
ABABABAB
BABABA
AAABBB
Sample Output

3
4
0
0
4
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int alternatingCharacters(String s){
        // Complete this function
        int count=0;// count variable maintains the number of characters to be deleted.
        char prev = s.charAt(0);
        char cur;
        for(int i=1;i<s.length();i++)
        {
            cur = s.charAt(i);
            if(prev == cur)
                count++;
            prev = cur;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
    }
}








