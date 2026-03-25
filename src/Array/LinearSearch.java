package Array;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={43,56,21,76,42,98,89,17,20};
        System.out.println("Enter the value of Key :");
        int key=sc.nextInt();
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == key) {
                System.out.println("Key is present at index :" + i);
                System.exit(0);
            }
        }
        System.out.println("Key not Found");
    }
}
