package Array;

public class TwoSum {
    public static void main(String[] args) {
        int arr[]={1,5,3,7};
        int target=8,sum=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                sum=arr[i]+arr[j];
                if(sum==target){
                    System.out.println("Yes,Present at index "+i+" and "+j);
                }
            }
        }
    }
}
