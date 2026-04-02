class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>stack =new Stack<>();
        Stack<Character>stack1 =new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                stack.push(s.charAt(i));
            }
            else{
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (ch != '#') {
                stack1.push(ch);
            } else {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            }
        }
        return stack.equals(stack1);
    }
}