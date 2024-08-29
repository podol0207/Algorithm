import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int white = 0;
    static int blue = 0;
    static boolean[][] board;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        board = new boolean[n][n];
        StringTokenizer st;

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                int a = Integer.parseInt(st.nextToken());
                if(a!=0) board[i][j] = true;
            }
        }
        partition(0, 0, n);
        bw.write(white + "\n");
        bw.write(blue + "\n");

        bw.flush();
        bw.close();
    }
    private static void partition(int r, int c, int size) {

        if(colorCheck(r, c, size)) {
            if(board[r][c]) {
                blue++;
            } else {
                white++;
            }
            return;
        }
        int newSize = size/2;
        partition(r, c, newSize);
        partition(r, c+newSize, newSize);
        partition(r+newSize, c, newSize);
        partition(r+newSize, c+newSize, newSize);
    }


    private static boolean colorCheck(int r, int c, int size) {

        boolean color = board[r][c];

        for(int i=r; i<r+size; i++) {
            for(int j=c; j<c+size; j++) {
                if(board[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }
}