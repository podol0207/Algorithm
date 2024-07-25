import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[] my;
    static int[] check;
    static int checkSecret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        check = new int[4];
        my = new int[4];
        checkSecret = 0;

        int count = 0;

        char[] word = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++) {
            check[i] = Integer.parseInt(st.nextToken());
            if(check[i] == 0) checkSecret++;
        }
        for(int i=0; i<P; i++) {
            Add(word[i]);
        }
        if(checkSecret == 4) count++;

        for(int i=P; i<S; i++) {
            int j = i-P;
            Add(word[i]);
            Delete(word[j]);
            if(checkSecret == 4) count++;
        }

        bw.write(count + "\n");
        bw.close();
    }

    private static void Delete(char word) {
        switch(word) {
            case 'A':
                if(my[0] == check[0]) checkSecret--;
                my[0]--;
                break;
            case 'C':
                if(my[1] == check[1]) checkSecret--;
                my[1]--;
                break;
            case 'G':
                if(my[2] == check[2]) checkSecret--;
                my[2]--;
                break;
            case 'T':
                if(my[3] == check[3]) checkSecret--;
                my[3]--;
                break;
        }
    }

    private static void Add(char word) {
        switch(word) {
            case 'A':
                my[0]++;
                if(my[0] == check[0]) checkSecret++;
                break;
            case 'C':
                my[1]++;
                if(my[1] == check[1]) checkSecret++;
                break;
            case 'G':
                my[2]++;
                if(my[2] == check[2]) checkSecret++;
                break;
            case 'T':
                my[3]++;
                if(my[3] == check[3]) checkSecret++;
                break;
        }
    }
}