import java.math.BigInteger;
import java.util.*;

class Main15964 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        BigInteger sum1 = a.add(b);
        BigInteger sum2 = a.subtract(b);
        BigInteger result = sum1.multiply(sum2);

        System.out.println(result);
    }
}