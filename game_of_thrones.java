// Game of thrones to check whetehr given a string s there exists an anagram of it which is palindrome.
// If found return Yes else return No;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String gameOfThrones(String s){
        // Complete this function
        int[] letters = new int[26];
        int count_1 = 0, even=1;
        if(s.length() %2 ==0)
            even =1;
        for(int i=0;i<s.length();i++)
        {
            int val = (int)(s.charAt(i)-'a');
            //System.out.println(val);
            letters[val]++;
        }
        
        for(int i=0;i<26;i++)
        {
            if(even == 0 || even ==1)
            {
                if(count_1>1)
                    return "NO";
            }
            if((letters[i]%2)==0)
                continue;
            else if(even == 1 && letters[i]%2!=0)
                count_1++;
            //else
              //  return "NO";
        }
        
        return "YES";
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = gameOfThrones(s);
        System.out.println(result);
    }
}


