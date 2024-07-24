import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);
        int count = 0;
        int i = 0;
        int j = N-1;
        int sum = num[i] + num[j];
        while(i<j) {
            if(sum < M) {
                i++;
                sum = num[i] + num[j];
            } else if(sum > M) {
                j--;
                sum = num[i] + num[j];
            } else {
                count++;
                i++;
                j--;
                sum = num[i] + num[j];
            }
        }
        bw.write(count + "\n");
        bw.close();
    }
}