import java.util.*;

class Main1920 {
    public static <M> void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new HashSet<Integer>();
        int N = sc.nextInt();

        for(int i =0; i < N; i++){
            set.add(sc.nextInt());
        }

        int M = sc.nextInt();
        int[] Marr = new int[M];

        for(int i =0; i < M; i++){
            Marr[i] = sc.nextInt();
        }

        for(int j = 0; j < M; j++){
            if(set.contains(Marr[j])){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }


    }
}