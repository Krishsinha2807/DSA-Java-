class Solution {
    public int sumOfPrimesInRange(int n) {
        int rev=0;
        int n1=n;
        while(n>0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        } int count=0;
        int sum=0;
        int start =Math.min(n1,rev);
        int end=Math.max(n1,rev);
        for(int i=start;i<=end;i++){
            int temp=i;
            count =0;
            for(int j=1;j<=i;j++){
                if(i%j==0) count ++;
            }
            if(count ==2) sum=sum+i;
        }
        return sum;
    }
}