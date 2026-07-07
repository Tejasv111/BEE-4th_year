//package BEE_4th_year;

public class subarraySumBrute {

    public static void main(String[] args) {
        int[] arr = {-2, 1, 3, 4};
        int k = 4;

        int result = Solution(arr, k);
        System.out.println(result);
    }

    public static int Solution(int[] arr, int k) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}