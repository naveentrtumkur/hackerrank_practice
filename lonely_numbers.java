import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int lonelyinteger(int[] a) {
        // Complete this function
        // I have used bit-manipulation to solve this problem.
        // We know that using Xor, if two numbers are repeated then they cancel out each other.
        // Th eresult would be just the lonely number.
        int res=0;
        for(int i=0;i<a.length;i++)
        {
            res = res ^ a[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = lonelyinteger(a);
        System.out.println(result);
    }
}


