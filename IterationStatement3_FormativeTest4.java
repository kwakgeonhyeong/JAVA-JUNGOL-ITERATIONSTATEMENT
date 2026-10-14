import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            printLine(n, i);
        }
        for (int i = 2; i <= n; i++) {
            printLine(n, i);
        }
    }

    public static void printLine(int n, int i) {
        for (int s = 0; s < n - i; s++) {
            System.out.print(" ");
        }
        for (int k = 0; k < 2 * i - 1; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
