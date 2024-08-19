import java.io.*;
import java.util.*;

public class Main {
    static int[] A;
    static int n, m;
    static BufferedWriter bw;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        A = new int[m];

        go(0);

        bw.flush();
        bw.close();
    }

    private static void go(int index) throws IOException {
        if (index == m) {
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<m; i++) {
                sb.append(A[i]).append(" ");
            }
            sb.append('\n');
            bw.write(sb.toString());
            return;
        }
        for(int i=1; i<=n; i++) {
            A[index] = i;
            go(index+1);
        }
    }
}