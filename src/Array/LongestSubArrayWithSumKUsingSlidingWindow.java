package Array;

public class LongestSubArrayWithSumKUsingSlidingWindow {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,1,1};
        int K=3;
        int start=0,end=0,sum=0,range=0,currRange=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
    }
}
