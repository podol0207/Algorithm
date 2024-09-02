import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int n;
    static int m;
    static int[][] arr;
    static int day;
    static Queue<int[]> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        day = 0;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 1) q.add(new int[]{i, j});
            }
        }
        bw.write(bfs() + "\n");

        bw.flush();
        bw.close();
    }

    public static int bfs() {
        while(!q.isEmpty()) {
            int[] tmp = q.poll();
            int x = tmp[0], y = tmp[1];
            for(int k=0; k<4; k++) {
                int nx = x + dx[k], ny = y + dy[k];
                if(nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if(arr[nx][ny] == 0) {
                        q.add(new int[]{nx, ny});
                        arr[nx][ny] = arr[x][y] + 1;
                    }
                }
            }
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(arr[i][j] == 0) {
                    return -1;
                }
                day = Math.max(day, arr[i][j]);
            }
        }

        if(day==1) {
            return 0;
        } else {
            return day-1;
        }
    }
}