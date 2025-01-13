import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = -1;
        double sum = 0;
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;
            if(max < a) max = a;
        }
        for(int i=0; i<n; i++) {
            sum += (double) arr[i] / max * 100;
        }
        System.out.print(sum/n);
        bw.flush();
        bw.close();
    }
}