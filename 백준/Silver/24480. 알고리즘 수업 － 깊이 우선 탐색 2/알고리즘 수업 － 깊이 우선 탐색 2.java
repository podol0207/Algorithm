import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] A;
    static boolean[] check;
    static int count = 0;
    static int[] node;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        node = new int[n+1];
        for(int i=1; i<=n; i++) {
            node[i] = 0;
        }
        A = new ArrayList[n+1];
        for(int i=1; i<=n; i++) {
            A[i] = new ArrayList<Integer>();
        }
        check = new boolean[n+1];
        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }
        for(int i=1; i<=n; i++) {
            Collections.sort(A[i]);
        }
        DFS(r);
        for(int i=1; i<=n; i++) {
            if(node[i] == 0) bw.write(0 + "\n");
            else bw.write(node[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static void DFS(int r) {
        check[r] = true;
        count++;
        node[r] = count;
        for(int i=A[r].size()-1; i>=0; i--) {
            int next = A[r].get(i);
            if(!check[next]) {
                check[next] = true;
                DFS(next);
            }
        }
    }
}