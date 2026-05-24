class Solution {
    public int compareVersion(String version1, String version2) {
       /* double x=Double.parseDouble(version1);
        double y=Double.parseDouble(version2);
        if(x<y) return -1;
        else if(x>y) return 1;
        else return 0;*/
        String[] s1 = version1.split("\\.");
        String[] s2 = version2.split("\\.");
        int n = Math.max(s1.length, s2.length);
        for(int i = 0; i < n; i++) {
            int x = 0;
            int y = 0;
            if(i < s1.length) x = Integer.parseInt(s1[i]);
            if(i < s2.length) y = Integer.parseInt(s2[i]);
            if(x > y)  return 1;
            else if(x < y)  return -1;
        }
        return 0; 
    }
}