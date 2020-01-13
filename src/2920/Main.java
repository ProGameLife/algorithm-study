import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class Main2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[8];
        int cnt = 8, cnt1 = 1;

        for(int i=0; i<8; i++){
            arr[i] = sc.nextInt();
        }
        if(arr[0] == 1) {
            for (int i = 0; i < 8; i++) {
                if(arr[i] != cnt1){
                    System.out.println("mixed");
                    return;
                }
                cnt1++;
            }
            System.out.println("ascending");
        }else if(arr[0] == 8){
            for(int i=0; i < 8; i++){
                if(arr[i] != cnt){
                    System.out.println("mixed");
                    return;
                }
                cnt--;
            }
            System.out.println("descending");
        }
    }
}