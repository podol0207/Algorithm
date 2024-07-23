import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<Integer, String> h1 = new HashMap<Integer, String>();
        HashMap<String, Integer> h2 = new HashMap<String, Integer>();

        for(int i=1; i<=n; i++) {
            String s = br.readLine();
            h1.put(i, s);
            h2.put(s, i);
        }

        for(int i=0; i<m; i++) {
            String s = br.readLine();
            if(49 <= s.charAt(0) && s.charAt(0) <= 57) {
                bw.write(h1.get(Integer.parseInt(s)) + "\n");
            } else {
                bw.write(h2.get(s) + "\n");
            }
        }
        bw.close();
    }
}