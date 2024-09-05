import java.io.*;
import java.util.*;

public class Main {
    final static int Red = 0;
    final static int Green = 1;
    final static int Blue = 2;
    static int[][] cost;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        cost = new int[n][3];
        dp = new int[n][3];

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            cost[i][Red] = Integer.parseInt(st.nextToken());
            cost[i][Green] = Integer.parseInt(st.nextToken());
            cost[i][Blue] = Integer.parseInt(st.nextToken());
        }

        dp[0][Red] = cost[0][Red];
        dp[0][Green] = cost[0][Green];
        dp[0][Blue] = cost[0][Blue];
        bw.write(Math.min(paintCost(n-1, Red), Math.min(paintCost(n-1, Green), paintCost(n-1, Blue))) + "\n");

        bw.flush();
        bw.close();
    }

    private static int paintCost(int n, int color) {
        if(dp[n][color] == 0) {

            if(color == Red) {
                dp[n][Red] = Math.min(paintCost(n - 1, Green), paintCost(n - 1, Blue)) + cost[n][Red];
            }
            else if(color == Green) {
                dp[n][Green] = Math.min(paintCost(n - 1, Red), paintCost(n - 1, Blue)) + cost[n][Green];
            }
            else {
                dp[n][Blue] = Math.min(paintCost(n - 1, Red), paintCost(n - 1, Green)) + cost[n][Blue];
            }

        }

        return dp[n][color];
    }
}