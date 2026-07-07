public class maxSubarray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, 3, 4};
        int result = Solution(arr);

        System.out.println(result);
    }

    public static int Solution(int[] arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;

            for (int j = i; j < arr.length; j++) {
                currSum += arr[j];
                maxSum = Math.max(maxSum, currSum);
            }
        }
                                                                                                                                                   
        return maxSum;
    }
}