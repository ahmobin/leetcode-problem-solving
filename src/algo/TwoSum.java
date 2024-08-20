package algo;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(bruteForceSolution(numbers, target)));
    }

    private static int[] bruteForceSolution(int[] numbers, int target){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] + numbers[i+1] != target){
                continue;
            }
            return new int[]{i,i+1};
        }
        return null;
    }
}
