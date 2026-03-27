package Array;

public class KadaneMaxSum {
    public static void main(String[] args) {
        int ar[]={-2,1,-3,4,-1,2,1,-5,4};
        int maxSum=Integer.MIN_VALUE;
        int currSum=0,tempStart=0;
        int start=0,end=0;
        for(int i=0;i<ar.length;i++){
            currSum+=ar[i];
            if(currSum>maxSum){
                maxSum=currSum;
                start=tempStart;
                end=i;
            }
            if(currSum<0){
                currSum=0;
                tempStart=i+1;
            }
        }
        for(int j=start;j<=end;j++){
            System.out.print(ar[j]+" ");
        }
    }
}
