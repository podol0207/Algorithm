import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int num = 1;
        int[] arr = new int[N];
        boolean now = true;
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Stack<Integer> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<N; i++) {
            int s = arr[i];
            if(s>=num) {
                while(s>=num) {
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                int t = stack.pop();
                if(t > s) {
                    bw.write("NO" + "\n");
                    now = false;
                    break;
                } else {
                    sb.append("-\n");
                }
            }
        }
        if(now) {
            bw.write(sb.toString());
        }
        bw.close();
    }
}