class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (sr<image.length && sc<image[0].length)
       { 
            int actual = image[sr][sc];
            boolean[][] visited = new boolean[image.length][image[0].length];
            int newcolor = newColor;
            System.out.println(image.length+" "+image[0].length);
            check(sr,sc,actual,newcolor,image,visited);
       } 
        return image;
    }
    
    void check(int i,int j,int actual,int newcolor,int[][] image,boolean[][] visited)
    {
            image[i][j] = newcolor;
            visited[i][j] = true;
            
            if(i-1>=0 && image[i-1][j]==actual && visited[i-1][j]==false)
                check(i-1,j,actual,newcolor,image,visited);
        
            if(i+1<image.length && image[i+1][j]==actual && visited[i+1][j]==false)
                check(i+1,j,actual,newcolor,image,visited);
        
            if(j-1>=0 && image[i][j-1]==actual && visited[i][j-1]==false)
                check(i,j-1,actual,newcolor,image,visited);
        
            if(j+1<image[0].length && image[i][j+1]==actual && visited[i][j+1]==false)
                check(i,j+1,actual,newcolor,image,visited);
        
    }
}