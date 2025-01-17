import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 1;
        int x = 1;
        while(n > x) {
            x += count*6;
            count++;
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}