class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<nums.length;i++){
        sb.append(nums[i]);
       }
       int c=0;
     for(int i=0;i<sb.length();i++){
        char ch=sb.charAt(i);
        int num=ch-'0';
        if(num == digit){
            c++;

        }
     }
     return c;
    }
}