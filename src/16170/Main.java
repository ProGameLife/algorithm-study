import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.*;

class Main16170 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date today = new Date();
        SimpleDateFormat year = new SimpleDateFormat("yyyy");
        SimpleDateFormat month = new SimpleDateFormat("MM");
        SimpleDateFormat day = new SimpleDateFormat("dd");

        System.out.println(year.format(today));
        System.out.println(month.format(today));
        System.out.println(day.format(today));
    }
}