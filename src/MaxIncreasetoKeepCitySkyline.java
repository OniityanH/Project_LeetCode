/* public class MaxIncreasetoKeepCitySkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {

        int[][] Max_grid = new int[grid[0].length][grid[1].length];
        int Max_row = 0;
        int Max_col = 0;
        int temp_col;
        int temp_row;
        int sum = 0;

        for (int i = 0; i< grid[0].length; i++){
            for (int j = 0; j< grid[1].length; j++){
                //start each element to compare

                temp_col = grid[i][j];
                Max_col = grid[i][j];
                temp_row = grid[i][j];
                Max_row = grid[i][j];

                for (int compare_i = 0; compare_i < grid[0].length; compare_i++){
                    if (temp_col < grid[compare_i][j]){
                        Max_col = grid[compare_i][j];
                        temp_col = grid[compare_i][j];
                    }
                }

                for (int compare_j = 0; compare_j < grid[1].length; compare_j++){
                    if (temp_row < grid[i][compare_j]){
                        Max_row = grid[i][compare_j];
                        temp_row = grid[i][compare_j];
                    }
                }

                if (Max_col > Max_row){
                    Max_grid[i][j] = Max_row;
                }
                else {
                    Max_grid[i][j] = Max_col;
                }
            }
        }
        for (int i = 0; i< grid[0].length; i++){
            for (int j = 0; j< grid[1].length; j++) {
                System.out.print(Max_grid[i][j]);
            }
            System.out.print("|");
        }
        for (int i = 0; i< grid[0].length; i++){
            for (int j = 0; j< grid[1].length; j++) {
                sum = sum + Max_grid[i][j] - grid[i][j];
            }
        }
        return sum;
    }
}
 */