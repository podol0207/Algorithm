import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        while(!(line = br.readLine()).equals(".")) {
            boolean now = true;
            char[] word = line.toCharArray();
            Stack<Character> stack = new Stack<>();
            for(int i=0; i<word.length; i++) {
                if(word[i] == '(' || word[i] == '[') {
                    stack.push(word[i]);
                } else if(word[i] == ')') {
                    if(stack.isEmpty() || stack.peek() != '(') {
                        now = false;
                    } else stack.pop();
                } else if(word[i] == ']') {
                    if(stack.isEmpty() || stack.peek() != '[') {
                        now = false;
                    } else stack.pop();
                }
            }
            if(!stack.isEmpty()) {
                now = false;
            }
            if(now) bw.write("yes\n");
            else bw.write("no\n");
        }
        bw.flush();
        bw.close();
    }
}