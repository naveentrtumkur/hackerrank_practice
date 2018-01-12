//Equalize array -- TO delete the minimum elments to make all elemnts of array equal.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int equalizeArray(int[] arr) {
        // Complete this function
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int  count =0 , ElemRef =0;
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(arr[i]))
            {
               map.put(arr[i],1); 
            }
            else
            {
                map.put(arr[i], map.get(arr[i]) +1);
            }
            if(map.get(arr[i]) > count)
            {
                count = map.get(arr[i]);
                ElemRef = arr[i];
            }
        }
         
        return (arr.length - count);
            
        }
        

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = equalizeArray(arr);
        System.out.println(result);
        in.close();
    }
}


