import java.io.*;
import java.util.Scanner;

class Main1110{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=0, m=0, n=0, sum=0, cnt=0;
        String tmp="", tmp1="", quit="";
        String result = "";
        N = sc.nextInt();

        if(N < 10) {
            n = N; // 10보다 작을 경우 1의자리의 수를 넣음
            result = "0"+ N;
        }else{
            m = N / 10; // 10의 자리
            n = N % 10; // 1의 자리
            result = ""+ N;
        }
        while (!quit.equals(result)){
            sum = m + n;
            m = n;
            n = sum % 10;
            N = sum;
            tmp = ""+m;
            tmp1 = ""+n;
            quit = tmp + tmp1;
            cnt++;
        }
        System.out.println(cnt);
    }
}