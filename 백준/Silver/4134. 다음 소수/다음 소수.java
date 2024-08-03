import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++) {
            long n = Long.parseLong(br.readLine());
            long result = logic(n);
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
    }

    public static long logic(long n) {
        for(long i=n; ;i++) {
            if(isPrime(i)) {
                return i;
            }
        }
    }

    public static boolean isPrime(long n) {
        boolean result = true;
        if(n<=1) {
            return false;
        }
        for(long i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return result;
    }
}