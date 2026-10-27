class Solution {
    public String[] createGrid(int m, int n) {
        char[][] rows = new char[2][n];


        for (int i = 0; i < 2; i++)
            for (int j = 0; j < n; j++)
                if (i == 0 || j == n - 1)
                    rows[i][j] = '.';
                else
                    rows[i][j] = '#';


        String[] grid = new String[m];
        grid[0] = new String(rows[0]);


        if (m > 1)
            grid[1] = new String(rows[1]);


        for (int i = 2; i < m; i++)
            grid[i] = grid[1];


        return grid;
    }
}