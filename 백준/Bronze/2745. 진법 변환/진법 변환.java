import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        int sum = 0;
        for(int i=0; i<n.length(); i++) {
            char x = n.charAt(i);
            if('A' <= x && x <= 'Z') {
                sum += (int) ((n.charAt(i) - 'A'+10) * Math.pow(b, n.length() - i - 1));
            } else if ('0'<= x && x <= '9') {
                sum += (int) ((n.charAt(i) - '0') * Math.pow(b, n.length() - i - 1));
            }
        }
        bw.write(sum+"\n");
        bw.flush();
        bw.close();
    }
}