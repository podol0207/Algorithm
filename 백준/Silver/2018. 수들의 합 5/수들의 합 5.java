import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int si = 1;
        int ei = 1;
        int sum = 1;
        int count = 1;
        while(ei != N) {
            if(sum == N) {
                count++;
                ei++;
                sum += ei;
            } else if(sum > N) {
                sum -= si;
                si++;
            } else if(sum < N) {
                ei++;
                sum += ei;
            }
        }
        bw.write(count + "\n");

        bw.close();
    }
}