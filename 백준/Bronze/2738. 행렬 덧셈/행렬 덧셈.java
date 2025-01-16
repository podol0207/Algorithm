import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] A = new int[n][m];
        int[][] B = new int[n][m];

        for(int i=0; i<n*2; i++) {
            st = new StringTokenizer(br.readLine());
            if(i<n) {
                for (int j = 0; j < m; j++) {
                    A[i][j] = Integer.parseInt(st.nextToken());
                }
            } else {
                for (int j=0; j<m; j++) {
                    B[i-n][j] = Integer.parseInt(st.nextToken());
                }
            }
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                bw.write(A[i][j] + B[i][j] + " ");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}