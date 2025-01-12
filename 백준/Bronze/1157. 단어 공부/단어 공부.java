import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        word = word.toUpperCase();
        int[] arr = new int[26];

        for(int i=0; i<word.length(); i++) {
                arr[word.charAt(i) - 'A']++;
        }

        int max = -1;
        char ch = '?';
        for(int i=0; i<26; i++) {
            if(arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 'A');
            }
            else if(arr[i] == max) {
                ch = '?';
            }
        }

        bw.write(ch + "\n");


        bw.flush();
        bw.close();
    }
}