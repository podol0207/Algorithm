import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int[] arr;
        int testcase = Integer.parseInt(br.readLine());
        for(int i=0; i<testcase; i++) {
            st = new StringTokenizer(br.readLine());
            
            int N = Integer.parseInt(st.nextToken());
            arr = new int[N];
            
            double sum = 0;
            for(int j=0; j<N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }
            double count = 0;
            double avg = sum/N;
            for(int j=0; j<N; j++) {
                if(arr[j] > avg) count++;
            }
            bw.write(String.format("%.3f", count/N * 100) + "%\n");
        }
        bw.flush();
        bw.close();
    }
}