import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String s = "";
        for(int i=1; i<=n; i++) {
            for(int j=n-i; j>0; j--) {
                bw.write(" ");
            }
            s += "*";
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}