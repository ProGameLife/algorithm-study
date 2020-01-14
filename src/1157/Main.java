import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Main1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toUpperCase();
        char[] arr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int[] sum = new int[26];
        int max = 0, tmp = 0;
        int cnt =0;
        Arrays.fill(sum,0);

        for(int i=0; i<a.length(); i++){
            for(int j=0; j<arr.length; j++){
                if(arr[j] == a.charAt(i)){
                    sum[j] += 1;
                }
            }
        }
        for(int i=0; i<sum.length;i++){
            max = (Math.max(max,sum[i]));
        }
        for(int i=0; i<sum.length; i++){
            if(max == sum[i]){
                cnt++;
                tmp = i;
            }
        }
        System.out.println(cnt == 1 ? arr[tmp] : "?");
    }
}