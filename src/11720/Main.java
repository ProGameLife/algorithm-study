import java.io.*;
import java.util.Scanner;
import java.math.BigInteger;

class Main11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, num = 0, num1 = 0;
        int a = sc.nextInt();
        sc.nextLine();
        String b = sc.nextLine();

        for(int i=0; i<a; i++) {
            if (i != a-1) {
                sum += Integer.parseInt(b.substring(i, i + 1));
            } else {
                sum += Integer.parseInt(b.substring(i));
            }
        }
        System.out.println(sum);
    }
}