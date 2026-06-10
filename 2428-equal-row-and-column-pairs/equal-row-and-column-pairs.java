class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<grid.length;j++){
                sb.append(grid[i][j]).append(":");
            }
            String row=sb.toString();
            map.put(row,map.getOrDefault(row,0)+1);
        } int res=0;
        for(int i=0;i<grid.length;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<grid.length;j++){
                sb.append(grid[j][i]).append(":");
            }
            String col=sb.toString();
            if(map.containsKey(col)) res=res+map.get(col);
        }
        return res;
        
    }
}