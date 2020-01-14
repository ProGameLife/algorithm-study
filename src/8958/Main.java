import java.util.*;

class Main8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[a];
        char[] c = new char[80];
        int cnt = 0, sum = 0, arr_len = 0;

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextLine();
            arr_len = arr[i].length();
            sum = 0; cnt = 0;
            for (int j = 0; j < arr_len; j++) {
                if (arr[i].charAt(j) == 'O') {
                    cnt++;
                    sum += cnt;
                } else if (arr[i].charAt(j) == 'X')
                    cnt = 0;
            } System.out.println(sum);

        }
    }
}
