// pangrams question Java
/*

Roy wanted to increase his typing speed for programming contests. So, his friend advised him to type the sentence "The quick brown fox jumps over the lazy dog" repeatedly, because it is a pangram. (Pangrams are sentences constructed by using every letter of the alphabet at least once.)

After typing the sentence several times, Roy became bored with it. So he started to look for other pangrams.

Given a sentence , tell Roy if it is a pangram or not.

Input Format

Input consists of a string .

Constraints 
Length of  can be at most   and it may contain spaces, lower case and upper case letters. Lower-case and upper-case instances of a letter are considered the same.

Output Format

Output a line containing pangram if  is a pangram, otherwise output not pangram.

Sample Input

Input #1

We promptly judged antique ivory buckles for the next prize    
Input #2

We promptly judged antique ivory buckles for the prize    
Sample Output

Output #1

pangram
Output #2

not pangram

*/



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s = s.toLowerCase();
        //System.out.println(s);
        HashSet<Character> set = new HashSet<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(!set.contains(s.charAt(i)))
                set.add(s.charAt(i));
            else
                continue;
        }
        char ch;
        for(ch='a';ch<='z';ch++)
        {
            if(!set.contains(ch))
            {
                System.out.println("not pangram");
                //System.out.println(ch);
                break;
            }
        }
        
        if(ch > 'z')
        System.out.println("pangram");
    }
}


