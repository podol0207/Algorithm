import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] visited;
    static int[][] A;
    static int n, m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        A = new int[n][m];
        visited = new boolean[n][m];
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for(int j=0; j<m; j++) {
                A[i][j] = Integer.parseInt(line.substring(j, j+1));
            }
        }
        BFS(0, 0);
        bw.write(A[n-1][m-1] + "\n");
        bw.flush();
        bw.close();
    }
    private static void BFS(int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {i, j});
        while(!q.isEmpty()) {
            int[] now = q.poll();
            visited[i][j] = true;
            for(int k=0; k<4; k++) {
                int nx = now[0] + dx[k];
                int ny = now[1] + dy[k];
                if(nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if(A[nx][ny] != 0 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        A[nx][ny] = A[now[0]][now[1]] + 1;
                        q.add(new int[] {nx, ny});
                    }
                }
            }
        }
    }
}