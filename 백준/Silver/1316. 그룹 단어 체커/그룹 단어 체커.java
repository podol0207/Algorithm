import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        
        for(int i=0; i<N; i++) {
            String word = br.readLine();
            boolean[] check = new boolean[26];
            int prev = -1;
            boolean found = true;
            for(int j=0; j<word.length(); j++) {
                int now = word.charAt(j) - 'a';
                if(prev != now) {
                    if(check[now] == false) {
                        check[now] = true;
                        prev = now;
                    } else {
                        found = false;
                        break;
                    }
                }
            }
            if(found) {
                count++;
            }
        }
        bw.write(count + "\n");
        bw.close();
    }
}