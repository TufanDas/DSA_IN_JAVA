package Recursion;

public class PrintNumDecreasingOrder {

    static void printDecresingOrder(int n){
        if(n == 0) return;
        System.out.print(n + " ");
        printDecresingOrder(n-1);
    }

    public static void main(String[] args) {
        int n = 10;
        printDecresingOrder(n);
    }
}
