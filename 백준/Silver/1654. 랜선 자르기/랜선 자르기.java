import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] line = new int[k];
        long max = 0;
        for(int i=0; i<k; i++) {
            line[i] = Integer.parseInt(br.readLine());
            if(max < line[i]) {
                max = line[i];
            }
        }
        max++;

        long min = 1;
        long mid;
        while(min < max) {
            mid = (min + max)/2;
            long count = 0;
            for(int i=0; i<line.length; i++) {
                count += (line[i]/mid);
            }
            if(count < n) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        bw.write(min-1 + "\n");
        bw.flush();
        bw.close();
    }
}