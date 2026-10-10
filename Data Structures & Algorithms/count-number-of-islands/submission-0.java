class Solution {
    int[][] directions = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    public void dfs(char[][] grid, boolean[][] visited, int i, int j){
        if(i<0 || j<0 || i>= grid.length || j>= grid[0].length || visited[i][j]) return;
        visited[i][j] = true;
        if(grid[i][j] == '0') return;
        for(int[] dir: directions){
            dfs(grid, visited, i+dir[0], j+dir[1]);
        }
    }
    public int numIslands(char[][] grid) {
        int count = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    count++;
                    dfs(grid, visited, i, j);
                }
            }
        }
        return count;
    }
}
