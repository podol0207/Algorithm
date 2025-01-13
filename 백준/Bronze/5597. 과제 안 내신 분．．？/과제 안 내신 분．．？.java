import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] register = new boolean[30];
        for(int i=0; i<28; i++) {
            int stu = Integer.parseInt(br.readLine());
            register[stu-1] = true;
        }
        for(int i=0; i<30; i++) {
            if(!register[i]) bw.write(i+1 + "\n");
        }

        bw.flush();
        bw.close();
    }
}