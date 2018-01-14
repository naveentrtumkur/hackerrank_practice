// Implementation of caeser cipher algorithm for encryption.

/*
Julius Caesar protected his confidential information by encrypting it in a cipher. Caesar's cipher rotated every letter in a string by a fixed number, , making it unreadable by his enemies. Given a string, , and a number, , encrypt  and print the resulting string.

Note: The cipher only encrypts letters; symbols, such as -, remain unencrypted.

Input Format

The first line contains an integer, , which is the length of the unencrypted string. 
The second line contains the unencrypted string, . 
The third line contains the integer encryption key, , which is the number of letters to rotate.

Constraints 
 
 
 is a valid ASCII string and doesn't contain any spaces.

Output Format

For each test case, print the encoded string.

Sample Input

11
middle-Outz
2
Sample Output

okffng-Qwvb

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String caesarCipher(String s, int k) {
        // Complete this function
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<s.length();i++)
        {
            char ch;
            int letterCount;
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                
               letterCount = (int) s.charAt(i) + k;
                while(letterCount > 122)
                {
                    letterCount = 97 + (letterCount - 122) -1 ;
                }
                
                ch = (char) letterCount;
            }
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            {
                
               letterCount =  (int) s.charAt(i)  + k;
                while(letterCount > 90)
                {
                    letterCount = 65 + (letterCount - 90) -1 ;
                }
                
                ch = (char) letterCount;
             }
            else
        
                ch = s.charAt(i);
            
            
            sb.append(ch);
                
            }
        
        return sb.toString();
       
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        String result = caesarCipher(s, k);
        System.out.println(result);
        in.close();
    }
}


