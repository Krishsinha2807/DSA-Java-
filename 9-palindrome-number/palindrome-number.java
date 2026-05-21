class Solution {
    public boolean isPalindrome(int x) {
        int d=0;
        int rev=0;
        int n1=x;
        while(x>0)
        {
            d=x%10;
            rev=rev*10+d;
            x=x/10;
        }
        if(rev==n1){
            return true;
        }
        else{
            return false;
        }
        
    }
}