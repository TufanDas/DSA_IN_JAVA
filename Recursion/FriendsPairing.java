package Recursion;/*
Friends Pairing Problem:

Given `n` friends, each can either:
1. Stay single
2. Pair up with any one of the remaining (n - 1) friends

Each friend can be in only one pair. You need to count the **total number of unique ways**
friends can stay single or be paired up.

This is a classic recursion problem with overlapping subproblems (can be optimized using DP).
*/

public class FriendsPairing {

    // Recursive method to count number of ways to pair up or remain single
    static int friendPairing(int n) {

        // Base cases:
        // If only 1 friend → only 1 way (stay alone)
        // If 2 friends → two options: both stay single OR pair up => 2 ways
        if (n == 1 || n == 2) {
            return n;
        }

        // Option 1: Friend n stays single → solve for remaining (n - 1) friends
        int fnm1 = friendPairing(n - 1);

        // Option 2: Friend n pairs with any of (n - 1) friends
        // For each such pairing, solve for remaining (n - 2) friends
        int fnm2 = friendPairing(n - 2);
        int pairWays = (n - 1) * fnm2;

        // Total ways = single ways + pairing ways
        int totalWays = fnm1 + pairWays;

        return totalWays;
    }

    public static void main(String[] args) {
        int n = 5;  // total number of friends
        System.out.println("Total ways to pair " + 3 + " friends: " + friendPairing(3));
    }
}
