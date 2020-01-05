import java.util.*;

class study2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("*을 출력할 줄 수1 : ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);
        int half = num / 2;

        for(int i=0; i<num; i++) {
            for (int j = 0; j < half+1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < half * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
