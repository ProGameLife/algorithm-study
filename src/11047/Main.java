import java.util.*;

class Main11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        int[] arr =  new int[a];
        for(int i=0; i<a; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = a-1; i>=0; i--){
            if(b>=arr[i]){
                count += b/arr[i];
                b = b%arr[i];
            }
        }
        System.out.println(count);
    }
}