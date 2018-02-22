class Solution {
    public int numIslands(char[][] grid) {
        
        if(grid == null || grid.length==0)
            return 0;
        int count =0;
        
        int rc = grid.length;
        int cc = grid[0].length;
        
        for( int i=0;i<rc;i++)
        {
            for(int j=0;j<cc;j++)
            {
                if(grid[i][j] == '1'){
                    count++;
                
                    dfs(grid,i,j);
            }
        }
        }
        return count;
        
}
    public void dfs(char[][] grid, int r,int c)
    {
        int rc = grid.length;
        int cc = grid[0].length;
        
        //if(grid[r][c] == '1')
            
        
        //Base condition to return teh value.
        if(r<0 || c <0 || r>= rc|| c >= cc || grid[r][c] == '0')
            return;
        
        grid[r][c] ='0';
        
        //Traverse all the neighboring nodes to find if a value of 1 is there.
        dfs(grid, r-1,c);
        dfs(grid,r+1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);
        
        
    }
}
