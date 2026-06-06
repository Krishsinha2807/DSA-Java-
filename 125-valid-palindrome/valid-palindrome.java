class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return check(s,0); 
    }
    public boolean check(String s,int i){
        int n=s.length();
        if(i>=s.length()/2) return true;
        if(!Character.isLetterOrDigit(s.charAt(i))) return check(s,i+1);
        if(!Character.isLetterOrDigit(s.charAt(n-i-1))) return check(s,i+1);
        if(s.charAt(i)!=s.charAt(n-i-1)) return false;
        return check(s,i+1);
    }
}