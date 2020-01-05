import java.util.*;

class Main1{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int check= 0;
        int sum = 0;

        int count = scanner.nextInt();
        int max = scanner.nextInt();
        scanner.nextLine();

        int[] arr = new int[count];
        int[] arr2 = new int[count*count*count];

        for(int i=0; i<count; i++){
            arr[i] = scanner.nextInt();
        } //여기까지가 입력 받고 각 변수, 배열에 저장


        for(int i=0;i<count;i++){
            for(int j=0;j<count;j++){
                if(i==j)continue;
                for(int e=0;e<count;e++){
                    if(j==e || i==e)continue;
                    sum =(arr[i] + arr[j] + arr[e]);
                    if(max >= sum){
                         arr2[check]= sum;
                        check++;
                    }
                }
            }
        }
    Arrays.sort(arr2);
    System.out.println(arr2[arr2.length-1]);
    }
}