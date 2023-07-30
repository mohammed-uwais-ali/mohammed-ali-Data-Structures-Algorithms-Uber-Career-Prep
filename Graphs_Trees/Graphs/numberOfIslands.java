class numberOfIslands {
    //approach is to change the values to 0
    public int numIslands(char[][] grid) {
        int numIslands = 0;
        for(int i = 0; i < grid.length; i++ ){
            for (int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    dfsTraversal(grid, i, j);
                    numIslands++;
                }
            }
        }

        return numIslands;
    }

    public void dfsTraversal(char[][] grid, int row, int col){
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == '0'){
            return;
        }

        //set that place to 0 if an island piece
        grid[row][col] = '0';
        //traverse four places
        dfsTraversal(grid, row + 1, col); //down
        dfsTraversal(grid, row -1, col); //up
        dfsTraversal(grid, row, col + 1); //right
        dfsTraversal(grid, row, col - 1); //left
    }
}