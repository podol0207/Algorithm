import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int a = 1-Integer.parseInt(st.nextToken());
        int b = 1-Integer.parseInt(st.nextToken());
        int c = 2-Integer.parseInt(st.nextToken());
        int d = 2-Integer.parseInt(st.nextToken());
        int e = 2-Integer.parseInt(st.nextToken());
        int f = 8-Integer.parseInt(st.nextToken());

        bw.write(a + " " + b + " " + c + " " + d + " " + e + " " + f + "\n");
        bw.flush();
        bw.close();
    }
}