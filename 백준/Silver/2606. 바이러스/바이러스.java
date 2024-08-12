import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] A;
    static boolean[] visited;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int com = Integer.parseInt(br.readLine());
        int link = Integer.parseInt(br.readLine());
        A = new ArrayList[com + 1];
        visited = new boolean[com + 1];
        count = 0;
        for(int i=1; i<com+1; i++) {
            A[i] = new ArrayList<Integer>();
        }
        for(int i=0; i<link; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }
        DFS(1);
        bw.write(count-1 + "\n");
        bw.flush();
        bw.close();
    }

    private static void DFS(int i) {
        visited[i] = true;
        count++;
        for (int j : A[i]) {
            if (!visited[j]) {
                DFS(j);
            }
        }
    }
}