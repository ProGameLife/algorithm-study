import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int r = a, m = 0;
        int b = 0, s = 0;

        while (r!=0){
            if(r % 5 != 0){
                r = r - 3;
                s++;
            }else if(r % 5 == 0){
                r = r - 5;
                b++;
            }
            if(r < 0) {
                System.out.println("-1");
                return;
            }
        }
        System.out.println(b + s);

    }
}
