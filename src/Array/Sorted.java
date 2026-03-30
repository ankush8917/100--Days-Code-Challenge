package Array;

public class Sorted {
    boolean isSorted(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Sorted s=new Sorted();
        int arr[]={1,2,5,8};
        System.out.println(s.isSorted(arr));
    }
}
