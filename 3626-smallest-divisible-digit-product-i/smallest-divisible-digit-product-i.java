class Solution {
    public int smallestNumber(int n, int t) {
        int p=1;
        int temp=0;
        int temp1=0;
        for(int i=n;i<=n*t;i++){
            temp=i;
            p=1;
            temp1=temp;
            while(temp>0){
                int d=temp%10;
                p=p*d;
                temp=temp/10;
            }
            if(p%t==0) return temp1;
        }
        return -1;

        
    }
}