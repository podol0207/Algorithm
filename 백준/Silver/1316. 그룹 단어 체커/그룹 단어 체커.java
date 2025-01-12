import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            if(check() == true) {
                count++;
            }
        }
        bw.write(count + "\n");

        bw.flush();
        bw.close();
    }

    private static boolean check() throws IOException {
        boolean[] check = new boolean[26];
        int prev = 0;
        String word = br.readLine();

        for(int i=0; i<word.length(); i++) {
            int now = word.charAt(i);

            if(prev != now) {
                if(check[now-'a'] == false) {
                    check[now-'a'] = true;
                    prev = now;
                }
                else {
                    return false;
                }
            } 
        }
        return true;
    }
}