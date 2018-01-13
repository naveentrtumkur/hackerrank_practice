/*
Suppose you have a String, , of length  that is indexed from  to . You also have some String, , that is the reverse of String .  is funny if the condition  is true for every character from  to .

Note: For some String ,  denotes the ASCII value of the  -indexed character in . The absolute value of an integer, , is written as .

Input Format

The first line contains an integer,  (the number of test cases). 
Each line  of the  subsequent lines contain a string, .

Output Format

For each String  (where ), print whether it is  or  on a new line.

Sample Input

2
acxz
bcxz
Sample Output

Funny
Not Funny
Explanation

Test Case 0:  
 
As each comparison is equal, we print .
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String funnyString(String s){
        // Complete this function
        // I'm trying to come up witha solution using efficient space.
        // i.e not using another string variable and storing the reversed string.
        
        int last = s.length();
        last = last-1;
        int i=0;
        while(i<last)
        {
            if(Math.abs((s.charAt(i+1)-'0') - (s.charAt(i)-'0')) == Math.abs((s.charAt(last -1)-'0') - (s.charAt(last)-'0')))
            {   i++;
                last--;
                continue;
            }
            else
                return "Not Funny";
        }
        
        return "Funny";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }
}


