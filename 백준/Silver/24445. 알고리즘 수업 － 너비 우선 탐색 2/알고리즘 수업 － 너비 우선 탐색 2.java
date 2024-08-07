import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] A;
    static boolean[] visit;
    static Queue<Integer> q;
    static int count;
    static int[] s;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        A = new ArrayList[n+1];
        visit = new boolean[n+1];
        s = new int[n+1];
        for(int i=1; i<=n; i++){
            A[i] = new ArrayList<Integer>();
        }
        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }
        for(int i=1; i<=n; i++) {
            Collections.sort(A[i], Collections.reverseOrder());
        }
        BFS(r);

        for(int i=1; i<=n; i++) {
            bw.write(s[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void BFS(int r) {
        count = 1;
        visit[r] = true;
        s[r] = count;
        q= new LinkedList<>();
        q.add(r);

        while(!q.isEmpty()) {
            int current = q.poll();
            for (int next : A[current]) {
                if(!visit[next]) {
                    visit[next] = true;
                    q.add(next);
                    count++;
                    s[next] = count;
                }
            }
        }
    }
}