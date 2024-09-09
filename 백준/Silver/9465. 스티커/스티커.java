import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            long[][] dp = new long[2][n+1];

            dp[0][1] = Long.parseLong(st1.nextToken());
            dp[1][1] = Long.parseLong(st2.nextToken());
            for(int j=2; j<=n; j++) {
                dp[0][j] = Math.max(dp[1][j-1], dp[1][j-2]) + Long.parseLong(st1.nextToken());
                dp[1][j] = Math.max(dp[0][j-1], dp[0][j-2]) + Long.parseLong(st2.nextToken());
            }
            bw.write(Math.max(dp[0][n], dp[1][n]) + "\n");
        }
        bw.flush();
        bw.close();
    }
}