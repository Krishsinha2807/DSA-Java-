class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int dp[]=new int[A.length];
        int i=0;
        int j=A.length;
        int k=B.length;
        HashSet<Integer>set=new HashSet<>();//pehla 
        HashSet<Integer>set1=new HashSet<>();//dusra
        int count=0;
        int idx=0;
        while(i<j && i<k){
            set.add(A[i]);
            set1.add(B[i]);
            if(set1.contains(A[i])) count ++;
            if(A[i]!=B[i] && set.contains(B[i])) count ++;
            dp[idx]=count;
            idx++;
            i++;
        }
        return dp;
    }
}