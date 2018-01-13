// Kangaroo question hackerrank.
/*

There are two kangaroos on a number line ready to jump in the positive direction (i.e, toward positive infinity). The first kangaroo starts at location  and moves at a rate of  meters per jump. The second kangaroo starts at location  and moves at a rate of  meters per jump. Given the starting locations and movement rates for each kangaroo, can you determine if they'll ever land at the same location at the same time?

Input Format

A single line of four space-separated integers denoting the respective values of , , , and .

Output Format

Print YES if they can land on the same location at the same time; otherwise, print NO.

Note: The two kangaroos must land at the same location after making the same number of jumps.

Sample Input 0

0 3 4 2
Sample Output 0

YES
*/


//
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
        // variables to hold the values of sum1 and sum2 respectively.
        if(x2>x1 && v2>v1)
                return "NO";
        if(x1>x2 && v1>v2)
                return "NO";
        int temp1=x1, temp2 = x2;
        while(x1!=x2)
        {
            if(temp1<temp2 && x1>x2)
                return "NO";
            if(temp1>temp2 && x1<x2)
                return "NO";
            x1 = x1 + v1;
            x2 = x2 + v2;
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}


