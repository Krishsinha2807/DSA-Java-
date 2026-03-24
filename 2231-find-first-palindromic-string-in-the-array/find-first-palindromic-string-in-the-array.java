class Solution {
    public String firstPalindrome(String[] words) {
        String s="";
        for(int i=0;i<words.length;i++)
        {
             s=words[i];
            int left=0;
            int right=s.length()-1;
            boolean ispalindrome=true;
            while(left<right)
            {
                if(s.charAt(left)!=s.charAt(right)){
                   ispalindrome=false;
                   break;
                }
                left ++;
                right--;
            }
           if(ispalindrome){
            return s;
           }
        }
        return "";
        
    }
}