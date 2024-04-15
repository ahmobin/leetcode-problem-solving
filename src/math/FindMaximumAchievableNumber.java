package math;

import java.util.Scanner;

public class FindMaximumAchievableNumber {

    //You are given two integers, num and t.
    //
    //An integer x is called achievable if it can become equal to num after applying the following operation no more than t times:
    //
    //Increase or decrease x by 1, and simultaneously increase or decrease num by 1.
    //Return the maximum possible achievable number. It can be proven that there exists at least one achievable number.

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter num ");
        int num = myObj.nextInt();
        System.out.println("Enter t ");
        int t = myObj.nextInt();
        System.out.println(theMaximumAchievableX(num,t));
    }

    private static int theMaximumAchievableX(int num, int t){
        return num + 2*t;
    }
}
