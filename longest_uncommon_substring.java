class Solution {
    public int findLUSlength(String a, String b) {
        
        //First condtion, if teh 2 strings are equal then return -1
        if(a.equals(b))
            return -1;
        else if(!a.equals(b) && a.length() == b.length())
            return a.length();
        else
            //This is the case lihe abcd & abc ( partial subsequence match).
            return Math.max(a.length(),b.length());
        
    }
}
