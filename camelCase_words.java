/*
Alice wrote a sequence of words in CamelCase as a string of letters, , having the following properties:

It is a concatenation of one or more words consisting of English letters.
All letters in the first word are lowercase.
For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
Given , print the number of words in  on a new line.

Input Format

A single line containing string .

Output Format

Print the number of words in string .

Sample Input

saveChangesInTheEditor
Sample Output

5
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int camelcase(String s) {
        // Complete this function
        int countWords=1,i=0;
        while(i<s.length())
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
                countWords++;
            i++;
        }
        
        return countWords;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = camelcase(s);
        System.out.println(result);
        in.close();
    }
}


