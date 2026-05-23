class Solution {
    public int strStr(String haystack, String needle) {
        boolean flag;
        if(haystack.contains(needle)) flag=true;
        else flag=false;
        if(flag==true) return haystack.indexOf(needle);
        return -1;

        
    }
}