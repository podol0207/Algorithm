import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n+1];
            for(int j=1; j<=n; j++) {
                arr[j] = j;
            }
            for(int j=2; j<=Math.sqrt(n); j++) {
                if(arr[j] == 0) continue;
                for(int k=j+j; k<=n; k+=j) {
                    arr[k] = 0;
                }
            }
            int count = 0;
            for(int j=2; j<=n/2; j++) {
                if(arr[j] != 0 && arr[n - arr[j]] != 0) {
                    count++;
                }
            }
            bw.write(count + "\n");
        }

        bw.flush();
        bw.close();
    }
}