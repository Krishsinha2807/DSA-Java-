class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int radius = 0;
        for(int i = 0; i < houses.length; i++) {
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < heaters.length; j++) {
                int dist = Math.abs(houses[i] - heaters[j]);
                min = Math.min(min, dist);
            }
            radius = Math.max(radius, min);
        }
        return radius;
    }
}