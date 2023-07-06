package math;

public class NumberOfGoodPair {
    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[]{1,2,3,1,1,3}));
    }

    public static int numIdenticalPairs(int[] nums){
        int[] count = new int[100];
        for (int num : nums){
            count[num]++;
        }

        int totalCount = 0;

        for (int i : count){
            totalCount += ((i) * (i-1)/2);
        }

        return totalCount;
    }
}
