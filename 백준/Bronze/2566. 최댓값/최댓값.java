import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr=  new int[9][9];
        int max = -1;
        int maxI = 0;
        int maxJ = 0;

        for(int i=0; i<9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j]>max) {
                    max = arr[i][j];
                    maxI = i + 1;
                    maxJ = j + 1;
                }
            }
        }
        bw.write(max + "\n" + maxI + " " + maxJ + "\n");

        bw.flush();
        bw.close();
    }
}