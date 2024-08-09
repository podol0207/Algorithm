import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] card = new int[n];
        for(int i=0; i<n; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(card);
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++) {
            int num = Integer.parseInt(st.nextToken());
            int count = upperBound(card, num) - lowerBound(card, num);
            bw.write(count + " ");
        }
        bw.flush();
        bw.close();
    }

    private static int lowerBound(int[] card, int num) {
        int low = 0;
        int high = card.length;
        while(low<high) {
            int mid = (low+high)/2;
            if(card[mid] >= num) {
                high = mid;
            } else {
                low = mid+1;
            }
        }
        return low;
    }

    private static int upperBound(int[] card, int num) {
        int low = 0;
        int high = card.length;

        while(low<high) {
            int mid = (low+high)/2;
            if(card[mid] > num) {
                high = mid;
            } else {
                low = mid+1;
            }
        }
        return low;
    }
}