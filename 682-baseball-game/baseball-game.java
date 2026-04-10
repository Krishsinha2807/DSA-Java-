class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>stack =new Stack<>();
        int sum=0;
        for(int i=0;i<operations.length;i++){
            String t=operations[i];
            if(!(t.equals("C")|| t.equals("D")||t.equals("+"))){
               stack.push(Integer.parseInt(t));
            }
            else if(t.equals("C")) stack.pop();
            else if(t.equals("D")) stack.push(2 * stack.peek());
            else if(t.equals("+")){
                int top =stack.pop();
                int nsum=top+stack.peek();
                stack.push(top);
                stack.push(nsum);
            }
        }
        for(int i=0;i<stack.size();i++){
            sum=sum+stack.get(i);
        }
        return sum;
        
    }
}