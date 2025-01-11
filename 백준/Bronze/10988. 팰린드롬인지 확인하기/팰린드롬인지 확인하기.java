import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        int ans = 1;

        for(int i=0; i<word.length()/2; i++) {
            if(word.charAt(i) != word.charAt(word.length()-i-1)) {
                ans = 0;
            }
        }
        bw.write(ans + "\n");


        bw.flush();
        bw.close();
    }
}