import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        for(int i=1; i<n+1; i++) {
            arr[i] = i;
        }
        for(int i=0; i<m; i++) {
            int temp = 0;
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for(int j=a; j<=b; j++) {
                temp = arr[j];
                arr[j] = arr[b];
                arr[b] = temp;
                b--;
            }
        }
        for(int i=1; i<n+1; i++) {
            bw.write(arr[i]+" ");
        }

        bw.flush();
        bw.close();
    }
}