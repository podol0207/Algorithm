import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[4];
        int[] change = {25, 10, 5, 1};
        for(int i=0; i<n; i++) {
            int c = Integer.parseInt(br.readLine());
            for(int j=0; j<4; j++) {
                arr[j] = c/change[j];
                c%=change[j];
                bw.write(arr[j]+" ");
            }
            bw.write("\n");

        }

        bw.flush();
        bw.close();
    }
}