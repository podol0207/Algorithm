import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        int cc = 1;
        int pcs = 0;
        while(true) {
            if(x <= pcs + cc) {
                if(cc%2 == 1) {
                    System.out.println(cc-(x-pcs-1) + "/" + (x-pcs));
                    break;
                }
                else {
                    System.out.println((x-pcs) + "/" + (cc-(x-pcs-1)));
                    break;
                }
            } else {
                pcs += cc;
                cc++;
            }
        }

        bw.flush();
        bw.close();
    }
}