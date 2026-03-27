package Array;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int ar[]={1,2,3,1,1,1};
        int K=3;
        int start=0,end=0,range=0,currRange=0;
        for(int i=0;i<ar.length;i++){
            int sum=0;
            for(int j=i;j<ar.length;j++){
                sum+=ar[j];
                if(sum==K){
                    currRange=j-i+1;
                    if(currRange>range){
                        range=currRange;
                        start=i;
                        end=j;
                    }
                }
            }
        }
        System.out.println("Length of longest Subarray is :"+range);
        System.out.println("Longest Sub Array With Sum "+K+" is: ");
        System.out.print("[");
        for(int k=start;k<=end;k++){
            System.out.print(" "+ar[k]);
        }
        System.out.print("]");
    }
}
