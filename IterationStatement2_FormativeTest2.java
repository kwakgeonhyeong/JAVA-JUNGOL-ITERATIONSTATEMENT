import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int small = Math.min(a, b);
        int large = Math.max(a, b);

        for (int i = small; i <= large; i++) {
            System.out.print(i + " ");
        }
    }
}
