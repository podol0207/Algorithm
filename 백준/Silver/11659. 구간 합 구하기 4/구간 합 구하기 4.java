import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] num = new int[n];
        int[] sum = new int[n+1];
        sum[0] = 0;
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
            sum[i+1] = sum[i] + num[i];
        }

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(sum[b]-sum[a-1] + "\n");
        }
        bw.close();
    }
}