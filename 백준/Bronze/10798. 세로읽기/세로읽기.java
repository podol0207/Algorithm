import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        char[][] str = new char[5][15];
        int max = 0;
        
        for(int i=0; i<5; i++) {
            String word = br.readLine();
            if(word.length()>max) max = word.length();
            
            for(int j=0; j<word.length(); j++) {
                str[i][j] = word.charAt(j);
            }
        }
        
        for(int i=0; i<max; i++) {
            for(int j=0; j<5; j++) {
                if(i<str[j].length && str[j][i] != '\0') {
                   bw.write(str[j][i]);
                }
            }
        }
        bw.close();
    }
}