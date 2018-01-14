//Seperate numbers and check if first is one less than the second number.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static boolean find(String s, String first) {
        if(s == null)
            return true;
        if(s.length() == 0)
            return true;
        String next = Long.toString(Long.parseLong(first) + 1); 
        if(s.startsWith(next))
            return find(s.substring(next.length()), next);
        return false;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int i = 0; i < q; i++){
            String s = in.next();
            boolean flag = false;
            // your code goes here
            for(int j=1;j<=s.length()/2;j++){
                String first = s.substring(0, j);
                if(find(s.substring(j), first)){
                    flag = true;
                    System.out.println("YES " + first);
                    break;
                }
            }
            if(!flag)
                System.out.println("NO");
        }
    }
}
