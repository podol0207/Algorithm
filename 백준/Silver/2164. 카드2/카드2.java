import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=1; i<=N; i++) {
            queue.add(i);
        }
        while(queue.size() > 1) {
            queue.poll();
            int temp = queue.poll();
            queue.add(temp);
        }
        bw.write(queue.poll() + "\n");
        bw.flush();
        bw.close();
    }
}