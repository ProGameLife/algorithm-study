import java.io.*;

class Main11021 {
    public static void main(String[] args) {
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int a = Integer.parseInt(bf.readLine());

            for(int i = 1; i <= a; i++) {
                String[] c = (bf.readLine().split(" "));
                int num1 = Integer.parseInt(c[0]);
                int num2 = Integer.parseInt(c[1]);
                bw.write("Case #" + i + ":"+" "+ String.valueOf(num1+num2) + "\n");
            }
            bw.flush();
            bw.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}