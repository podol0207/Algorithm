import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int[] dp = new int[11];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 4;
        for(int j=3; j<11; j++) {
            dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
        }
        for(int i=0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());

            bw.write(dp[n-1] + "\n");
        }
        bw.flush();
        bw.close();
    }
}