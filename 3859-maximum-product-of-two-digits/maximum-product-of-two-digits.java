class Solution {
    public int maxProduct(int n) {
        int n1=n;
        int p=1;
        int c=0;
        while(n>0){
            int d=n%10;
            c++;
            n=n/10; 
        }
       int arr[]=new int[c];
       int idx=0;
       while(n1>0){
        int d1=n1%10;
        arr[idx]=d1;
        idx++;
        n1=n1/10;
       } int max=0;
       for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            max=Math.max(max,arr[i]*arr[j]);
        }
       }
       return max;
       
    }
}