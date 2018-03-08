class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> set = new HashSet<Character>();
        for(int i=0;i<J.length();i++)
        {
            set.add(J.charAt(i));
        }
        
        int count =0;
        
        for(int j=0;j<S.length();j++)
        {
            if(set.contains(S.charAt(j)))
                count++;
        }
        return count;
    }
}
