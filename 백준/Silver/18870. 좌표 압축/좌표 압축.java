import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] sorted = new int[n];
        HashMap<Integer, Integer> rank = new HashMap<Integer, Integer>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            sorted[i] = arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sorted);
        int ranking = 0;
        for (int i : sorted) {
            if(!rank.containsKey(i)){
                rank.put(i, ranking);
                ranking++;
            }
        }
        for(int key : arr) {
            int ranked = rank.get(key);
            bw.write(ranked + " ");
        }

        bw.flush();
        bw.close();
    }
}