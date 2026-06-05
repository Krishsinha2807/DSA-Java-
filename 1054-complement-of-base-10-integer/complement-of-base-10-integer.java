class Solution {
    public int bitwiseComplement(int n) {
        String s=Integer.toBinaryString(n);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') sb.append('0');
            else sb.append('1');
        }
        String ans=sb.toString();  
        int deci=0,pow=0;
        for(int i=ans.length()-1;i>=0;i--){
            int d=ans.charAt(i)-'0';
            deci=deci+d*(int)Math.pow(2,pow);
            pow++;
        }
        return deci;
    }
}