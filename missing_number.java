//Missing numbers java soln

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] missingNumbers(int[] arr, int[] brr) {
        
        Arrays.sort(arr);
        Arrays.sort(brr);
        Map <Integer,Integer> map = new HashMap<>();
        for ( int i = 0 ; i < brr.length; i++) {
            if ( map.containsKey(brr[i])) 
                map.put(brr[i],map.get(brr[i]) - 1);
            else 
               map.put(brr[i],-1);
        }
        
        for ( int i = 0 ; i < arr.length; i++) {
             map.put(arr[i],map.get(arr[i]) + 1);
        }
        
        List<Integer> list = new ArrayList<>();
        Map <Integer,Integer> repeat = new HashMap<>();
        //System.out.println(map.get(204));
        for ( int i = 0 ; i < arr.length; i++) {
            if (map.get(arr[i])  != 0 ) {
                System.out.print("Inside if");
                
                list.add((int)arr[i]);
                repeat.put(arr[i],0);
            }
        }
        //list.add(204);
        System.out.println(list.size());
            
            int[] newarr = new int[list.size()];
            int i=0;
            for(Integer x:list)
            {
                newarr[i++] = x;
            }
            return newarr;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] brr = new int[n];
        for(int brr_i = 0; brr_i < n; brr_i++){
            brr[brr_i] = in.nextInt();
        }
        int[] result = missingNumbers(arr, brr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}


