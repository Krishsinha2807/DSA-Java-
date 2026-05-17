class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer>stack=new Stack<>();
       for(int i=0;i<tokens.length;i++){
        String temp=tokens[i];
        if(temp.equals("+")) {
            int a=stack.pop();
            int b=stack.pop();
            stack.push(a+b);
        }
       else if(temp.equals("-")){
            int a=stack.pop();
            int b=stack.pop();
            stack.push(b-a);
        }
        else if(temp.equals("*")){
            stack.push(stack.pop()*stack.pop());
        }
        else if(temp.equals("/")){
            int a=stack.pop();
            int b=stack.pop();
            stack.push(b/a);
        }else  stack.push(Integer.parseInt(temp));
       }
        return stack.pop();
    }
}