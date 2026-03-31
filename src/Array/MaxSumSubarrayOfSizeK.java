package Array;

public class MaxSumSubarrayOfSizeK {
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int maxSum = 0;

        for(int i = 0; i <= arr.length - k; i++){
            int currSum = 0;

            for(int j = i; j < i + k; j++){
                currSum += arr[j];
            }

            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println("Max Sum: " + maxSum);
    }
}