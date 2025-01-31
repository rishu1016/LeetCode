class Solution {
    public int largestIsland(int[][] grid) {
      
        Map<Integer,Integer> islandSizes = new HashMap<>();
        int islandNum = 2; 
        int maxIslandSize = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] != 1)
                    continue;
                islandSizes.put(islandNum, dfs(islandNum, grid, i,j));
                islandNum++;
            }
        }

        if(islandSizes.size() == 0)
            return 1; 
        if(islandSizes.size() == 1){ 
            int s = islandSizes.get(islandNum-1);
            if(s == grid.length * grid[0].length)
                return s;
            return s+1;
        }

        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] != 0)
                    continue;
                
                Set<Integer> neighboringIslands = new HashSet<>(); 
                byte[] di = new byte[] {1,0,-1,0};
                byte[] dj = new byte[] {0,-1,0,1};
                for(int k = 0; k < 4; k++){
                    int ni = i + di[k];
                    int nj = j + dj[k];
                    if(ni < 0 || nj < 0 || ni >= grid.length || nj >= grid[0].length)
                        continue;
                    neighboringIslands.add(grid[ni][nj]); 
                }
                int potentialIslandSize = 0;
                for(Integer island: neighboringIslands)
                    potentialIslandSize += islandSizes.getOrDefault(island,0);
                
                potentialIslandSize++;
                maxIslandSize = potentialIslandSize  > maxIslandSize ? potentialIslandSize : maxIslandSize;
            }
        }
        return maxIslandSize;
    }
    public int dfs(int islandNum, int[][] grid, int i, int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == islandNum || grid[i][j] == 0)
            return 0;
        grid[i][j] = islandNum;
        int size = 1;
        size += dfs(islandNum, grid, i+1,j);
        size += dfs(islandNum, grid, i-1,j);
        size += dfs(islandNum, grid, i,j+1);
        size += dfs(islandNum, grid, i,j-1);
        return size;
    }
}