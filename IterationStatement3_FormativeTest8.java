import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < (i - 1) * 2; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
