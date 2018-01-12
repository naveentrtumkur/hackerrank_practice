//Hurdle race using Java.
/*

Dan is playing a video game in which his character competes in a hurdle race by jumping over  hurdles with heights . He can initially jump a maximum height of  units, but he has an unlimited supply of magic beverages that help him jump higher! Dan can drink any number magic beverages and the maximum height he can jump during the entire race increases by the number of magic beverages he drink.

Given , , and the heights of all the hurdles, find and print the minimum number of magic beverages Dan must drink to complete the race.

Input Format

The first line contains two space-separated integers describing the respective values of  (the number of hurdles) and  (the maximum height he can jump without consuming any beverages). 
The second line contains  space-separated integers describing the respective values of .

Constraints



Output Format

Print an integer denoting the minimum number of magic beverages Dan must drink to complete the hurdle race.

Sample Input 0

5 4
1 6 3 5 2
Sample Output 0

2

*/



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int hurdleRace(int k, int[] height) {
        // Complete this function
        int max = Integer.MIN_VALUE;
        for( int i=0;i<height.length;i++)
        {
            if(height[i] > max)
                max = height[i];
        }
        
        if(k>max)
            return 0;
        else 
            return (max - k);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i = 0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        int result = hurdleRace(k, height);
        System.out.println(result);
        in.close();
    }
}


