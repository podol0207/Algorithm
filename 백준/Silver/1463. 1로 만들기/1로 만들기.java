import java.io.*;

public class Main {

    static Integer[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        arr = new Integer[n+1];
        arr[0] = arr[1] = 0;

        bw.write(recur(n) + "\n");

        bw.flush();
        bw.close();
    }

    static int recur(int n) {
        if(arr[n] == null) {
            if(n%6==0) {
                arr[n] = Math.min(recur(n-1), Math.min(recur(n/3), recur(n/2))) + 1;
            }
            else if(n%3==0) {
                arr[n] = Math.min(recur(n/3), recur(n-1)) + 1;
            } else if(n%2==0) {
                arr[n] = Math.min(recur(n/2), recur(n-1)) + 1;
            } else {
                arr[n] = recur(n-1) + 1;
            }
        }
        return arr[n];
    }
}