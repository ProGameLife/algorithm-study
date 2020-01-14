import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Main1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().trim();

        if(a.isEmpty()){
            System.out.println("0");
        }else {
            System.out.println(a.split(" ").length);
        }
    }
}