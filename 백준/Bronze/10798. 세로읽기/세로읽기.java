import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Character[][] arr = new Character[5][15];
        for(int i=0; i<5; i++) {
            String line = br.readLine();
            for(int j=0; j<line.length(); j++) {
                arr[i][j] = line.charAt(j);
            }
        }
        for(int i=0; i<15; i++) {
            for(int j=0; j<5; j++) {
                if(arr[j][i]!=null) {
                    System.out.print(arr[j][i]);
                }
            }
        }

        bw.flush();
        bw.close();
    }
}