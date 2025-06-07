package Arrays2d;
//https://leetcode.com/problems/richest-customer-wealth/submissions/1656337395/

public class maxWealth {
    public static void main(String[] args) {
        // 2D array representing wealth of customers (each row = one customer, each column = bank account)
        int arr[][] = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};

        // Initialize MaxWealth with the smallest possible integer value
        int MaxWealth = Integer.MIN_VALUE;

        // Loop through each customer (each row)
        for (int i = 0; i < arr.length; i++) {
            int currMaxWealth = 0;

            // Sum up all the bank accounts for the current customer
            for (int j = 0; j < arr[i].length; j++) {
                currMaxWealth += arr[i][j];
            }

            // Update MaxWealth if current customer's wealth is greater
            MaxWealth = Math.max(currMaxWealth, MaxWealth);
        }

        // Print the maximum wealth found
        System.out.println(MaxWealth);
    }
}