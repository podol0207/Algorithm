import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        for (int i = 2; i <= n; i++) {
            arr[i] = i;
        }
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(arr[i]==0) continue;
            for(int j=i+i; j<=n; j=j+i) {
                arr[j] = 0;
            }
        }
        for(int i=m; i<=n; i++) {
            if(arr[i]!=0) bw.write(arr[i]+"\n");
        }

        bw.flush();
        bw.close();
    }
}