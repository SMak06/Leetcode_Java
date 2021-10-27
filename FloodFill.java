public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(newColor == image[sr][sc]) return image;
        int rows = image.length;
        int cols = image[0].length;
        int src = image[sr][sc];
        dfs(image, sr, sc, newColor, rows, cols, src);
        return image;
    }
    public void dfs(int[][] image, int sr, int sc, int newColor, int rows, int cols, int src) {
        if(sr < 0 || sc < 0 || sr >= rows || sc >= cols) return;
        else if (image[sr][sc] != src) return;
        
        image[sr][sc] = newColor;
        
        dfs(image, sr+1,sc,newColor,rows,cols,src);
        dfs(image, sr-1,sc,newColor,rows,cols,src);
        dfs(image, sr,sc+1,newColor,rows,cols,src);
        dfs(image, sr,sc-1,newColor,rows,cols,src);
    }
}
