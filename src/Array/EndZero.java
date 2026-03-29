package Array;

import java.util.Arrays;

public class EndZero {
    public static void main(String[] args) {
        int arr[]={4, 0, 2, 0, 5};
        int x=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[x]=arr[i];
                x++;
            }
        }
        for(int j=x;j<arr.length;j++){
            arr[j]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
