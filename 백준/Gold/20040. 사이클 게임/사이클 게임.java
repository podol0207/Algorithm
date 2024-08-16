import java.io.*;
import java.util.*;

public class Main {
    static int[] parent;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        parent = new int[n];
        for(int i=0; i<n; i++) {
            parent[i] = i;
        }
        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            if(find(s) == find(e)) {
                bw.write(i+1 + "\n");
                bw.flush();
                bw.close();
                return;
            } else {
                union(s, e);
            }
        }
        bw.write(0 + "\n");
        bw.flush();
        bw.close();
    }

    private static void union(int s, int e) {
        s = find(s);
        e = find(e);
        if(s!=e) {
            if(s>e) {
                parent[s] = e;
            } else {
                parent[e] = s;
            }
        }
    }

    private static int find(int e) {
        if(parent[e] == e) return e;
        return parent[e] = find(parent[e]);
    }
}