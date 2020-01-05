import java.util.*;

class study1 {

   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       System.out.printf("*을 출력할 줄 수 : ");
       String input = scanner.nextLine();
       int num = Integer.parseInt(input);
       int half = num / 2;

       for(int i=1; i<half; i++){
               for (int j = 1; j <= i; j++) {
                   System.out.printf("*");
           }
           System.out.println();
       }
       for(int i=half; i>=1; i--){
           for (int j = 1; j <= i; j++) {
               System.out.printf("*");
           }
           System.out.println();
       }
   }
}
