import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        int min = 0;
        int max = 0;
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        while(min < max) {
            int mid = (min + max) / 2;
            long sum = 0;
            for (int i : arr) {
                if(i - mid > 0) {
                    sum += (i-mid);
                }
            }
            if(sum < m) {
                max = mid;
            }
            else {
                min = mid + 1;
            }
        }
        bw.write(min-1 + "\n");
        bw.flush();
        bw.close();
    }
}