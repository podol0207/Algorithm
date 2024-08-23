import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Set<Integer> list = new HashSet<>();
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch(s) {
                case "add" :
                    list.add(Integer.parseInt(st.nextToken()));
                    continue;
                case "remove" :
                    list.remove(Integer.parseInt(st.nextToken()));
                        continue;
                case "check" :
                    if(list.contains(Integer.parseInt(st.nextToken()))) {
                        bw.write(1 + "\n");
                    } else {
                        bw.write(0 + "\n");
                    }
                    continue;
                case "toggle" :
                    int a = Integer.parseInt(st.nextToken());
                    if(list.contains(a)) {
                        list.remove(a);
                    } else {
                        list.add(a);
                    }
                    continue;
                case "all" :
                    list.clear();
                    for(int j=1; j<=20; j++) {
                        list.add(j);
                    }
                    continue;
                case "empty" :
                    list.clear();
                    continue;
            }
        }

        bw.flush();
        bw.close();
    }
}