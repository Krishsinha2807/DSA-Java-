class Solution {
    public boolean checkGoodInteger(int n) {
        int ds=0;
        int n1=n;
        while(n>0){
            int d=n%10;
            ds=ds+d;
            n=n/10;
        }
        int ss=0;
        while(n1>0){
            int d1=n1%10;
            ss=ss+(d1*d1);
            n1=n1/10;
        }
        if(ss-ds>=50) return true;
        return false;
        
    }
}