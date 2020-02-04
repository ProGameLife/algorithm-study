import java.util.*;

class Main5522 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, sum=0;
        for(int i=0; i<5; i++){
            a = sc.nextInt();
            sum += a;
        }
        System.out.println(sum);
    }
}