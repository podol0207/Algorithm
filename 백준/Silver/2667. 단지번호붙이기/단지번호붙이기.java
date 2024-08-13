import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] visited;
    static String[][] A;
    static int countD;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        A = new String[n][n];
        int count = 0;
        visited = new boolean[n][n];
        for(int i=0; i<n; i++) {
            A[i] = br.readLine().split("");
        }
        int[] arr = new int[n*n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(A[i][j].equals("1") && !visited[i][j]) {
                    countD = 0;
                    DFS(i, j);
                    arr[count++] = countD;
                }
            }
        }
        Arrays.sort(arr, 0, count);
        bw.write(count + "\n");
        for(int i=0; i<count; i++) {
            bw.write(arr[i] + "\n");
        }

        bw.flush();
        bw.close();
    }
    public static void DFS(int i, int j) {
        visited[i][j] = true;
        countD++;
        for(int k=0; k<4; k++) {
            int next_i = i + dx[k];
            int next_j = j + dy[k];
            if(next_i < A.length && next_j < A[0].length && next_i >=0 && next_j >=0) {
                if(A[next_i][next_j].equals("1") && !visited[next_i][next_j]) {
                    DFS(next_i, next_j);
                }
            }
        }
    }
}