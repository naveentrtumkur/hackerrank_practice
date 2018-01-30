import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long marcsCakewalk(int[] calorie) {
        // Complete this function
        //Integer[] cubes = new Integer[] {calorie};
        //Arrays.sort(cubes, Collections.reverseOrder());


        Arrays.sort(calorie);
        long sum =0;
        int j=0;
        for(int i=calorie.length-1;i>=0;i--)
        {
            sum = sum + (long) (calorie[i] * Math.pow(2,j));
            j++;
            //System.out.println("Value="+calorie[i] * Math.pow(2,i));
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calorie = new int[n];
        for(int calorie_i =0; calorie_i < n; calorie_i++){
            calorie[calorie_i] = in.nextInt();
        }
        long result = marcsCakewalk(calorie);
        System.out.println(result);
        in.close();
    }
}


