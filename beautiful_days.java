/*
Lily likes to play games with integers and their reversals. For some integer , we define  to be the reversal of all digits in . For example, , , and .

Logan wants to go to the movies with Lily on some day  satisfying , but he knows she only goes to the movies on days she considers to be beautiful. Lily considers a day to be beautiful if the absolute value of the difference between  and  is evenly divisible by .

Given , , and , count and print the number of beautiful days when Logan and Lily can go to the movies.

Input Format

A single line of three space-separated integers describing the respective values of , , and .

Constraints



Output Format

Print the number of beautiful days in the inclusive range between  and .

Sample Input

20 23 6
Sample Output

2

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int beautifulDays(int i, int j, int k) {
        // Complete this function
        //count the number of beautiful days.
        int count =0;
        for(;i<=j;i++)
        {
           if((Math.abs(i-reversed(i))%k) ==0)
               count++;
        }
        return count;
    }
    
    //A reversed function to reverse the digits 
    static int reversed(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum = sum *10 + n%10;
            n= n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        in.close();
    }
}


