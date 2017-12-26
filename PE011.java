import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PE011 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> allProduct = new ArrayList<Integer>();
        //3 more rows, 6 more cols
        int[][] grid = new int[23][26];
        //numbers placed into 0-19 and 3-22 
        for(int grid_i=0; grid_i < 20; grid_i++){
            for(int grid_j=3; grid_j < 23; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        // diagonal 1 -> [i][j]*[i+1][j+1]*[i+2][j+2]*[i+3][j+3]
        // diagonal 2 -> [i][j]*[i+1][j-1]*[i+2][j-2]*[i+3][j-3]
        // vertical   -> [i][j]* [i+1][j] * [i+2][j] * [i+3][j]
        // horizontal -> [i][j]* [i][j+1] * [i][j+2] * [i][j+3]
        for(int i=0; i < 20; i++){
            for(int j=3; j < 23; j++){
                allProduct.add(grid[i][j]*grid[i+1][j+1]*grid[i+2][j+2]*grid[i+3][j+3]);
                allProduct.add(grid[i][j]*grid[i+1][j-1]*grid[i+2][j-2]*grid[i+3][j-3]);
                allProduct.add(grid[i][j]* grid[i+1][j] * grid[i+2][j] * grid[i+3][j] );
                allProduct.add(grid[i][j]* grid[i][j+1] * grid[i][j+2] * grid[i][j+3] );
            }
        }
        Collections.sort(allProduct);
        Collections.reverse(allProduct);
        System.out.println(allProduct.get(0));
        //preview board
        /*
        for(int grid_i=0; grid_i < 23; grid_i++){
            for(int grid_j=0; grid_j < 26; grid_j++){
                System.out.printf("%02d ",grid[grid_i][grid_j]);
            }
            System.out.println();
        }
        */
    }
}
