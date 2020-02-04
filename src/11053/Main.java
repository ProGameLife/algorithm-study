import java.util.*;

class Main11053 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];
        int[] dp = new int[a];
        int max = 1;

        Arrays.fill(dp,1);
        for (int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < a; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && dp[i]<=dp[j]) {
                    dp[i] = dp[j] + 1;
                    if (max < dp[i]) {
                        max = dp[i];
                    }
                }
            }
        }
        System.out.println(max);
    }
}
