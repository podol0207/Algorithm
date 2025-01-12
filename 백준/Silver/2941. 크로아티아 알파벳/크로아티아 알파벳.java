import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        int count = 0;
        int len = word.length();

        for(int i=0; i<len; i++) {

            char ch = word.charAt(i);

            if(ch == 'c' && i < len - 1) {
                if(word.charAt(i+1) == '=' || word.charAt(i+1) == '-') {
                    i++;
                }
            } else if (ch == 'd' && i < len - 1) {
                if(word.charAt(i+1) == '-') {
                    i++;
                }
                else if(word.charAt(i+1) == 'z' && i < len - 2) {
                    if(word.charAt(i+2) == '=') {
                        i += 2;
                    }
                }
            } else if((ch == 'l' || ch == 'n') && i < len - 1) {
                if(word.charAt(i+1) == 'j') {
                    i++;
                }
            } else if((ch == 's' || ch == 'z') && i < len - 1) {
                if(word.charAt(i+1) == '=') {
                    i++;
                }
            }
            count++;
        }
        bw.write(count + "\n");

        bw.flush();
        bw.close();
    }
}