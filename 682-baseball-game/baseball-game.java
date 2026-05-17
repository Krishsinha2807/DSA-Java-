class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<operations.length;i++){
            String temp=operations[i];
            if(!(temp.equals("+") || temp.equals("D")||temp.equals("C"))){
                stack.push(Integer.parseInt(temp));
            }
            else if(temp.equals("+")){
                int a=stack.pop();
                int nsum=a+stack.peek();
                stack.push(a);
                stack.push(nsum);
            }
            else if(temp.equals("D")) stack.push(2*stack.peek());
            else if(temp.equals("C")) stack.pop();
        } int sum=0;
        for(int i=0;i<stack.size();i++){
             sum=sum+stack.get(i);
        }
        return sum;
        
    }
}