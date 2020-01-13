import java.io.*;
import java.util.Scanner;

class Main2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i=a; i >=1; i--){
            for(int e=1; e <=a; e++){
                if(e < i) {
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}