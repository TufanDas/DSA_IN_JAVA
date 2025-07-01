package Recursion;

// This class calculates x raised to the power n using recursion (xⁿ)
// This class calculates x raised to the power n using optimized recursion (Exponentiation by Squaring)
public class xRaiseToThePowerN_optimized {

    // Efficient recursive method to calculate x^n
    static int calculatePower(int x, int n) {
        // Base case: x^0 = 1
        if (n == 0) {
            return 1;
        }

        // Base case: x^1 = x
        if (n == 1) {
            return x;
        }

        // Recursive step: first calculate x^(n/2) once and store it
        int halfPower = calculatePower(x, n / 2);

        // If n is even: x^n = (x^(n/2))^2
        if (n % 2 == 0) {
            return halfPower * halfPower;
        } else {
            // If n is odd: x^n = x * (x^(n/2))^2
            return x * halfPower * halfPower;
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;

        // Display the result
        System.out.println(x + " raised to the power " + n + " is: " + calculatePower(x, n));
    }
}

