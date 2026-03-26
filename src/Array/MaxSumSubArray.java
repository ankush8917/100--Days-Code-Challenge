package Array;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int ar[]={-2,1,-3,4,-1,2,1,-5,4};
        int x=0,y=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            int sum=0;
            for(int j=i;j<ar.length;j++){
                sum+=ar[j];
                if(sum>maxSum){
                    maxSum=sum;
                    x=i;
                    y=j;
                }
            }
        }
        System.out.println("MaxSum => "+maxSum);
        System.out.print("[ ");
        for(int j=x;j<=y;j++){
            System.out.print(ar[j]+" ");
        }
        System.out.println("]");
    }
}
