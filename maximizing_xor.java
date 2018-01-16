
// Maximising Xor value

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int maximizingXor(int l, int r) {
        // Complete this function
        // x = xor of two values.
        // left shift max and right shift x-value.
        int x = l ^ r;
		int max = 0;
		while(x > 0)
		{
			max <<= 1;
			max |= 1;
			x >>= 1;
		}
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int r = in.nextInt();
        int result = maximizingXor(l, r);
        System.out.println(result);
        in.close();
    }
}


