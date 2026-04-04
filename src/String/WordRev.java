package String;

import java.util.Scanner;

public class WordRev {
    public String revWord(String word) {
         String ar[]=word.split(" ");
         String rev="";
         for(int i=ar.length-1;i>=0;i--){
             rev=rev.concat(ar[i]+" ");
         }
         return rev;
    }
    public static void main(String[] args) {
        WordRev wr = new WordRev();
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(wr.revWord(word));
        sc.close();
    }
}
