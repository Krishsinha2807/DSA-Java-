class Solution {
    public double average(int[] salary) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<salary.length;i++){
            if(salary[i]<min) min=salary[i];
            if(salary[i]>max) max=salary[i];
        }
        ArrayList<Double>list=new ArrayList<>();
        for(int i=0;i<salary.length;i++){
            list.add((double) salary[i]);
        }
        /*list.remove(Integer.valueOf(max));
        list.remove(Integer.valueOf(min));*/
        list.remove(Double.valueOf(max));
        list.remove(Double.valueOf(min));
        double arr[]=new double[list.size()];
        int idx=0;
        for(int i=0;i<list.size();i++){
            arr[idx]=list.get(i);
            idx++;
        } double sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        double avg=sum/arr.length;
        return avg;
        
    }
}