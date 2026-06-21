class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max=0;
        for(int i = 0; i < costs.length; i++) {
            max = Math.max(max, costs[i]);
        }
        int[] freq = new int[max + 1];
        for(int i = 0; i < costs.length; i++) {
            freq[costs[i]]++;
        }
        int count = 0;
        for(int price = 0; price <= max; price++) {
            while(freq[price] > 0 && coins >= price) {
                coins -= price;
                count++;
                freq[price]--;
            }
        }
        return count;
       /* Arrays.sort(costs);
        int count=0;
        for(int i=0;i<costs.length;i++){
            if(costs[i]<=coins){
                coins=coins-costs[i];//7-1,6-3,3-2
                count++;
            }
            else break;
        }
        return count;*/
        
        
    }
}