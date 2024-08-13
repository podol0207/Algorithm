import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int count;
    static boolean[][] visited;
    static boolean[][] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            A = new boolean[m][n];
            for(int j=0; j<k; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                A[x][y] = true;
            }
            count = 0;
            visited = new boolean[m][n];
            for(int j=0; j<m; j++) {
                for(int l=0; l<n; l++) {
                    if(A[j][l] && !visited[j][l]) {
                        count++;
                        DFS(j, l);
                    }
                }
            }
            bw.write(count + "\n");
        }

        bw.flush();
        bw.close();
    }

    private static void DFS(int j, int l) {
        visited[j][l] = true;
        for(int k=0; k<4; k++) {
            int nextX = j + dx[k];
            int nextY = l + dy[k];
            if(nextX < A.length && nextY < A[0].length && nextX >= 0 && nextY >= 0) {
                if(A[nextX][nextY] && !visited[nextX][nextY]) {
                    DFS(nextX, nextY);
                }
            }
        }
    }
}