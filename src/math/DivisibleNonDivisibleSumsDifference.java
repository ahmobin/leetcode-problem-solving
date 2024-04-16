package math;

import java.util.Scanner;

public class DivisibleNonDivisibleSumsDifference {
    public static void main(String[] args) {
        //You are given positive integers n and m.
        //
        //Define two integers, num1 and num2, as follows:
        //
        //num1: The sum of all integers in the range [1, n] that are not divisible by m.
        //num2: The sum of all integers in the range [1, n] that are divisible by m.
        //Return the integer num1 - num2.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your range: ");
        int n = scanner.nextInt();
        System.out.println("Enter divisible checking number: ");
        int m = scanner.nextInt();

        System.out.println(differenceOfSumsWay2(n,m));
//        System.out.println(differenceOfSums(n,m));

    }

    private static int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;

        for(int i=1; i<=n; i++){
            if(i%m != 0)
                num1+=i;

            if(i%m == 0)
                num2+=i;
        }

        return num1 - num2;
    }

    private static int differenceOfSumsWay2(int n, int m) {
        int sumOfTheRange = (n*(n+1))/2;
        int x = n/m;
        int sumOfNumInDivisibleNums = (x*(x+1))/2;
        return sumOfTheRange - 2 * (m*sumOfNumInDivisibleNums);
    }
}
