import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.math.BigInteger;

class Main10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[] result = new int[26];
        String a = sc.nextLine();
        int length = a.length();
        int cnt =0;
        Arrays.fill(result,-1);

        for(int i=0; i<length; i++){
            char c = a.charAt(i);
            for(int j=0;j<26; j++){
                if(c == arr[j] && result[j] == -1){
                    result[j] = cnt;
                    cnt++;
                }else if(c == arr[j] && result[j] != -1){
                    cnt++;
                }
            }
        }
        for(int i=0; i< result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}