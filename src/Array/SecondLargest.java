package Array;

public class SecondLargest {
    public static void main(String[] args) {
        int ar[] = {3, 7, 2, 9, 5};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0; i < ar.length; i++) {
            if(ar[i] > first) {
                second = first;
                first = ar[i];
            }
            else if(ar[i] > second && ar[i] != first) {
                second = ar[i];
            }
        }

        System.out.println("Second Largest: " + second);
    }
}