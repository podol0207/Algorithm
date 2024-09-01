import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int n;
    static int m;
    static int[][] arr;
    static boolean[][] visited;
    static int[][] sol;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int x = 0;
        int y = 0;
        arr = new int[n][m];
        sol = new int[n][m];
        visited = new boolean[n][m];
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 2){
                    x = i;
                    y = j;
                } else if(arr[i][j] == 0){
                    visited[i][j] = true;
                    sol[i][j] = 0;
                }
            }
        }
        BFS(x, y);

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(!visited[i][j]){
                    sol[i][j] = -1;
                }
                bw.write(sol[i][j] + " ");
            }
            bw.write("\n");
        }


        bw.flush();
        bw.close();
    }

    private static void BFS(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;

        while(!q.isEmpty()) {
            int tmp[] = q.poll();
            for(int k=0; k<4; k++) {
                int nx = tmp[0] + dx[k];
                int ny = tmp[1] + dy[k];
                if(nx >= 0 && ny >= 0 && nx < n && ny < m && !visited[nx][ny] && arr[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    sol[nx][ny] = sol[tmp[0]][tmp[1]] + 1;
                    q.add(new int[]{nx, ny});
                }
            }
        }
    }
}