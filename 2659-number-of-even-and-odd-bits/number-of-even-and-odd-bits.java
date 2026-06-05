class Solution {
    public int[] evenOddBit(int n) {
        /*String s=Integer.toBinaryString(n);
        int odd=0;
        int even=0;
        int arr[]=new int[2];
        for(int i=s.length()-1;i>=0;i--){
            if(i%2==0 && s.charAt(i)=='1') even++;
            else if(i%2!=0 && s.charAt(i)=='1') odd++;
        }
        arr[0]=even;
        arr[1]=odd;
        return arr;*/
        String s = Integer.toBinaryString(n);
        int even = 0;
        int odd = 0;
        int pos = 0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) == '1'){
                if(pos % 2 == 0) even++;
                else odd++;
            }
            pos++;
        }
        return new int[]{even, odd}; 
    }
}