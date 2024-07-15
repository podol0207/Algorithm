import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String c = String.valueOf(b);
        String[] numbers = c.split("");

        Integer.parseInt(numbers[1]);
        Integer.parseInt(numbers[2]);
        System.out.println(a * Integer.parseInt(numbers[2]));
        System.out.println(a * Integer.parseInt(numbers[1]));
        System.out.println(a * Integer.parseInt(numbers[0]));
        System.out.println(a * 100*Integer.parseInt(numbers[0]) + a * 10 * Integer.parseInt(numbers[1]) + a * Integer.parseInt(numbers[2]));
    }
}