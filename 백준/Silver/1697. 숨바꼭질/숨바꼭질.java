import java.io.*;
import java.util.*;

public class Main {
    static int[] A;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        A = new int[200002];
        visited = new boolean[200002];
        if(n==k) {
            bw.write(0 + "\n");
        } else {
            bw.write(bfs(n, k) + "\n");
        }

        bw.flush();
        bw.close();
    }

    private static int bfs(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        visited[n] = true;
        while(!q.isEmpty()) {
            int cur = q.poll();
            for(int next : new int[] {cur+1, cur-1, cur*2}) {
                if(next >= 0 && next <= 100000 && !visited[next]) {
                    visited[next] = true;
                    A[next] = A[cur] + 1;
                    if(next == k) {
                        return A[next];
                    }
                    q.add(next);
                }
            }
        }
        return -1;
    }
}