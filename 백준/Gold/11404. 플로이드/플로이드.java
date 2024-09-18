import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int arr[][] = new int[n+1][n+1];
        int INF = 9999999;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(i==j) continue;
                else arr[i][j] = INF;
            }
        }
        for(int i=0; i<m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            arr[s][e] = Math.min(w, arr[s][e]);
        }
        for(int k=1; k<=n; k++) {
            for(int s=1; s<=n; s++) {
                if(s==k) continue;
                for(int e=1; e<=n; e++) {
                    if(s==e || e==k) continue;
                    arr[s][e] = Math.min(arr[s][e], arr[s][k]+arr[k][e]);
                }
            }
        }
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(arr[i][j] == INF) bw.write(0 + " ");
                else bw.write(arr[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}