class Solution {
    public String clearDigits(String s) {
        Stack<Character>stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!stack.isEmpty() && Character.isDigit(ch)) stack.pop();
            else stack.push(ch);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<stack.size();i++){
            sb.append(stack.get(i));
        }
        return sb.toString();
        
    }
}