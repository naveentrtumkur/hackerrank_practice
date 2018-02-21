import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        // SCanner object to take an input from user.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        char[] str = A.toCharArray();
        char temp;
        int p1 = 0, p2 = A.length()-1;
        while(p1 < p2)
        {
          temp = str[p1];
            str[p1] = str[p2];
            str[p2] = temp;
            p1++;
            p2--;
        }
        
        if(A.equals(String.valueOf(str)))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}


