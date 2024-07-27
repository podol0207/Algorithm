import java.io.*;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if(first_abs == second_abs) {
                return o1 > o2 ? 1 : -1;
            }
            return first_abs - second_abs;
        });

        for(int i=0; i<N; i++) {
            int request = Integer.parseInt(br.readLine());
            if(request == 0) {
                if(pq.isEmpty()) {
                    bw.write(0 + "\n");
                } else {
                    bw.write(pq.poll() + "\n");
                }
            } else pq.add(request);
        }
        bw.flush();
        bw.close();
    }
}