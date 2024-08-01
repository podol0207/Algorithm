import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int total = 0;
        for(int i=0; i<n; i++) {
            int sum = 0;
            for(int j=0; j<=i; j++) {
                sum += arr[j];
            }
            total += sum;
        }
        bw.write(total + "\n");

        bw.flush();
        bw.close();
    }
}