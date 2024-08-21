import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] A = new String[n];
        for(int i=0; i<n; i++) {
             A[i] = br.readLine();
        }
        Arrays.sort(A, new Comparator<String>() {
            public int compare(String s1, String s2) {
                if(s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                } else {
                    return s1.length() - s2.length();
                }
            }
        });
        bw.write(A[0] + "\n");
        for(int i=1; i<n; i++) {
            if(!A[i].equals(A[i-1])) {
                bw.write(A[i] + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}