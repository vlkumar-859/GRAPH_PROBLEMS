import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] grid = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            boolean ans = obj.is_Possible(grid);
            if(ans)
                System.out.println("1");
            else 
                System.out.println("0");
        }
    }
}// } Driver Code Ends


class Solution
{
    public boolean is_Possible(int[][] grid)
    {
        boolean[][] visited = new boolean[grid.length][grid.length];
        int src_x = 0 , src_y = 0;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid.length;j++)
                if(grid[i][j]==1)
                {
                    src_x = i;
                    src_y = j;
                    break;
                }
                
        return check(src_x,src_y,visited,grid);
    }
    
    boolean check(int i,int j,boolean[][] visited,int[][] grid)
    {
        visited[i][j] = true;
        
        if (grid[i][j]==2)
            return true;
            
        if(i-1>=0 && grid[i-1][j]!=0 && visited[i-1][j]==false)
            if (check(i-1,j,visited,grid))
                return true;
            
        if(i+1<grid.length && grid[i+1][j]!=0 && visited[i+1][j]==false)
            if (check(i+1,j,visited,grid))
                return true;
            
        if(j-1>=0 && grid[i][j-1]!=0 && visited[i][j-1]==false)
            if (check(i,j-1,visited,grid))
                return true;
            
        if(j+1<grid.length && grid[i][j+1]!=0 && visited[i][j+1]==false)
            if (check(i,j+1,visited,grid))
                return true;
            
        return false;
            
    }
}