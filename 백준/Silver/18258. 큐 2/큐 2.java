import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        LinkedList<Integer> q = new LinkedList<>();
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();

            switch(a) {
                case "push":
                    q.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if(q.isEmpty()) {
                        bw.write("-1" + "\n");
                    } else {
                        int temp = q.poll();
                        bw.write(temp + "\n");
                    }
                    break;
                case "size":
                    bw.write(q.size() + "\n");
                    break;
                case "empty":
                    if(q.isEmpty()) {
                        bw.write("1" + "\n");
                    } else bw.write("0" + "\n");
                    break;
                case "front":
                    if(q.isEmpty()) {
                        bw.write("-1" + "\n");
                    } else bw.write(q.peek() + "\n");
                    break;
                case "back":
                    if(q.isEmpty()) {
                        bw.write("-1" + "\n");
                    } else bw.write(q.get(q.size()-1)+ "\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
    }
}