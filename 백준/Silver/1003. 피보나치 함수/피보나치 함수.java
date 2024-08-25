import java.io.*;

public class Main {
    static BufferedWriter bw;
    static int[] dp0, dp1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        // 최대 n을 설정해서 dp 배열을 초기화
        dp0 = new int[41];  // n이 최대 40이므로 41 크기 배열을 생성
        dp1 = new int[41];

        // 초기 값 설정
        dp0[0] = 1;
        dp1[0] = 0;
        dp0[1] = 0;
        dp1[1] = 1;

        // DP로 미리 피보나치 수 계산
        for (int i = 2; i <= 40; i++) {
            dp0[i] = dp0[i - 1] + dp0[i - 2];
            dp1[i] = dp1[i - 1] + dp1[i - 2];
        }

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(dp0[n] + " " + dp1[n] + "\n");
        }

        bw.flush();
        bw.close();
    }
}