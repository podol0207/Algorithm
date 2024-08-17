import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        for(int i=0; i<=n; i++) {
            A.add(new ArrayList<>());
        }
        int indegree[] = new int[n+1];
        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A.get(s).add(e);
            indegree[e]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=n; i++) {
            if(indegree[i] == 0) {
                q.add(i);
            }
        }
        while(!q.isEmpty()) {
            int now = q.poll();
            bw.write(now + " ");
            for(int next : A.get(now)) {
                indegree[next]--;
                if(indegree[next] == 0) {
                    q.add(next);
                }
            }
        }

        bw.flush();
        bw.close();
    }
}