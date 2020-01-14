import java.util.*;

class Main4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        double average = 0;
        int cnt = sc.nextInt();

        for(int i=0; i < cnt; i++) {
            double sum = 0;
            int c = 0;
            b = sc.nextInt();
            double[] score = new double[b];
            for(int j=0; j<b; j++){
                score[j] = sc.nextDouble();
                sum += score[j];
            }
            average = sum/b;
            for(int k=0; k<b; k++){
                if(average < score[k]){
                    c++;
                }
            }
            System.out.println(String.format("%.3f", (double)c/b * 100) + "%");
        }
    }
}
