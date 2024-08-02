import java.io.*;

public class Main {
    static int answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String[] split = input.split("-");
        for(int i=0; i<split.length; i++){
            int temp = mySum(split[i]);
            if(i == 0){
                answer += temp;
            } else answer -= temp;
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    private static int mySum(String s) {
        int sum = 0;
        String[] temp = s.split("[+]");
        for(int i=0; i<temp.length; i++){
            sum += Integer.parseInt(temp[i]);
        }
        return sum;
    }
}