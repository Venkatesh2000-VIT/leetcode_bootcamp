class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.length() == 0)
            return 0;
        long ret = 0;
        boolean isNegative = false;
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) == '-' && i == 0){
                isNegative = true;
                continue;
            }
            else if(s.charAt(i) == '+' && i == 0)
                continue;
            if(!Character.isDigit(s.charAt(i))){
                if( ret > 2147483647)
                    return isNegative ? -2147483648 : 2147483647;
                return isNegative  ? (int)-ret : (int)ret;
            }
            if(Character.isDigit(s.charAt(i))){
                ret = ret*10 + Character.getNumericValue(s.charAt(i));
                if( ret > 2147483647)
                    return isNegative ? -2147483648 : 2147483647;
            }
        }
      if(ret > 2147483647)
            return isNegative ? -2147483648 : 2147483647;
        return isNegative  ? (int)-ret : (int)ret;
    }
}

/*
if((s.charAt(i) >= 'a' && s.charAt(i)  <= 'z') ||
            (s.charAt(i) >= 'A' && s.charAt(i)  <= 'Z') || s.charAt(i)=='.'){
                if( ret > 2147483647)
                    return isNegative ? -2147483648 : 2147483647;
                return isNegative  ? (int)-ret : (int)ret;
            }
*/