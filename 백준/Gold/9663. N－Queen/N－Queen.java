import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;
    static int n;
    static int count = 0;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        go(0);

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

    private static void go(int x) {
        if(x == n) {
            count++;
            return;
        }
        for(int i=0; i<n; i++) {
            arr[x] = i;
            if(possible(x)) {
                go(x+1);
            }
        }
    }

    private static boolean possible(int x) {
        for(int i=0; i<x; i++) {
            if (arr[x] == arr[i]) {
                return false;
            } else if (Math.abs(x-i) == Math.abs(arr[x] - arr[i])) {
                return false;
            }
        }
        return true;
    }
}