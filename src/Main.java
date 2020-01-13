import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int sum = 0;
        for(int i=0; i<3; i++){
            arr[i] = sc.nextInt();
        }
        sum = arr[0] * arr[1] * arr[2];
        int length1 = (int)(Math.log10(sum)+1);//자릿수 구하기
        int[] tmp = new int[length1];
        int[] numcnt = new int[10];
        Arrays.fill(numcnt,0);
        for(int i=0; i < length1; i++){ //자릿수별로 배열에 넣기
            tmp[i] = sum % 10;
            sum /= 10;
        }
        for(int i=0; i<length1; i++){
            numcnt[tmp[i]] += 1;
        }
        for(int i=0; i<numcnt.length; i++) {
            System.out.println(numcnt[i]);
        }
    }
}