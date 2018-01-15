// Icrecream parlor question Java
/*
Each time Sunny and Johnny take a trip to the Ice Cream Parlor, they pool together  dollars for ice cream. On any given day, the parlor offers a line of  flavors. Each flavor, , is numbered sequentially with a unique ID number from  to  and has a cost, , associated with it.

Given the value of  and the cost of each flavor for  trips to the Ice Cream Parlor, help Sunny and Johnny choose two flavors such that they spend their entire pool of money () during each visit. For each trip to the parlor, print the ID numbers for the two types of ice cream that Sunny and Johnny purchase as two space-separated integers on a new line. You must print the smaller ID first and the larger ID second.

Note: Two ice creams having unique IDs  and  may have the same cost (i.e., ).

Input Format

The first line contains an integer, , denoting the number of trips to the ice cream parlor. The  subsequent lines describe all of Sunny and Johnny's trips to the parlor; each trip is described as follows:

The first line contains .
The second line contains .
The third line contains  space-separated integers denoting the cost of each respective flavor. The  integer corresponding to the cost, , for the ice cream with ID number  (where ).
Constraints




, where 
It is guaranteed that there will always be a unique solution.
Output Format

Print two space-separated integers denoting the respective ID numbers for the flavors they choose to purchase, where the smaller ID is printed first and the larger ID is printed second. Recall that each ice cream flavor has a unique ID number in the inclusive range from  to .

Sample Input

2
4
5
1 4 5 3 2
4
4
2 2 4 3

Sample Output

1 4
1 2

*/




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] icecreamParlor(int m, int[] arr) {
        // Complete this function
        // I will approach this problem using HashMap.
        // If the complement value isn't present in map,push the current value onto map,
        // else return the indexes of values which make up teh required value.
        // Im using a one-pass approach to solve this program.
        //here 'm' denotes the pool of money available.
        
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(m - arr[i]))
            {
                return new int[]{map.get(m-arr[i])+1, i+1};
            }
            else
                map.put(arr[i],i);
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int m = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            int[] result = icecreamParlor(m, arr);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
            }
            System.out.println("");


        }
        in.close();
    }
}


