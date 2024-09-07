import java.io.*;
import java.util.*;

public class Main {
    public static long c;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        c = Long.parseLong(st.nextToken());

        bw.write(pow(a, b) + "\n");

        bw.flush();
        bw.close();
    }

    private static long pow(long a, long e) {
        if(e == 1) {
            return a%c;
        }

        long temp = pow(a, e/2);
        if(e % 2 == 1) {
            return (temp * temp % c) * a % c;
        }
        return temp * temp % c;

    }
}