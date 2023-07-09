package math;

public class SmallestEvenMultiple {
    public static void main(String[] args) {
        System.out.println("2413. Smallest Even Multiple");
        System.out.println("============================");
        System.out.println(smallestEvenMultiple(7));
    }

    public static int smallestEvenMultiple(int n) {
        return n+n*(n%2);
    }
}
