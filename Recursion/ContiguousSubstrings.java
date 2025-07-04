package Recursion;
/*
* We are given a string S, we need to find the count of all contiguous substrings
starting and ending with the same character
* */

public class ContiguousSubstrings {

    public static int countSubstrs(String str, int idx, int strLen, int n) {
        // Base case: a single character is a valid substring by itself
        if (n == 1) {
            return 1;
        }

        // Base case: empty or invalid range
        if (n <= 0) {
            return 0;
        }

        // Recursive count using inclusion-exclusion:
        // 1. Count substrings starting at idx+1
        // 2. Count substrings ending at strLen-1
        // 3. Subtract the overlapping middle part
        int res = countSubstrs(str, idx + 1, strLen, n - 1)
                + countSubstrs(str, idx, strLen - 1, n - 1)
                - countSubstrs(str, idx + 1, strLen - 1, n - 2);

        // If the current substring's first and last characters match, add 1
        if (str.charAt(idx) == str.charAt(strLen)) {
            res++;
        }

        return res;
    }

    public static void main(String[] args) {
        String str = "abcab";
        // Starting the recursion with the full string
        System.out.print(countSubstrs(str, 0, str.length() - 1, str.length()));
    }
}
