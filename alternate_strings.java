/*
String  always consists of two distinct alternating characters. For example, if string 's two distinct characters are x and y, then t could be xyxyx or yxyxy but not xxyy or xyyx.

You can convert some string  to string  by deleting characters from . When you delete a character from , you must delete all occurrences of it in . For example, if  abaacdabd and you delete the character a, then the string becomes bcdbd.

Given , convert it to the longest possible string . Then print the length of string  on a new line; if no string  can be formed from , print  instead.


*/

import java.util.*;

public class Solution {
static int twoCharaters(String s) {
    int count = 0;
    int output = 0;
    char[] c = s.toCharArray();
    if (c.length == 2) {
        if (c[0] != c[1]) {
            count = 2;
        }
    } else if (c.length < 2) {
        count = 0;
    } else {
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                // calling the method with all combination of (a pair of character)
                output = checkDistinct(c[i], c[j], c);
                if (output > count) {
                    count = output;
                }
            }
        }
    }
    return count;
}
// method to check weather the given char[] is having distinct char or not. if yes then send the length
private static int checkDistinct(char c, char c1, char[] ca) {
    StringBuffer sb = new StringBuffer();
    boolean flag = false;
    for (int i = 0; i < ca.length; i++) {
        if (ca[i] == c || ca[i] == c1) {
            sb.append(ca[i]);
        }
    }
    for (int i = 0; i < sb.length() - 1; i++) {
        if (sb.charAt(i) != sb.charAt(i + 1)) {
            flag = true;
        } else {
            return 0;
        }
    }
    if (flag = true) {
        return sb.length();
    }
    return 0;
}

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int l = in.nextInt();
    String s = in.next();
    int result = twoCharaters(s);
    System.out.println(result);
    in.close();
}
}
