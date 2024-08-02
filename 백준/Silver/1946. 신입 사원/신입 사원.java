import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            int N = Integer.parseInt(br.readLine());
            int count = 1;
            int work[] = new int[N+1];
            for(int j=0; j<N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                work[a] = b;
            }
            int vot = work[1];

            for(int j=2; j<=N; j++) {
                if(work[j] < vot) {
                    vot = work[j];
                    count++;
                }
            }
            bw.write(count + "\n");
        }

        bw.flush();
        bw.close();
    }
}