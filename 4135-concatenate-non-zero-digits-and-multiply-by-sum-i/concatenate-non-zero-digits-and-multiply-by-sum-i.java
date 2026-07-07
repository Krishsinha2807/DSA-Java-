class Solution {
    public long sumAndMultiply(int n) {
        String res="";
        long sum=0;
        while(n>0){
            long d=n%10;
            if(d!=0){
                res=res+d;
                sum=sum+d;
            }
            n=n/10;
        }
        if(res.isEmpty()) return 0;//khaali
        String ans="";
        for(int i=res.length()-1;i>=0;i--){
            ans+=res.charAt(i);
        }
        long r=Long.parseLong(ans);
        return r*sum;
    }
}