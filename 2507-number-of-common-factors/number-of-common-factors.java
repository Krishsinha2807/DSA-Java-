class Solution {
    public int commonFactors(int a, int b) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i=1;i<=a;i++)
        {  
           if(a%i==0)
           {
            list.add(i);
           } 
        }
        for(int i=1;i<=b;i++)
        {  
           if(b%i==0)
           {
            list1.add(i);
           } 
        }   ArrayList<Integer> intersection = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list1.contains(list.get(i))) {
                intersection.add(list.get(i));
            }
        }
        return intersection.size();
        
    }
}