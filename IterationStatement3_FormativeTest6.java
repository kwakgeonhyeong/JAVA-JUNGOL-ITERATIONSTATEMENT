import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < (n - i) * 2; s++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if (k > 1) {
                    System.out.print(" ");
                }
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
