import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class Main2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0, cnt =0;
        int[] arr = new int[9];

        for(int i=0; i<9; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<9; i++){
            if(max < arr[i]){
                max = arr[i];
                cnt = i+1;
            }
        }
        System.out.println(max+"\n"+cnt);
    }
}