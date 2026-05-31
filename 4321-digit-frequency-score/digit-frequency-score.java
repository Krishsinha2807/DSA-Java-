class Solution {
    public int digitFrequencyScore(int n) {
        int freq[]=new int[26];
        int d=0;
        while(n>0){
            d=n%10;
            freq[d]++;
            n=n/10;
        } int sum=0;
        for(int i=0;i<freq.length;i++){
          sum=sum+freq[i]*i;
        }
        return sum;
        
    }
}