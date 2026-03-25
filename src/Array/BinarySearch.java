package Array;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={17,20,21,42,43,56,76,89,98};
        System.out.println("Enter the value of Key :");
        int key=sc.nextInt();
        int l=0,h=arr.length-1;
        while(l<h){
            int mid=(l+h)/2;
            if(arr[mid]==key){
                System.out.println("Element found at index : "+mid);
                break;
            }
            if(arr[mid]>key){
                h=mid;
            }else{
                l=mid;}
        }
    }
}
