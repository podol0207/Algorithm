import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int A = a*d + b*c;
        int B = b*d;

        int mod = 1;
        int s = A;
        int t = B;
        while(mod!=0) {
            mod = t % s;
            t = s;
            s = mod;
            if(t == s) break;
        }
        bw.write(A / t + "\n");
        bw.write(B / t + "\n");

        bw.flush();
        bw.close();
    }
}