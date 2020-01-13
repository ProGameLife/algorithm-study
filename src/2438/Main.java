import java.io.*;
import java.util.Scanner;

class Main2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i=1; i<=a; i++){
            for(int e=1; e <=i; e++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}