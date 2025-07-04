package Recursion;
/*
* Write a program to find Length of a String using Recursion.
* */
public class StringLength {

    static int findLength(String str) {

        // Base case: if string is empty, its length is 0
        if (str.length() == 0) {
            return 0;
        }

        // Recursive case: remove the first character and count +1
        return findLength(str.substring(1)) + 1;
    }

    public static void main(String[] args) {
        String str = "abcd";
        System.out.println("The length of the String is : " + findLength(str));
    }
}