import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int s = 0; s < (n - i) * 2; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
