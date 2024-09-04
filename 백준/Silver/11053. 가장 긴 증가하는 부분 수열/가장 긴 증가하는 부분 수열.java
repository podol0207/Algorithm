import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int[] dp = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<n; i++) {
            dp[i] = 1;

            for(int j=0; j<i; j++) {
                if(arr[j]<arr[i] && dp[i]<dp[j]+1) {
                    dp[i] = dp[j]+1;
                }
            }
        }

        int max = -1;
        for(int i=0; i<n; i++) {
            max = Math.max(dp[i], max);
        }
        bw.write(max+"\n");

        bw.flush();
        bw.close();
    }
}