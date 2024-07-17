import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int max = Integer.MIN_VALUE;
        int[] arr = new int[9];
        int count = 0;
        for (int i=0; i<9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] > max) {
                max = arr[i];
                count = i+1;
            }
        }
        bw.write(max + "\n" + count);
        bw.close();
    }
}