import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Set<String> name = new HashSet<>();
        for(int i=0; i<n; i++) {
            name.add(br.readLine());
        }
        ArrayList<String> same = new ArrayList<>();
        for(int i=0; i<m; i++) {
            String a = br.readLine();
            if(name.contains(a)) {
                same.add(a);
            }
        }
        Collections.sort(same);
        bw.write(same.size() + "\n");
        for (String s : same) {
            bw.write(s + "\n");
        }

        bw.flush();
        bw.close();
    }
}