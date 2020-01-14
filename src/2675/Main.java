import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Main2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int R = 0;
        String S = "";
        for(int i = 0; i < a; i++){
            R = sc.nextInt();
            S = sc.nextLine();
            for(int j = 0; j<S.length(); j++){
                for(int k = 0; k<R; k++){
                    if(j != 0)
                        System.out.print(S.charAt(j));
                }
            }System.out.println();
        }
    }
}