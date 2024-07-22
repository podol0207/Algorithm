import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        boolean[][] square = new boolean[101][101];
        int trueCount = 0;
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for(int j=x; j<x+10; j++) {
                for(int k=y; k<y+10; k++) {
                    if(!square[j][k]) {
                        square[j][k] = true;
                        trueCount++;
                    }
                }
            }
        }
        bw.write(trueCount + "\n");
        bw.close();
    }
}