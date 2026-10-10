class Solution {
    record Node(int i, int j){}
    int[][] directions = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    public void bfs(int[][] grid, int i, int j){
        Node n = new Node(i, j);
        Queue<Node> q = new LinkedList<>();
        q.offer(n);
        int d = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        while(!q.isEmpty()){
            int size = q.size();
            for(int k=0; k<size; k++){
                Node current = q.poll();
                grid[current.i][current.j] = Math.min(grid[current.i][current.j], d);
                visited[current.i][current.j] = true;
                for(int[] dir: directions){
                    Node newDir = new Node(current.i+dir[0], current.j+dir[1]);
                    if(newDir.i >=0 && newDir.j >=0 && newDir.i < grid.length && newDir.j < grid[0].length){
                        if(grid[newDir.i][newDir.j] > 0 && !visited[newDir.i][newDir.j]){
                            System.out.print("("+newDir.i +" "+newDir.j+")");
                            q.offer(newDir);
                        }
                    }
                }
            }
            System.out.println();
            d++;
        }
    }
    public void islandsAndTreasure(int[][] grid) {
        if(grid.length == 0) return;
        if(grid[0].length == 0) return;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] == 0){
                    bfs(grid, i, j);
                }
            }
        }
    }
}
