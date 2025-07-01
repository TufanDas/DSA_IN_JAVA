package Recursion;

// This class calculates x raised to the power n using recursion (xⁿ)
public class xRaiseToThePowerN {

    // Recursive method to calculate x^n
    static int calculatePower(int x, int n) {
        // Base case: anything raised to power 0 is 1
        if (n == 0) {
            return 1;
        }

        // Base case: if n is 1, just return x
        if (n == 1) {
            return x;
        }

        // Recursive case: multiply x with the result of x^(n-1)
        return x * calculatePower(x, n - 1);
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;

        // Calculate and print x raised to the power n
        System.out.println(x + " raised to the power " + n + " is: " + calculatePower(x, n));
    }
}

