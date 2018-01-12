//Bon_appetit Java program Hackerrank.
/*
Anna and Brian order  items at a restaurant, but Anna declines to eat any of the  item (where ) due to an allergy. When the check comes, they decide to split the cost of all the items they shared; however, Brian may have forgotten that they didn't split the  item and accidentally charged Anna for it.

You are given , , the cost of each of the  items, and the total amount of money that Brian charged Anna for her portion of the bill. If the bill is fairly split, print Bon Appetit; otherwise, print the amount of money that Brian must refund to Anna. It is guaranteed that the amount will always be an integer.

Input Format

The first line contains two space-separated integers denoting the respective values of  (the number of items ordered) and  (the -based index of the item that Anna did not eat). 
The second line contains  space-separated integers where each integer  denotes the cost, , of item  (where ). 
The third line contains an integer, , denoting the amount of money that Brian charged Anna for her share of the bill.

Output Format

If Brian did not overcharge Anna, print Bon Appetit on a new line; otherwise, print the difference (i.e., ) that Brian must refund to Anna (it is guaranteed that this will always be an integer).

Sample Input 0

4 1
3 10 2 9
12
Sample Output 0

5

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int bonAppetit(int n, int k, int b, int[] ar) {
        // Complete this function
        
        //Anna won't eat every kth item. Don't include that in the total bill
        int total =0;
        for(int i=0;i<n;i++)
        {
            if((i==k))
            {
               //k = 2*k;
                continue;
            }
            total = total + ar[i];
        }
        
        if(total/2 == b)
        {
            //System.out.println("Bon Apetit");
            return 0;
        }
            return (b - total/2);
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        int result = bonAppetit(n, k, b, ar);
        if(result==0)
            System.out.println("Bon Appetit");
        else
            System.out.println(result);
    }
}


