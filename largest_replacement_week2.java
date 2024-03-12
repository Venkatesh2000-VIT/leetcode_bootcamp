class Solution {
    public int characterReplacement(String s, int k) {
       int output = 0;
       int[] charcount = new int[26];
       int l=0;
       int maxval = 0;
       int r = 0;
       for(r=0;r<s.length();r++)
       {
           charcount[s.charAt(r)-'A'] +=1;
            maxval = Math.max(charcount[s.charAt(r)-'A'],maxval);
           if(maxval + k < r-l+1){
               charcount[s.charAt(l)-'A'] -= 1;
               l++;
           }
           else
                output = Math.max(output,r-l+1);
       }
       return output;
    }
}


/*
       
        int ret = 0;
        for(int i=0; i < s.length();i++){
            int k_dup = k;
            char c = s.charAt(i);
            int temp_max = 1;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(j)==c)
                    temp_max++;
                else{
                    if(k_dup <= 0)
                        break;
                    k_dup--;
                    temp_max++;
                }
                    
            }
            if(temp_max > ret)
                ret = temp_max;
        }

        for(int i=s.length() - 1;i> 0;i--){
            int k_dup = k;
            char c = s.charAt(i);
            int temp_max = 1;
            for(int j=i-1;j>=0;j--){
                if(s.charAt(j)==c)
                    temp_max++;
                else{
                    if(k_dup <= 0)
                        break;
                    k_dup--;
                    temp_max++;
                }
                    
            }
            if(temp_max > ret)
                ret = temp_max;
        }

        return ret;
        
    }
*/