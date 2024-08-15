import java.io.*;
import java.util.*;

public class Main {
    static int[] parent;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        parent = new int[n+1];
        for(int i=1; i<=n; i++) {
            parent[i] = i;
        }
        for(int i=1; i<=n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=n; j++) {
                int sel = Integer.parseInt(st.nextToken());
                if(sel == 1) union(i, j);
            }
        }

        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        boolean flag = true;
        for(int i=1; i<m; i++) {
            int p = Integer.parseInt(st.nextToken());
            if(find(start) == find(p)) continue;
            flag = false;
        }
        if(flag) bw.write("YES\n");
        else bw.write("NO\n");
        bw.flush();
        bw.close();
    }

    private static int find(int start) {
        if(parent[start] == start) return start;
        return parent[start] = find(parent[start]);
    }

    private static void union(int i, int j) {
        i = find(i);
        j = find(j);
        if(i!=j) {
            if(i>j) parent[i] = j;
            else parent[j] = i;
        }
    }
}