import java.io.*;
import java.util.*;

public class Main {
    static boolean[] c;
    static int[] A;
    static int n, m;
    static BufferedWriter bw;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        A = new int[n+1];
        c = new boolean[n+1];

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
            if(c[i]) continue;
            c[i] = true;
            A[index] = i;
            go(index+1);
            c[i] = false;
        }
    }
}