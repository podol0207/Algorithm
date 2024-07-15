import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int h = 60 * a;
        int m = b;
        if((h + m + c) / 60 < 24) {
            System.out.println((h + m + c) / 60 + " " + (h + m + c) % 60);
        } else {
            System.out.println(((h + m + c) / 60) - 24+ " " + (h + m + c) % 60);
        }
    }
}