import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 0;
        boolean[] arr= new boolean[42];
        for(int i=0; i<10; i++) {
            int num = Integer.parseInt(br.readLine());
            if(!arr[num%42]) {
                arr[num%42]=true;
                n++;
            }
        }

        bw.write(n + "\n");
        bw.flush();
        bw.close();
    }
}