import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        long m = n;

        for(long i=2; i<=Math.sqrt(n); i++) {
            if(n%i == 0) {
                m = m/i*(i-1);
            }
            while(n%i==0) {
                n/=i;
            }
        }
        if(n!=1) {
            m = m/n*(n-1);
        }
        bw.write(m + "\n");
        bw.flush();
        bw.close();
    }
}