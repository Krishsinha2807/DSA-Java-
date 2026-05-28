class Solution {
    public int sumOfPrimesInRange(int n) {
        int r=0;
        int n1=n;
        while(n>0){
            int d=n%10;
            r=r*10+d;
            n=n/10;
        } int sum=0;
        int max=Math.max(n1,r);
        int min=Math.min(n1,r);
        for(int i=min;i<=max;i++){
            if(isPrime(i)) sum=sum+i;
        }   
        return sum;
    }
    boolean isPrime(int x){
        int count=0;
        for(int j=1;j<=x;j++){
            if(x%j==0) count ++;
        }
        if(count==2) return true;
        return false;
    }
}