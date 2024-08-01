import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] won = new int[n];
        int count = 0;
        for(int i=0; i<n; i++) {
            won[i] = Integer.parseInt(br.readLine());
        }
        for(int i=n-1; i>=0; i--) {
            if(won[i] <= k) {
                count += k/won[i];
                k = k%won[i];
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}