import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int[] arr;
    static int[] printArr;
    static boolean[] isVisited;
    static BufferedWriter bw;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        printArr = new int[n];
        isVisited = new boolean[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        dfs(0, 0);

        bw.flush();
        bw.close();
    }

    private static void dfs(int startIdx, int depth) throws IOException {
        if(depth == m) {
            for(int i=0; i<m; i++) {
                bw.write(printArr[i] + " ");
            }
            bw.write("\n");
            return;
        }

        for(int i=0; i<n; i++) {
            if(!isVisited[i]) {
                isVisited[i] = true;
                printArr[depth] = arr[i];
                dfs(i+1, depth+1);
                isVisited[i] = false;
            }
        }
    }
}