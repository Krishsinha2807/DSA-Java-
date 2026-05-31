class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long mass2=mass;
        for(int i=0;i<asteroids.length;i++){
            if((asteroids[i]>mass2)){
                //mas=mass+asteroids[i];//
                return false;
            }
            mass2=mass2+asteroids[i];
        }
        return true;  
    }
}