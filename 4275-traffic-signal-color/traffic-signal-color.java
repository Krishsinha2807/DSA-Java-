class Solution {
    public String trafficSignal(int timer) {
        String g="Green";
        String o="Orange";
        String r="Red";
        String i="Invalid";
        if(timer==0){
            return g;
        }
        else if(timer ==30) return o;
        else if(timer >30 && timer <=90) return r;
        else return i;
        
    }
}