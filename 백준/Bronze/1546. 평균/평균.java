import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        double[] arr = new double[N];
        double max = Integer.MIN_VALUE;
        double total = 0.0;
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] > max) max=arr[i];
            total += arr[i];
        }
        bw.write(String.format("%.2f", (total/max)*100/N));
        bw.close();
    }
}