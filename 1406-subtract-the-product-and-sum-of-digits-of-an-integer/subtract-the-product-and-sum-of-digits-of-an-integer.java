class Solution {
    public int subtractProductAndSum(int n) {
        int p=1;
        int n1=n;
        int sum=0;
        while(n>0){
            int d=n%10;
            p=p*d;
            n=n/10;
        }
        while(n1>0){
            int d=n1%10;
            sum=sum+d;
            n1=n1/10;
        }
        return p-sum;
        
    }
}