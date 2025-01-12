import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double total = 0.0;
        double sum = 0.0;
        for(int i=0; i<20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            double x = Double.parseDouble(st.nextToken());
            String y = st.nextToken();
            switch(y) {
                case "A+":
                    sum += x * 4.5;
                    break;
                case "A0":
                    sum += x * 4.0;
                    break;
                case "B+":
                    sum += x * 3.5;
                    break;
                case "B0":
                    sum += x * 3.0;
                    break;
                case "C+":
                    sum += x * 2.5;
                    break;
                case "C0":
                    sum += x * 2.0;
                    break;
                case "D+":
                    sum += x * 1.5;
                    break;
                case "D0":
                    sum += x;
                    break;
                case "F":
                    sum += x * 0.0;
                    break;
                case "P":
                    sum += x * 0.0;
                    total -= x;
                    break;
            }
            total += x;
        }
        double ans = sum / total;
        bw.write(ans + "\n");

        bw.flush();
        bw.close();
    }
}