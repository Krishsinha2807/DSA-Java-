class Solution {
    public int[] shortestToChar(String s, char c) {
        int arr[]= new int[s.length()];
        int idx=0;
        for(int i=0;i<s.length();i++){
             int min=Integer.MAX_VALUE;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==c) min=Math.min(min,Math.abs(i-j));
            }
            arr[i]=min;
        }
        return arr;  
    }
}