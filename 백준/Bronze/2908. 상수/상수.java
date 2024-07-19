import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] arr = br.readLine().split(" ");
        int A = Integer.parseInt(new StringBuilder(arr[0]).reverse().toString());
        int B = Integer.parseInt(new StringBuilder(arr[1]).reverse().toString());

        bw.write(String.valueOf(Math.max(A, B)));
        bw.close();
    }
}