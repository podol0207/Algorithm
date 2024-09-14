import java.io.*;
import java.util.*;

public class Main {
    static Edge[] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        graph = new Edge[m+1];
        long[] dist = new long[n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph[i] = new Edge(a, b, w);
        }

        dist[1] = 0;
        for(int i=1; i<n; i++) {
            for(int j=0; j<m; j++) {
                Edge nowEdge = graph[j];
                if(dist[nowEdge.st] != Integer.MAX_VALUE && dist[nowEdge.end] > dist[nowEdge.st] + nowEdge.cost) {
                    dist[nowEdge.end] = dist[nowEdge.st] + nowEdge.cost;
                }
            }
        }

        boolean cycle = false;
        for(int i=0; i<m; i++) {
            Edge nowEdge = graph[i];
            if(dist[nowEdge.st] != Integer.MAX_VALUE && dist[nowEdge.end] > dist[nowEdge.st] + nowEdge.cost) {
                cycle = true;
            }
        }
        if(cycle) bw.write(-1 + "\n");
        else {
            for(int i=2; i<=n; i++) {
                if(dist[i] == Integer.MAX_VALUE) bw.write(-1 + "\n");
                else bw.write(dist[i] + "\n");
            }
        }

        bw.flush();
        bw.close();
    }

    static class Edge {
        int st;
        int end;
        int cost;

        public Edge(int st, int end, int cost) {
            this.st = st;
            this.end = end;
            this.cost = cost;
        }
    }
}