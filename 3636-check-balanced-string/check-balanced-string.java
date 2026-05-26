class Solution {
    public boolean isBalanced(String num) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            list.add(ch-'0');
        }
        int evensum=0;
        int oddsum=0;
        for(int i=0;i<list.size();i++){
            if(i%2==0) evensum=evensum+list.get(i);
            else oddsum=oddsum+list.get(i);
        }
        if(oddsum==evensum) return true;
        return false;
        
    }
}