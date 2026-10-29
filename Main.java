import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int quantidade = 0;
        for (int a = n - 2; a >= 1; a--) {
            for (int b = Math.min(a, n - a - 1); b >= 1; b--) {
                int c = n - a - b;

                if (c > 0 && b >= c) {
                    System.out.println(a + " " + b + " " + c);
                    quantidade++;
                }
            }
        }
    }
}