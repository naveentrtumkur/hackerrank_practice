class Solution {
    public String convertToBase7(int num) {
        if(num == 0)
            return "0";
        StringBuffer sb = new StringBuffer();
        int ans ;
        int sign = (num>=0)?1:-1;
        num = num<0?-num:num;
        
        while(num!=0)
        {
            ans =  num%7;
            num = num/7;
            sb.append(ans);
        }
        if (sign== -1)
            sb.append('-');
        
       return sb.reverse().toString();
        
        
    }
}

