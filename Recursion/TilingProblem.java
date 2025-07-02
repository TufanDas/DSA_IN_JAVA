package Recursion;
/*
Problem:
You have a 2 x n board and tiles of size 2 x 1.
Count the number of ways to completely tile the board.
You can place a tile either vertically or horizontally.
*/

public class TilingProblem {

    // Recursive method to count the number of ways to tile a 2 x n board
    static int tilingProblem(int n) {
        // Base case: If n == 0 or n == 1, there's only one way to tile the board
        // - n == 0: empty board (1 way — do nothing)
        // - n == 1: one vertical tile (1 way)
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive case:

        // 1. Place one vertical tile → remaining board is 2 x (n - 1)
        int verticalWays = tilingProblem(n - 1);

        // 2. Place two horizontal tiles → they occupy 2 columns, so remaining board is 2 x (n - 2)
        int horizontalWays = tilingProblem(n - 2);

        // Total ways = ways from vertical + ways from horizontal
        return verticalWays + horizontalWays;
    }

    public static void main(String[] args) {
        int n = 2;  // Size of the board
        System.out.println(tilingProblem(n));  // Output the number of ways to tile a 2 x n board
    }
}
