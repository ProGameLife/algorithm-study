import java.math.BigInteger;
import java.util.*;

class Main11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = sc.nextBigInteger();

        BigInteger sum1 = a.add(b);
        sum1 = sum1.add(c);
        System.out.println(sum1);
    }
}