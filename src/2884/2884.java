import java.util.*;

class Main2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(b < 45){
            b += 60;
            b -= 45;
            a -= 1;
        }else {
            b -= 45;
        }
        if(a == -1){
            a = 23;
        }
        System.out.print(a+ " " + b);
    }
}
