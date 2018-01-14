//Love letter mystery question using java.

/*
James found a love letter his friend Harry has written for his girlfriend. James is a prankster, so he decides to meddle with the letter. He changes all the words in the letter into palindromes.

To do this, he follows two rules:

He can reduce the value of a letter, e.g. he can change d to c, but he cannot change c to d.
In order to form a palindrome, if he has to repeatedly reduce the value of a letter, he can do it until the letter becomes a. Once a letter has been changed to a, it can no longer be changed.
Each reduction in the value of any letter is counted as a single operation. Find the minimum number of operations required to convert a given string into a palindrome.

Input Format

The first line contains an integer , i.e., the number of test cases. 
The next  lines will contain a string each. The strings do not contain any spaces.

Constraints 
 
 length of string  
All characters are lower case English letters.

Output Format

A single line containing the number of minimum operations corresponding to each test case.

Sample Input

4
abc
abcba
abcd
cba
Sample Output

2
0
4
2
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int theLoveLetterMystery(String s){
        // Complete this function
        // My logic is to use two-pointers.
        // Take the differnce of letters to get number of times a letter to be changed. Do this
        // till i<j; where i= start index and j= end index.
        
        int i=0, j = s.length()-1;
        int count =0;
        if(s.length() == 0 || s == null)
            return count;
        while(i<j)
        {
            if(s.charAt(i) == s.charAt(j))
            {
                i++;
                j--;
                 continue;
            }
               
            else
                count = count + Math.abs((int)(s.charAt(i) - s.charAt(j)));
            
            i++;
            j--;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = theLoveLetterMystery(s);
            System.out.println(result);
        }
    }
}


