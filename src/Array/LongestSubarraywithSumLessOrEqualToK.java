package Array;

public class LongestSubarraywithSumLessOrEqualToK {
    public static void main(String[] args) {
        int arr[] = {4,2,1,4,1,8,1,2,8};
        int K = 8;

        int left = 0, sum = 0, maxLen = 0;
        int start = 0, end = 0;

        for(int right = 0; right < arr.length; right++){
            sum += arr[right];

            while(sum > K){
                sum -= arr[left];
                left++;
            }

            int currLen = right - left + 1;
            if(currLen > maxLen){
                maxLen = currLen;
                start = left;
                end = right;
            }
        }

        System.out.println("Length: " + maxLen);

        System.out.print("[ ");
        for(int i = start; i <= end; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
}