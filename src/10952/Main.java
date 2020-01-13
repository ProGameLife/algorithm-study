import java.io.*;
import java.util.Scanner;

class Main10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =11,b =11;

        while(a !=0 && b !=0) {
            a = sc.nextInt();
            b = sc.nextInt();
            if(a !=0 && b !=0) {
                System.out.println(a + b);
            }
        }
    }
}