import java.util.Scanner;

public class BinaryToDec {
    public static int binToDec(int a) {
        int pow=0;
        int dec=0;
        while(a>0){
            int ld=a%10;
            a=a/10;
            dec= dec+ (int)(ld*Math.pow(2,pow));
            pow++;
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(BinaryToDec.binToDec(n));
    }
}
