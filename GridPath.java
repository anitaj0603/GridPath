public class GridPath {

    public GridPath(int[][]values)
    {
        grid=values;
    }

    private int[][] grid;

    public Location getNextLoc(int row, int col)
    {
        return null;
    }

    public int sumPath(int row, int col) 
    {
        return 0;
    }

    public String toString()
    {
        String s = "";
        for (int row = 0; row <grid.length; row++)
        {
            for(int col = 0; col< grid[0].length;col++)
            {
                s+=grid[row][col]+ " ";
            }
            s+= "\n";
        }
        return s;
    }

    public String toString()
    {
        String s = "";
        for(int[] row : grid) 
        {
            for(int col :row) {
                s+= col + " ";
            }
            s += "\n";
        }
        return s;
    }
        
}