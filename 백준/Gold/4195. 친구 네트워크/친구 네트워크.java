import java.io.*;
import java.util.*;

public class Main {
    static int[] parent;
    static int[] level;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++) {
            int f = Integer.parseInt(br.readLine());
            parent = new int[f*2];
            level = new int[f*2];
            for(int j=0; j<f*2; j++) {
                parent[j] = j;
                level[j] = 1;
            }
            int idx = 0;
            Map<String, Integer> map = new HashMap<>();

            for(int j=0; j<f; j++) {
                st = new StringTokenizer(br.readLine());
                String a = st.nextToken();
                String b = st.nextToken();
                if(!map.containsKey(a)) {
                    map.put(a, idx++);
                }
                if(!map.containsKey(b)) {
                    map.put(b, idx++);
                }
                int size = union(map.get(a), map.get(b));
                bw.write(size + "\n");
            }
        }
        bw.flush();
        bw.close();
    }

    private static int union(int a, int b) {
        a = find(a);
        b = find(b);
        if(a != b) {
            parent[b] = a;
            level[a] += level[b];
            level[b] = 1;
        }
        return level[a];
    }

    private static int find(int b) {
        if(b == parent[b]) {
            return b;
        }
        return parent[b] = find(parent[b]);
    }
}