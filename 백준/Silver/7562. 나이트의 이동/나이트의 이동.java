import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
    static int[] dy = {2, 1, -1, -2, -2, -1, 1, 2};
    static int[][] A;
    static boolean[][] visited;
    static int endX;
    static int endY;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());
            A = new int[n][n];
            visited = new boolean[n][n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            endX = Integer.parseInt(st.nextToken());
            endY = Integer.parseInt(st.nextToken());
            BFS(startX, startY);
            bw.write(A[endX][endY] + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void BFS(int startX, int startY) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{startX, startY});
        visited[startX][startY] = true;
        while(!q.isEmpty()) {
            int[] now = q.poll();
            int nowX = now[0];
            int nowY = now[1];
            if((nowX == endX) && (nowY == endY)) return;

            for(int i=0; i<8; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                if(nextX >= 0 && nextY >= 0 && nextX < A.length && nextY < A[0].length && !visited[nextX][nextY]) {
                    q.add(new int[]{nextX, nextY});
                    A[nextX][nextY] = A[nowX][nowY] + 1;
                    visited[nextX][nextY] = true;
                }
            }
        }

    }
}