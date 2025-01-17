import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int k = 2;
        for(int i=0; i<n; i++) {
            k = k*2-1;
        }
        bw.write(k*k + "\n");

        bw.flush();
        bw.close();
    }
}