package math;

public class SmallestEvenMultiple {
    public static void main(String[] args) {
        System.out.println(smallestEvenMultiple(7));
    }

    public static int smallestEvenMultiple(int n) {
        return n+n*(n%2);
    }
}
