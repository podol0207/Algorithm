import java.io.*;
import java.util.*;

public class Main {
    public static int[] dp = new int[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for(int i=3; i<dp.length; i++) {
            dp[i] = -1;
        }
        bw.write(Tile(n) + "\n");
        bw.flush();
        bw.close();
    }

    private static int Tile(int n) {
        if(dp[n] == -1) {
            dp[n] = (Tile(n-1) + Tile(n-2)) % 15746;
        }
        return dp[n];
    }
}