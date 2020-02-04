import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.*;

class Main15727{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int m =0;
        if(a <= 5){
            System.out.println("1");
            return;
        }else{
            m = a/5;
            if(a%5 != 0){
                m++;
            }
            System.out.println(m);
        }
    }
}