import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int num = 1;
        int[] student = new int[N];

        for(int i=0; i<N; i++) {
            student[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<N; i++) {
                if(student[i] != num) {
                    if(!stack.isEmpty() && stack.peek() == num){
                        stack.pop();
                        i--;
                        num++;
                    } else {
                        stack.push(student[i]);
                    }
                } else {
                    num++;
                }
        }
        boolean flag = true;

        for(int i=0; i<stack.size(); i++) {
            int stu = stack.pop();
            if(stu == num) {
                num++;
            } else {
                flag = false;
                break;
            }
        }
        if(flag) {
            bw.write("Nice\n");
        } else {
            bw.write("Sad\n");
        }
        bw.flush();
        bw.close();
    }
}