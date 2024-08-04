import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean t = true;
        while (t) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) {
                t = false;
                break;
            }
            boolean[] arr = new boolean[2*n+1];
            for(int i=2; i<=Math.sqrt(2*n); i++) {
                if(!arr[i]) {
                    for (int j = i + i; j <= 2 * n; j = j + i) {
                        arr[j] = true;
                    }
                }
            }
            int count = 0;
            for(int i=n+1; i<=2*n; i++) {
                if(arr[i] == false) count++;
            }
            bw.write(count + "\n");
        }

        bw.flush();
        bw.close();
    }
}