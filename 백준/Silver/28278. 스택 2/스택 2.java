import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            switch (a) {
                case "1":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "2":
                    if(stack.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        int x = stack.pop();
                        bw.write(x + "\n");
                    }
                    break;
                case "3":
                    bw.write(stack.size() + "\n");
                    break;
                case "4":
                    if(stack.isEmpty()) {
                        bw.write(1 + "\n");
                    } else bw.write(0 + "\n");
                    break;
                case "5":
                    if(stack.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else bw.write(stack.peek() + "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}