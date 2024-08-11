import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] A;
    static int[] check;
    static boolean[] visited;
    static boolean IsEven;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A = new ArrayList[v+1];
            check = new int[v+1];
            IsEven = true;
            visited = new boolean[v+1];
            for(int j=1; j<=v; j++) {
                A[j] = new ArrayList<Integer>();
            }
            for(int j=0; j<e; j++) {
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                A[start].add(end);
                A[end].add(start);
            }
            for(int j=1; j<=v; j++) {
                if(!visited[j]) {
                    DFS(j);
                } 
                if(!IsEven){
                    break;
                }
            }
            if(IsEven) bw.write("YES" + "\n");
            else bw.write("NO" + "\n");
        }

        bw.flush();
        bw.close();
    }

    private static void DFS(int start) {
        visited[start] = true;
        for (int i : A[start]) {
            if(!visited[i]) {
                check[i] = (check[start] + 1) % 2;
                DFS(i);
            } else if(check[start] == check[i]) {
                    IsEven = false;
            }
        }
    }
}