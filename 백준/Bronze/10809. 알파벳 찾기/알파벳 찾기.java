import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        int[] arr = new int[26];

        for(int i=0; i<arr.length; i++) {
            arr[i] = -1;
        }

        for(int i=0; i<word.length(); i++) {
            char c = word.charAt(i);
            if(arr[c-'a'] == -1) {
                arr[c-'a'] = i;
            }
        }
        for(int val : arr) {
            bw.write(val + " ");
        }


        bw.flush();
        bw.close();
    }
}