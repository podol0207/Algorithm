import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        
        for(int i=0; i<T; i++) {
            String[] str = br.readLine().split(" ");
            int count = Integer.parseInt(str[0]);
            String word = str[1];
            
            for(int j=0; j<word.length(); j++) {
                for(int k=0; k<count; k++) {
                    bw.write(word.charAt(j));
                }
            }
            bw.write("\n");
        }
        bw.close();
    }
}