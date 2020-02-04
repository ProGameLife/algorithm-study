import java.util.*;

class Main3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,1,2,2,2,8};
        int[] ch = new int[6];
        int sum;
        for(int i = 0; i<6; i++){
            ch[i] = sc.nextInt();
        }
        for(int i = 0; i < 6; i++){
            sum = arr[i] - ch[i];
            System.out.print(sum + " ");
        }
    }
}